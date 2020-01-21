package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cWebUsb.w3cWebUsbStrings.device
  - typings.w3cWebUsb.w3cWebUsbStrings.interface
  - typings.w3cWebUsb.w3cWebUsbStrings.endpoint
  - typings.w3cWebUsb.w3cWebUsbStrings.other
*/
trait USBRecipient extends js.Object

object USBRecipient {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def device: typings.w3cWebUsb.w3cWebUsbStrings.device = this.cast("device")
  @scala.inline
  def endpoint: typings.w3cWebUsb.w3cWebUsbStrings.endpoint = this.cast("endpoint")
  @scala.inline
  def interface: typings.w3cWebUsb.w3cWebUsbStrings.interface = this.cast("interface")
  @scala.inline
  def other: typings.w3cWebUsb.w3cWebUsbStrings.other = this.cast("other")
}

