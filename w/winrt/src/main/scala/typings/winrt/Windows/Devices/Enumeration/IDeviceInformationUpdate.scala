package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceInformationUpdate extends js.Object {
  var id: String
  var properties: IMapView[String, _]
}

object IDeviceInformationUpdate {
  @scala.inline
  def apply(id: String, properties: IMapView[String, _]): IDeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id, properties = properties)
  
    __obj.asInstanceOf[IDeviceInformationUpdate]
  }
}

