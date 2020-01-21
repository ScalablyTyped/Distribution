package typings.vueSplitpane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneData extends js.Object {
  var active: Boolean
  var hasMoved: Boolean
  var height: js.Any
   // null number string
  var percent: Double
  var resizeType: String
  var `type`: String
}

object SplitpaneData {
  @scala.inline
  def apply(
    active: Boolean,
    hasMoved: Boolean,
    height: js.Any,
    percent: Double,
    resizeType: String,
    `type`: String
  ): SplitpaneData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hasMoved = hasMoved.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], resizeType = resizeType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneData]
  }
}

