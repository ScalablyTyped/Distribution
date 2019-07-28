package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDevice
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPoint extends js.Object {
  var frameId: Double
  var isInContact: Boolean
  var pointerDevice: PointerDevice
  var pointerId: Double
  var position: Point
  var properties: PointerPointProperties
  var rawPosition: Point
  var timestamp: Double
}

object IPointerPoint {
  @scala.inline
  def apply(
    frameId: Double,
    isInContact: Boolean,
    pointerDevice: PointerDevice,
    pointerId: Double,
    position: Point,
    properties: PointerPointProperties,
    rawPosition: Point,
    timestamp: Double
  ): IPointerPoint = {
    val __obj = js.Dynamic.literal(frameId = frameId, isInContact = isInContact, pointerDevice = pointerDevice, pointerId = pointerId, position = position, properties = properties, rawPosition = rawPosition, timestamp = timestamp)
  
    __obj.asInstanceOf[IPointerPoint]
  }
}

