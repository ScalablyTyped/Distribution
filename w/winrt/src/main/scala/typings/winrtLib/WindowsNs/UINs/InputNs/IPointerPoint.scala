package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPoint extends js.Object {
  var frameId: scala.Double
  var isInContact: scala.Boolean
  var pointerDevice: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDevice
  var pointerId: scala.Double
  var position: winrtLib.WindowsNs.FoundationNs.Point
  var properties: PointerPointProperties
  var rawPosition: winrtLib.WindowsNs.FoundationNs.Point
  var timestamp: scala.Double
}

object IPointerPoint {
  @scala.inline
  def apply(
    frameId: scala.Double,
    isInContact: scala.Boolean,
    pointerDevice: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDevice,
    pointerId: scala.Double,
    position: winrtLib.WindowsNs.FoundationNs.Point,
    properties: PointerPointProperties,
    rawPosition: winrtLib.WindowsNs.FoundationNs.Point,
    timestamp: scala.Double
  ): IPointerPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("isInContact")(isInContact)
    __obj.updateDynamic("pointerDevice")(pointerDevice)
    __obj.updateDynamic("pointerId")(pointerId)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("rawPosition")(rawPosition)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[IPointerPoint]
  }
}

