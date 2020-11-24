package typings.winrtUwp.global.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents information elements in a Wi-Fi Direct packet. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
@js.native
/** Creates a new WiFiDirectInformationElement object. */
class WiFiDirectInformationElement ()
  extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement
/* static members */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
@js.native
object WiFiDirectInformationElement extends js.Object {
  
  /**
    * Create an array of information elements from a data buffer.
    * @param buffer The data buffer that contains a information element.
    * @return A array of information elements created from the buffer.
    */
  def createFromBuffer(buffer: IBuffer): IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement] = js.native
  
  /**
    * Create an array of information elements from a DeviceInformation object.
    * @param deviceInformation The device information object that contains the information elements.
    * @return A array of information elements created from the device information object.
    */
  def createFromDeviceInformation(deviceInformation: DeviceInformation): IVector[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectInformationElement] = js.native
}
