package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPnpObject extends js.Object {
  var id: java.lang.String
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
  var `type`: PnpObjectType
  def update(updateInfo: PnpObjectUpdate): scala.Unit
}

object IPnpObject {
  @scala.inline
  def apply(
    id: java.lang.String,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _],
    `type`: PnpObjectType,
    update: PnpObjectUpdate => scala.Unit
  ): IPnpObject = {
    val __obj = js.Dynamic.literal(id = id, properties = properties, update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPnpObject]
  }
}

