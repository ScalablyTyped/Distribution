package typings.venn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setid extends js.Object {
  var setid: String = js.native
}

object Setid {
  @scala.inline
  def apply(setid: String): Setid = {
    val __obj = js.Dynamic.literal(setid = setid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setid]
  }
  @scala.inline
  implicit class SetidOps[Self <: Setid] (val x: Self) extends AnyVal {
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
    def setSetid(value: String): Self = this.set("setid", value.asInstanceOf[js.Any])
  }
  
}

