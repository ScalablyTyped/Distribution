package typings.vueDashSplitpane.vueDashSplitpaneMod

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
    val __obj = js.Dynamic.literal(active = active, hasMoved = hasMoved, height = height, percent = percent, resizeType = resizeType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SplitpaneData]
  }
}

