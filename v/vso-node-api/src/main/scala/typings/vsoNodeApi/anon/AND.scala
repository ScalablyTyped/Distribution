package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AND extends js.Object {
  var aND: scala.Double = js.native
  var nONE: scala.Double = js.native
  var oR: scala.Double = js.native
}

object AND {
  @scala.inline
  def apply(aND: scala.Double, nONE: scala.Double, oR: scala.Double): AND = {
    val __obj = js.Dynamic.literal(aND = aND.asInstanceOf[js.Any], nONE = nONE.asInstanceOf[js.Any], oR = oR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AND]
  }
  @scala.inline
  implicit class ANDOps[Self <: AND] (val x: Self) extends AnyVal {
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
    def setAND(value: scala.Double): Self = this.set("aND", value.asInstanceOf[js.Any])
    @scala.inline
    def setNONE(value: scala.Double): Self = this.set("nONE", value.asInstanceOf[js.Any])
    @scala.inline
    def setOR(value: scala.Double): Self = this.set("oR", value.asInstanceOf[js.Any])
  }
  
}

