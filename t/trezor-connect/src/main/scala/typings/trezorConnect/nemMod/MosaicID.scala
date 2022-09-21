package typings.trezorConnect.nemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MosaicID extends StObject {
  
  var name: String
  
  var namespaceId: String
}
object MosaicID {
  
  inline def apply(name: String, namespaceId: String): MosaicID = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespaceId = namespaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicID]
  }
  
  extension [Self <: MosaicID](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespaceId(value: String): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
  }
}
