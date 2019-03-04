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
    val __obj = js.Dynamic.literal(frameId = frameId, isInContact = isInContact, pointerDevice = pointerDevice, pointerId = pointerId, position = position, properties = properties, rawPosition = rawPosition, timestamp = timestamp)
  
    __obj.asInstanceOf[IPointerPoint]
  }
}

