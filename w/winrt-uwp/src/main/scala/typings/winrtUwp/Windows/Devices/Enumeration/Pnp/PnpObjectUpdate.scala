package typings.winrtUwp.Windows.Devices.Enumeration.Pnp

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the updated properties of a PnpObject . */
@js.native
trait PnpObjectUpdate extends js.Object {
  /** The identifier of the PnpObject . */
  var id: String = js.native
  /** The changed properties in an update to a PnpObject . */
  var properties: IMapView[String, _] = js.native
  /** The type of the PnpObject . One of the values of the PnpObjectType enumeration. */
  var `type`: PnpObjectType = js.native
}

object PnpObjectUpdate {
  @scala.inline
  def apply(id: String, properties: IMapView[String, _], `type`: PnpObjectType): PnpObjectUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PnpObjectUpdate]
  }
  @scala.inline
  implicit class PnpObjectUpdateOps[Self <: PnpObjectUpdate] (val x: Self) extends AnyVal {
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
  }
  
}

