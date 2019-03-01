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
    update: js.Function0[WiiuGamePad]
  ): WiiuGamePad = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accX")(accX)
    __obj.updateDynamic("accY")(accY)
    __obj.updateDynamic("accZ")(accZ)
    __obj.updateDynamic("angleX")(angleX)
    __obj.updateDynamic("angleY")(angleY)
    __obj.updateDynamic("angleZ")(angleZ)
    __obj.updateDynamic("contentX")(contentX)
    __obj.updateDynamic("contentY")(contentY)
    __obj.updateDynamic("dirXx")(dirXx)
    __obj.updateDynamic("dirXy")(dirXy)
    __obj.updateDynamic("dirXz")(dirXz)
    __obj.updateDynamic("dirYx")(dirYx)
    __obj.updateDynamic("dirYy")(dirYy)
    __obj.updateDynamic("dirYz")(dirYz)
    __obj.updateDynamic("dirZx")(dirZx)
    __obj.updateDynamic("dirZy")(dirZy)
    __obj.updateDynamic("dirZz")(dirZz)
    __obj.updateDynamic("gyroX")(gyroX)
    __obj.updateDynamic("gyroY")(gyroY)
    __obj.updateDynamic("gyroZ")(gyroZ)
    __obj.updateDynamic("hold")(hold)
    __obj.updateDynamic("isDataValid")(isDataValid)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("lStickX")(lStickX)
    __obj.updateDynamic("lStickY")(lStickY)
    __obj.updateDynamic("rStickX")(rStickX)
    __obj.updateDynamic("rStickY")(rStickY)
    __obj.updateDynamic("tpTouch")(tpTouch)
    __obj.updateDynamic("tpValidity")(tpValidity)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[WiiuGamePad]
  }
}

