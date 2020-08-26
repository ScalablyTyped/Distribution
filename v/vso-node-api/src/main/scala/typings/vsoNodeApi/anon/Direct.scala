package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direct extends js.Object {
  var direct: scala.Double = js.native
  var expanded: scala.Double = js.native
  var expandedDown: scala.Double = js.native
  var expandedUp: scala.Double = js.native
  var none: scala.Double = js.native
}

object Direct {
  @scala.inline
  def apply(
    direct: scala.Double,
    expanded: scala.Double,
    expandedDown: scala.Double,
    expandedUp: scala.Double,
    none: scala.Double
  ): Direct = {
    val __obj = js.Dynamic.literal(direct = direct.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], expandedDown = expandedDown.asInstanceOf[js.Any], expandedUp = expandedUp.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direct]
  }
  @scala.inline
  implicit class DirectOps[Self <: Direct] (val x: Self) extends AnyVal {
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
    def setDirect(value: scala.Double): Self = this.set("direct", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: scala.Double): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedDown(value: scala.Double): Self = this.set("expandedDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedUp(value: scala.Double): Self = this.set("expandedUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

