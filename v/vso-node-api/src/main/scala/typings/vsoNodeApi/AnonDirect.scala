package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirect extends js.Object {
  var direct: Double
  var expanded: Double
  var expandedDown: Double
  var expandedUp: Double
  var none: Double
}

object AnonDirect {
  @scala.inline
  def apply(direct: Double, expanded: Double, expandedDown: Double, expandedUp: Double, none: Double): AnonDirect = {
    val __obj = js.Dynamic.literal(direct = direct.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], expandedDown = expandedDown.asInstanceOf[js.Any], expandedUp = expandedUp.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirect]
  }
}

