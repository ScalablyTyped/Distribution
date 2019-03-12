package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiiuGamePad extends js.Object {
  var accX: scala.Double
  var accY: scala.Double
  var accZ: scala.Double
  var angleX: scala.Double
  var angleY: scala.Double
  var angleZ: scala.Double
  var contentX: scala.Double
  var contentY: scala.Double
  var dirXx: scala.Double
  var dirXy: scala.Double
  var dirXz: scala.Double
  var dirYx: scala.Double
  var dirYy: scala.Double
  var dirYz: scala.Double
  var dirZx: scala.Double
  var dirZy: scala.Double
  var dirZz: scala.Double
  var gyroX: scala.Double
  var gyroY: scala.Double
  var gyroZ: scala.Double
  var hold: scala.Double
  var isDataValid: scala.Boolean
  var isEnabled: scala.Boolean
  var lStickX: scala.Double
  var lStickY: scala.Double
  var rStickX: scala.Double
  var rStickY: scala.Double
  var tpTouch: scala.Boolean
  var tpValidity: scala.Double
  def update(): WiiuGamePad
}

object WiiuGamePad {
  @scala.inline
  def apply(
    accX: scala.Double,
    accY: scala.Double,
    accZ: scala.Double,
    angleX: scala.Double,
    angleY: scala.Double,
    angleZ: scala.Double,
    contentX: scala.Double,
    contentY: scala.Double,
    dirXx: scala.Double,
    dirXy: scala.Double,
    dirXz: scala.Double,
    dirYx: scala.Double,
    dirYy: scala.Double,
    dirYz: scala.Double,
    dirZx: scala.Double,
    dirZy: scala.Double,
    dirZz: scala.Double,
    gyroX: scala.Double,
    gyroY: scala.Double,
    gyroZ: scala.Double,
    hold: scala.Double,
    isDataValid: scala.Boolean,
    isEnabled: scala.Boolean,
    lStickX: scala.Double,
    lStickY: scala.Double,
    rStickX: scala.Double,
    rStickY: scala.Double,
    tpTouch: scala.Boolean,
    tpValidity: scala.Double,
    update: () => WiiuGamePad
  ): WiiuGamePad = {
    val __obj = js.Dynamic.literal(accX = accX, accY = accY, accZ = accZ, angleX = angleX, angleY = angleY, angleZ = angleZ, contentX = contentX, contentY = contentY, dirXx = dirXx, dirXy = dirXy, dirXz = dirXz, dirYx = dirYx, dirYy = dirYy, dirYz = dirYz, dirZx = dirZx, dirZy = dirZy, dirZz = dirZz, gyroX = gyroX, gyroY = gyroY, gyroZ = gyroZ, hold = hold, isDataValid = isDataValid, isEnabled = isEnabled, lStickX = lStickX, lStickY = lStickY, rStickX = rStickX, rStickY = rStickY, tpTouch = tpTouch, tpValidity = tpValidity, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[WiiuGamePad]
  }
}

