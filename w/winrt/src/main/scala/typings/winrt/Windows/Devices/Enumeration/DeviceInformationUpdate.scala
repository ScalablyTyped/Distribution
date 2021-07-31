package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInformationUpdate
  extends StObject
     with IDeviceInformationUpdate
object DeviceInformationUpdate {
  
  @scala.inline
  def apply(id: String, properties: IMapView[String, js.Any]): DeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInformationUpdate]
  }
}
