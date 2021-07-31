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
  
  @scala.inline
  def apply(install: ExtensionPolicyFlags, request: ExtensionPolicyFlags): ExtensionPolicy = {
    val __obj = js.Dynamic.literal(install = install.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPolicy]
  }
  
  @scala.inline
  implicit class ExtensionPolicyMutableBuilder[Self <: ExtensionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstall(value: ExtensionPolicyFlags): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ExtensionPolicyFlags): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
