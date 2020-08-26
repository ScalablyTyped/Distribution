package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDevice
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerPoint extends js.Object {
  var frameId: Double = js.native
  var isInContact: Boolean = js.native
  var pointerDevice: PointerDevice = js.native
  var pointerId: Double = js.native
  var position: Point = js.native
  var properties: PointerPointProperties = js.native
  var rawPosition: Point = js.native
  var timestamp: Double = js.native
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
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], isInContact = isInContact.asInstanceOf[js.Any], pointerDevice = pointerDevice.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rawPosition = rawPosition.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerPoint]
  }
  @scala.inline
  implicit class IPointerPointOps[Self <: IPointerPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInContact(value: Boolean): Self = this.set("isInContact", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerDevice(value: PointerDevice): Self = this.set("pointerDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: PointerPointProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawPosition(value: Point): Self = this.set("rawPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

