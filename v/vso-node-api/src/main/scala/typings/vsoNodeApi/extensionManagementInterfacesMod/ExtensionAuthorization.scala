package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAuthorization extends StObject {
  
  var id: String
  
  var scopes: js.Array[String]
}
object ExtensionAuthorization {
  
  inline def apply(id: String, scopes: js.Array[String]): ExtensionAuthorization = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuthorization]
  }
  
  extension [Self <: ExtensionAuthorization](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
