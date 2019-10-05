package typings.winrtDashUwp.Windows.Devices.Usb

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
  sealed trait bulk extends UsbEndpointType
  
  /** Indicates a USB control endpoint (Endpoint 0). */
  @js.native
  sealed trait control extends UsbEndpointType
  
  /** Indicates a USB interrupt endpoint. */
  @js.native
  sealed trait interrupt extends UsbEndpointType
  
  /** Indicates a USB isochronous endpoint. */
  @js.native
  sealed trait isochronous extends UsbEndpointType
  
  /* 2 */ val bulk: typings.winrtDashUwp.Windows.Devices.Usb.UsbEndpointType.bulk with Double = js.native
  /* 0 */ val control: typings.winrtDashUwp.Windows.Devices.Usb.UsbEndpointType.control with Double = js.native
  /* 3 */ val interrupt: typings.winrtDashUwp.Windows.Devices.Usb.UsbEndpointType.interrupt with Double = js.native
  /* 1 */ val isochronous: typings.winrtDashUwp.Windows.Devices.Usb.UsbEndpointType.isochronous with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UsbEndpointType with Double] = js.native
}

