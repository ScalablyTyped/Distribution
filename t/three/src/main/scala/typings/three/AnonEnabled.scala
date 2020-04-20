package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  var enabled: Boolean
  var fullHeight: Double
  var fullWidth: Double
  var height: Double
  var offsetX: Double
  var offsetY: Double
  var width: Double
}

object AnonEnabled {
  @scala.inline
  def apply(
    enabled: Boolean,
    fullHeight: Double,
    fullWidth: Double,
    height: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double
  ): AnonEnabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fullHeight = fullHeight.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabled]
  }
}

