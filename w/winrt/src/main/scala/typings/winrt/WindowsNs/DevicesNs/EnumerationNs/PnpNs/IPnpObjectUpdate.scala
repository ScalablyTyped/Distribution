package typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPnpObjectUpdate extends js.Object {
  var id: String
  var properties: IMapView[String, _]
  var `type`: PnpObjectType
}

object IPnpObjectUpdate {
  @scala.inline
  def apply(id: String, properties: IMapView[String, _], `type`: PnpObjectType): IPnpObjectUpdate = {
    val __obj = js.Dynamic.literal(id = id, properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPnpObjectUpdate]
  }
}

