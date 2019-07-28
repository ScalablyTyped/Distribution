package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains updated properties for a DeviceInformation object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationUpdate")
@js.native
abstract class DeviceInformationUpdate () extends js.Object {
  /** The DeviceInformation ID of the updated device. */
  var id: String = js.native
  /** Gets the type of device for the updated device. */
  var kind: DeviceInformationKind = js.native
  /** The changed properties in a update to a DeviceInformation object. */
  var properties: IMapView[String, _] = js.native
}

