package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WifiInterfaceData extends StObject {
  
  var id: String
  
  var iface: String
  
  var mac: String
  
  var model: String
  
  var vendor: String
}
object WifiInterfaceData {
  
  inline def apply(id: String, iface: String, mac: String, model: String, vendor: String): WifiInterfaceData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iface = iface.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiInterfaceData]
  }
  
  extension [Self <: WifiInterfaceData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIface(value: String): Self = StObject.set(x, "iface", value.asInstanceOf[js.Any])
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
