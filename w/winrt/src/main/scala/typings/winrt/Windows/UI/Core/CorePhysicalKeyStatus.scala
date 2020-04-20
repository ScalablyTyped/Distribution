package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorePhysicalKeyStatus extends js.Object {
  var isExtendedKey: Boolean
  var isKeyReleased: Boolean
  var isMenuKeyDown: Boolean
  var repeatCount: Double
  var scanCode: Double
  var wasKeyDown: Boolean
}

object CorePhysicalKeyStatus {
  @scala.inline
  def apply(
    isExtendedKey: Boolean,
    isKeyReleased: Boolean,
    isMenuKeyDown: Boolean,
    repeatCount: Double,
    scanCode: Double,
    wasKeyDown: Boolean
  ): CorePhysicalKeyStatus = {
    val __obj = js.Dynamic.literal(isExtendedKey = isExtendedKey.asInstanceOf[js.Any], isKeyReleased = isKeyReleased.asInstanceOf[js.Any], isMenuKeyDown = isMenuKeyDown.asInstanceOf[js.Any], repeatCount = repeatCount.asInstanceOf[js.Any], scanCode = scanCode.asInstanceOf[js.Any], wasKeyDown = wasKeyDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorePhysicalKeyStatus]
  }
}

