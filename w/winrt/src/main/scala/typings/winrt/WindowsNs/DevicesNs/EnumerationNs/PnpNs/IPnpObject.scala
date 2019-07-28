package typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPnpObject extends js.Object {
  var id: String
  var properties: IMapView[String, _]
  var `type`: PnpObjectType
  def update(updateInfo: PnpObjectUpdate): Unit
}

object IPnpObject {
  @scala.inline
  def apply(
    id: String,
    properties: IMapView[String, _],
    `type`: PnpObjectType,
    update: PnpObjectUpdate => Unit
  ): IPnpObject = {
    val __obj = js.Dynamic.literal(id = id, properties = properties, update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPnpObject]
  }
}

