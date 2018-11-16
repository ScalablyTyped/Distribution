package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsbEndpointType extends js.Object

/** Defines constants that indicate the type of USB endpoint: control, bulk, isochronous, or interrupt. */
@JSGlobal("Windows.Devices.Usb.UsbEndpointType")
@js.native
object UsbEndpointType extends js.Object {
  /** Indicates a USB bulk endpoint. */
  @js.native
  sealed trait bulk
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointType
  
  /** Indicates a USB control endpoint (Endpoint 0). */
  @js.native
  sealed trait control
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointType
  
  /** Indicates a USB interrupt endpoint. */
  @js.native
  sealed trait interrupt
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointType
  
  /** Indicates a USB isochronous endpoint. */
  @js.native
  sealed trait isochronous
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointType
  
  val bulk: bulk with java.lang.String = js.native
  val control: control with java.lang.String = js.native
  val interrupt: interrupt with java.lang.String = js.native
  val isochronous: isochronous with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointType with java.lang.String] = js.native
}

