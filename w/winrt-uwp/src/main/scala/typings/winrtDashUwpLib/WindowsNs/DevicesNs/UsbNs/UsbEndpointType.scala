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
  
  /* 2 */ val bulk: bulk with scala.Double = js.native
  /* 0 */ val control: control with scala.Double = js.native
  /* 3 */ val interrupt: interrupt with scala.Double = js.native
  /* 1 */ val isochronous: isochronous with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointType with scala.Double] = js.native
}

