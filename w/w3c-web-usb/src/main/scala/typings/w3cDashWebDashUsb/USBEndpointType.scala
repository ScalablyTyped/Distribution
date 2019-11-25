package typings.w3cDashWebDashUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.bulk
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.interrupt
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.isochronous
*/
trait USBEndpointType extends js.Object

object USBEndpointType {
  @scala.inline
  def bulk: typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.bulk = this.cast("bulk")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interrupt: typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.interrupt = this.cast("interrupt")
  @scala.inline
  def isochronous: typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.isochronous = this.cast("isochronous")
}

