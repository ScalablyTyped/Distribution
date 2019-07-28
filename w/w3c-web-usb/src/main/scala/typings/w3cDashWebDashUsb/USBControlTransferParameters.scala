package typings.w3cDashWebDashUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBControlTransferParameters extends js.Object {
  var index: Double
  var recipient: USBRecipient
  var request: Double
  var requestType: USBRequestType
  var value: Double
}

object USBControlTransferParameters {
  @scala.inline
  def apply(
    index: Double,
    recipient: USBRecipient,
    request: Double,
    requestType: USBRequestType,
    value: Double
  ): USBControlTransferParameters = {
    val __obj = js.Dynamic.literal(index = index, recipient = recipient, request = request, requestType = requestType, value = value)
  
    __obj.asInstanceOf[USBControlTransferParameters]
  }
}

