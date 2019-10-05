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
    val __obj = js.Dynamic.literal(accX = accX, accY = accY, accZ = accZ, angleX = angleX, angleY = angleY, angleZ = angleZ, contentX = contentX, contentY = contentY, dirXx = dirXx, dirXy = dirXy, dirXz = dirXz, dirYx = dirYx, dirYy = dirYy, dirYz = dirYz, dirZx = dirZx, dirZy = dirZy, dirZz = dirZz, gyroX = gyroX, gyroY = gyroY, gyroZ = gyroZ, hold = hold, isDataValid = isDataValid, isEnabled = isEnabled, lStickX = lStickX, lStickY = lStickY, rStickX = rStickX, rStickY = rStickY, tpTouch = tpTouch, tpValidity = tpValidity, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[WiiuGamePad]
  }
}

