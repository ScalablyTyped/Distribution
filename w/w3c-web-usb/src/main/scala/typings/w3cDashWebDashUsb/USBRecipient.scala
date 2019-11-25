package typings.w3cDashWebDashUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.device
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.interface
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.endpoint
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.other
*/
trait USBRecipient extends js.Object

object USBRecipient {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def device: typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.device = this.cast("device")
  @scala.inline
  def endpoint: typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.endpoint = this.cast("endpoint")
  @scala.inline
  def interface: typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.interface = this.cast("interface")
  @scala.inline
  def other: typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.other = this.cast("other")
}

