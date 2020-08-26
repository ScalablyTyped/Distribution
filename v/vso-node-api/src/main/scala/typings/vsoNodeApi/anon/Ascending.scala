package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ascending extends js.Object {
  var ascending: scala.Double = js.native
  var default: scala.Double = js.native
  var descending: scala.Double = js.native
}

object Ascending {
  @scala.inline
  def apply(ascending: scala.Double, default: scala.Double, descending: scala.Double): Ascending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ascending]
  }
  @scala.inline
  implicit class AscendingOps[Self <: Ascending] (val x: Self) extends AnyVal {
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
    def setAscending(value: scala.Double): Self = this.set("ascending", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: scala.Double): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescending(value: scala.Double): Self = this.set("descending", value.asInstanceOf[js.Any])
  }
  
}

