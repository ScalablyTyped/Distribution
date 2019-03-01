package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorePhysicalKeyStatus extends js.Object {
  var isExtendedKey: scala.Boolean
  var isKeyReleased: scala.Boolean
  var isMenuKeyDown: scala.Boolean
  var repeatCount: scala.Double
  var scanCode: scala.Double
  var wasKeyDown: scala.Boolean
}

object CorePhysicalKeyStatus {
  @scala.inline
  def apply(
    isExtendedKey: scala.Boolean,
    isKeyReleased: scala.Boolean,
    isMenuKeyDown: scala.Boolean,
    repeatCount: scala.Double,
    scanCode: scala.Double,
    wasKeyDown: scala.Boolean
  ): CorePhysicalKeyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isExtendedKey")(isExtendedKey)
    __obj.updateDynamic("isKeyReleased")(isKeyReleased)
    __obj.updateDynamic("isMenuKeyDown")(isMenuKeyDown)
    __obj.updateDynamic("repeatCount")(repeatCount)
    __obj.updateDynamic("scanCode")(scanCode)
    __obj.updateDynamic("wasKeyDown")(wasKeyDown)
    __obj.asInstanceOf[CorePhysicalKeyStatus]
  }
}

