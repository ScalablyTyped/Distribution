package typings.winrtUwp.Windows.Devices.Enumeration.Pnp

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PnP object. This class allows access to well-known properties of a PnP object as well as a property store of additional properties that are specified to be retrieved from the the PnP object. */
@js.native
trait PnpObject extends js.Object {
  /** A string representing the identity of the PnpObject . */
  var id: String = js.native
  /** A property store containing well-known values as well as additional specified properties. */
  var properties: IMapView[String, _] = js.native
  /** The type of the PnpObject . */
  var `type`: PnpObjectType = js.native
  /**
    * Updates the properties of an existing PnpObject by applying the changes described in a PnpObjectUpdate object.
    * @param updateInfo Indicates the properties to update.
    */
  def update(updateInfo: PnpObjectUpdate): Unit = js.native
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
  @scala.inline
  implicit class PnpObjectOps[Self <: PnpObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IMapView[String, _]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PnpObjectType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: PnpObjectUpdate => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

