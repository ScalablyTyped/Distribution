package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionPolicy extends StObject {
  
  /**
    * Permissions on 'Install' operation
    */
  var install: ExtensionPolicyFlags
  
  /**
    * Permission on 'Request' operation
    */
  var request: ExtensionPolicyFlags
}
object ExtensionPolicy {
  
  inline def apply(install: ExtensionPolicyFlags, request: ExtensionPolicyFlags): ExtensionPolicy = {
    val __obj = js.Dynamic.literal(install = install.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPolicy]
  }
  
  extension [Self <: ExtensionPolicy](x: Self) {
    
    inline def setInstall(value: ExtensionPolicyFlags): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ExtensionPolicyFlags): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
