package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direct extends js.Object {
  var direct: scala.Double
  var expanded: scala.Double
  var expandedDown: scala.Double
  var expandedUp: scala.Double
  var none: scala.Double
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
}

