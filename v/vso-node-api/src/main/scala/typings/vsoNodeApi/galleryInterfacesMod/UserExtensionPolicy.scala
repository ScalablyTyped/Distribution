package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserExtensionPolicy extends StObject {
  
  /**
    * User display name that this policy refers to
    */
  var displayName: String
  
  /**
    * The extension policy applied to the user
    */
  var permissions: ExtensionPolicy
  
  /**
    * User id that this policy refers to
    */
  var userId: String
}
object UserExtensionPolicy {
  
  inline def apply(displayName: String, permissions: ExtensionPolicy, userId: String): UserExtensionPolicy = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserExtensionPolicy]
  }
  
  extension [Self <: UserExtensionPolicy](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: ExtensionPolicy): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
