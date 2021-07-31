package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceInformationUpdate extends StObject {
  
  var id: String
  
  var properties: IMapView[String, js.Any]
}
object IDeviceInformationUpdate {
  
  @scala.inline
  def apply(id: String, properties: IMapView[String, js.Any]): IDeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceInformationUpdate]
  }
  
  @scala.inline
  implicit class IDeviceInformationUpdateMutableBuilder[Self <: IDeviceInformationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMapView[String, js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
