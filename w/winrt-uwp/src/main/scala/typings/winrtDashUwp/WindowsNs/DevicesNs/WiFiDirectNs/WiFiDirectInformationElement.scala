package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information elements in a Wi-Fi Direct packet. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
@js.native
/** Creates a new WiFiDirectInformationElement object. */
class WiFiDirectInformationElement () extends js.Object {
  /** A three-byte organization identifier used to indicate the organization which defined a vendor extension information element (IE). */
  var oui: IBuffer = js.native
  /** A one byte type value used in a vendor extension information element (IE) to distinguish between different IE formats defined by the same organization. */
  var ouiType: Double = js.native
  /** The value of the information element. */
  var value: IBuffer = js.native
}

/* static members */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
@js.native
object WiFiDirectInformationElement extends js.Object {
  /**
    * Create an array of information elements from a data buffer.
    * @param buffer The data buffer that contains a information element.
    * @return A array of information elements created from the buffer.
    */
  def createFromBuffer(buffer: IBuffer): IVector[WiFiDirectInformationElement] = js.native
  /**
    * Create an array of information elements from a DeviceInformation object.
    * @param deviceInformation The device information object that contains the information elements.
    * @return A array of information elements created from the device information object.
    */
  def createFromDeviceInformation(deviceInformation: DeviceInformation): IVector[WiFiDirectInformationElement] = js.native
}

