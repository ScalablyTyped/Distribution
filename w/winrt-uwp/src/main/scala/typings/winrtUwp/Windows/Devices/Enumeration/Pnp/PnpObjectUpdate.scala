package typings.winrtUwp.Windows.Devices.Enumeration.Pnp

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the updated properties of a PnpObject . */
trait PnpObjectUpdate extends js.Object {
  /** The identifier of the PnpObject . */
  var id: String
  /** The changed properties in an update to a PnpObject . */
  var properties: IMapView[String, _]
  /** The type of the PnpObject . One of the values of the PnpObjectType enumeration. */
  var `type`: PnpObjectType
}

object PnpObjectUpdate {
  @scala.inline
  def apply(id: String, properties: IMapView[String, _], `type`: PnpObjectType): PnpObjectUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PnpObjectUpdate]
  }
}

