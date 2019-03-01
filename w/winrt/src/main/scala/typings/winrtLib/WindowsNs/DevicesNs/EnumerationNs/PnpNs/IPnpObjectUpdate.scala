package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPnpObjectUpdate extends js.Object {
  var id: java.lang.String
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
  var `type`: PnpObjectType
}

object IPnpObjectUpdate {
  @scala.inline
  def apply(
    id: java.lang.String,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _],
    `type`: PnpObjectType
  ): IPnpObjectUpdate = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IPnpObjectUpdate]
  }
}

