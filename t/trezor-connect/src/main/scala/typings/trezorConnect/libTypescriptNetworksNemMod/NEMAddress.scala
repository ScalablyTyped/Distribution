package typings.trezorConnect.libTypescriptNetworksNemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMAddress extends StObject {
  
  var address: String
  
  var path: js.Array[Double]
  
  var serializedPath: String
}
object NEMAddress {
  
  inline def apply(address: String, path: js.Array[Double], serializedPath: String): NEMAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMAddress]
  }
  
  extension [Self <: NEMAddress](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
  }
}
