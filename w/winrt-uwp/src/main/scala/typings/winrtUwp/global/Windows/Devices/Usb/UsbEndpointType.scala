package typings.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines constants that indicate the type of USB endpoint: control, bulk, isochronous, or interrupt. */
@JSGlobal("Windows.Devices.Usb.UsbEndpointType")
@js.native
object UsbEndpointType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType with Double] = js.native
  
  /* 2 */ val bulk: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.bulk with Double = js.native
  
  /* 0 */ val control: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.control with Double = js.native
  
  /* 3 */ val interrupt: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.interrupt with Double = js.native
  
  /* 1 */ val isochronous: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.isochronous with Double = js.native
}
