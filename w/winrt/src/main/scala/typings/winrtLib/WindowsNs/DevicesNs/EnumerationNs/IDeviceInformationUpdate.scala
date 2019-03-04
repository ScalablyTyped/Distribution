package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceInformationUpdate extends js.Object {
  var id: java.lang.String
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
}

object IDeviceInformationUpdate {
  @scala.inline
  def apply(
    id: java.lang.String,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
  ): IDeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id, properties = properties)
  
    __obj.asInstanceOf[IDeviceInformationUpdate]
  }
}

