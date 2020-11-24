package typings.winrtUwp.global.Windows.Devices.Usb

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the setup packet for a USB control transfer. For an explanation of the setup packet, see Table 9.2 in the Universal Serial Bus (USB) specification. */
@JSGlobal("Windows.Devices.Usb.UsbSetupPacket")
@js.native
/** Creates a UsbSetupPacket object. */
class UsbSetupPacket ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbSetupPacket {
  /**
    * Creates a UsbSetupPacket object from a formatted buffer (eight bytes) that contains the setup packet.
    * @param eightByteBuffer A caller-supplied buffer that contains the setup packet formatted as per the standard USB specification. The length of the buffer must be eight bytes because that is the size of a setup packet on the bus.
    */
  def this(eightByteBuffer: IBuffer) = this()
}
