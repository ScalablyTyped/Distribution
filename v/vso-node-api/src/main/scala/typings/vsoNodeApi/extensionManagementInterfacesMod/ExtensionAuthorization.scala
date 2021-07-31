package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAuthorization extends StObject {
  
  var id: String
  
  var scopes: js.Array[String]
}
object ExtensionAuthorization {
  
  @scala.inline
  def apply(id: String, scopes: js.Array[String]): ExtensionAuthorization = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuthorization]
  }
  
  @scala.inline
  implicit class ExtensionAuthorizationMutableBuilder[Self <: ExtensionAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
