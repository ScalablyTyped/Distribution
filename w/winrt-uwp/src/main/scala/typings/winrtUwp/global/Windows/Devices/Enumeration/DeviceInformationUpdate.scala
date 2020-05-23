package typings.winrtUwp.global.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains updated properties for a DeviceInformation object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationUpdate")
@js.native
abstract class DeviceInformationUpdate ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationUpdate {
  /** The DeviceInformation ID of the updated device. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets the type of device for the updated device. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind = js.native
  /** The changed properties in a update to a DeviceInformation object. */
  /* CompleteClass */
  override var properties: IMapView[String, _] = js.native
}

