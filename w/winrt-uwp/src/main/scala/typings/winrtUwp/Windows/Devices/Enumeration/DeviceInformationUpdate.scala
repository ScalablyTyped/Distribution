package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains updated properties for a DeviceInformation object. */
trait DeviceInformationUpdate extends js.Object {
  /** The DeviceInformation ID of the updated device. */
  var id: String
  /** Gets the type of device for the updated device. */
  var kind: DeviceInformationKind
  /** The changed properties in a update to a DeviceInformation object. */
  var properties: IMapView[String, _]
}

object DeviceInformationUpdate {
  @scala.inline
  def apply(id: String, kind: DeviceInformationKind, properties: IMapView[String, _]): DeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInformationUpdate]
  }
}

