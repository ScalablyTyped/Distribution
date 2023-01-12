package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains updated properties for a DeviceInformation object. */
trait DeviceInformationUpdate extends StObject {
  
  /** The DeviceInformation ID of the updated device. */
  var id: String
  
  /** Gets the type of device for the updated device. */
  var kind: DeviceInformationKind
  
  /** The changed properties in a update to a DeviceInformation object. */
  var properties: IMapView[String, Any]
}
object DeviceInformationUpdate {
  
  inline def apply(id: String, kind: DeviceInformationKind, properties: IMapView[String, Any]): DeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInformationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceInformationUpdate] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: DeviceInformationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IMapView[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
