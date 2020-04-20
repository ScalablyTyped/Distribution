package typings.wiiu.wiiu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiiuGamePad extends js.Object {
  var accX: Double
  var accY: Double
  var accZ: Double
  var angleX: Double
  var angleY: Double
  var angleZ: Double
  var contentX: Double
  var contentY: Double
  var dirXx: Double
  var dirXy: Double
  var dirXz: Double
  var dirYx: Double
  var dirYy: Double
  var dirYz: Double
  var dirZx: Double
  var dirZy: Double
  var dirZz: Double
  var gyroX: Double
  var gyroY: Double
  var gyroZ: Double
  var hold: Double
  var isDataValid: Boolean
  var isEnabled: Boolean
  var lStickX: Double
  var lStickY: Double
  var rStickX: Double
  var rStickY: Double
  var tpTouch: Boolean
  var tpValidity: Double
  def update(): WiiuGamePad
}

object WiiuGamePad {
  @scala.inline
  def apply(
    accX: Double,
    accY: Double,
    accZ: Double,
    angleX: Double,
    angleY: Double,
    angleZ: Double,
    contentX: Double,
    contentY: Double,
    dirXx: Double,
    dirXy: Double,
    dirXz: Double,
    dirYx: Double,
    dirYy: Double,
    dirYz: Double,
    dirZx: Double,
    dirZy: Double,
    dirZz: Double,
    gyroX: Double,
    gyroY: Double,
    gyroZ: Double,
    hold: Double,
    isDataValid: Boolean,
    isEnabled: Boolean,
    lStickX: Double,
    lStickY: Double,
    rStickX: Double,
    rStickY: Double,
    tpTouch: Boolean,
    tpValidity: Double,
    update: () => WiiuGamePad
  ): WiiuGamePad = {
    val __obj = js.Dynamic.literal(accX = accX.asInstanceOf[js.Any], accY = accY.asInstanceOf[js.Any], accZ = accZ.asInstanceOf[js.Any], angleX = angleX.asInstanceOf[js.Any], angleY = angleY.asInstanceOf[js.Any], angleZ = angleZ.asInstanceOf[js.Any], contentX = contentX.asInstanceOf[js.Any], contentY = contentY.asInstanceOf[js.Any], dirXx = dirXx.asInstanceOf[js.Any], dirXy = dirXy.asInstanceOf[js.Any], dirXz = dirXz.asInstanceOf[js.Any], dirYx = dirYx.asInstanceOf[js.Any], dirYy = dirYy.asInstanceOf[js.Any], dirYz = dirYz.asInstanceOf[js.Any], dirZx = dirZx.asInstanceOf[js.Any], dirZy = dirZy.asInstanceOf[js.Any], dirZz = dirZz.asInstanceOf[js.Any], gyroX = gyroX.asInstanceOf[js.Any], gyroY = gyroY.asInstanceOf[js.Any], gyroZ = gyroZ.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], isDataValid = isDataValid.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lStickX = lStickX.asInstanceOf[js.Any], lStickY = lStickY.asInstanceOf[js.Any], rStickX = rStickX.asInstanceOf[js.Any], rStickY = rStickY.asInstanceOf[js.Any], tpTouch = tpTouch.asInstanceOf[js.Any], tpValidity = tpValidity.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[WiiuGamePad]
  }
}

