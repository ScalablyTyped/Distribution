package typings.winrtDashUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Usb.UsbEndpointType.bulk
import typings.winrtDashUwp.Windows.Devices.Usb.UsbEndpointType.control
import typings.winrtDashUwp.Windows.Devices.Usb.UsbEndpointType.interrupt
import typings.winrtDashUwp.Windows.Devices.Usb.UsbEndpointType.isochronous
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UsbEndpointType with Double] = js.native
  /* 2 */ @js.native
  object bulk extends TopLevel[bulk with Double]
  
  /* 0 */ @js.native
  object control extends TopLevel[control with Double]
  
  /* 3 */ @js.native
  object interrupt extends TopLevel[interrupt with Double]
  
  /* 1 */ @js.native
  object isochronous extends TopLevel[isochronous with Double]
  
}

