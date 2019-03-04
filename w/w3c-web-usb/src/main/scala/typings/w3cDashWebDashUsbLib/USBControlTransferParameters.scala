package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBControlTransferParameters extends js.Object {
  var index: scala.Double
  var recipient: USBRecipient
  var request: scala.Double
  var requestType: USBRequestType
  var value: scala.Double
}

object USBControlTransferParameters {
  @scala.inline
  def apply(
    index: scala.Double,
    recipient: USBRecipient,
    request: scala.Double,
    requestType: USBRequestType,
    value: scala.Double
  ): USBControlTransferParameters = {
    val __obj = js.Dynamic.literal(index = index, recipient = recipient, request = request, requestType = requestType, value = value)
  
    __obj.asInstanceOf[USBControlTransferParameters]
  }
}

