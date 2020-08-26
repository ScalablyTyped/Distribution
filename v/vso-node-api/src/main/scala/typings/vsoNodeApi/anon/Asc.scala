package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asc extends js.Object {
  var asc: scala.Double = js.native
  var desc: scala.Double = js.native
}

object Asc {
  @scala.inline
  def apply(asc: scala.Double, desc: scala.Double): Asc = {
    val __obj = js.Dynamic.literal(asc = asc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asc]
  }
  @scala.inline
  implicit class AscOps[Self <: Asc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsc(value: scala.Double): Self = this.set("asc", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesc(value: scala.Double): Self = this.set("desc", value.asInstanceOf[js.Any])
  }
  
}

