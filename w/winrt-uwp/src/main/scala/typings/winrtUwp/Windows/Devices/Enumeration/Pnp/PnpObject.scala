package typings.winrtUwp.Windows.Devices.Enumeration.Pnp

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PnP object. This class allows access to well-known properties of a PnP object as well as a property store of additional properties that are specified to be retrieved from the the PnP object. */
trait PnpObject extends js.Object {
  /** A string representing the identity of the PnpObject . */
  var id: String
  /** A property store containing well-known values as well as additional specified properties. */
  var properties: IMapView[String, _]
  /** The type of the PnpObject . */
  var `type`: PnpObjectType
  /**
    * Updates the properties of an existing PnpObject by applying the changes described in a PnpObjectUpdate object.
    * @param updateInfo Indicates the properties to update.
    */
  def update(updateInfo: PnpObjectUpdate): Unit
}

object PnpObject {
  @scala.inline
  def apply(
    id: String,
    properties: IMapView[String, _],
    `type`: PnpObjectType,
    update: PnpObjectUpdate => Unit
  ): PnpObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PnpObject]
  }
}

