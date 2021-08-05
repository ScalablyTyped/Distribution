package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentityRef extends StObject {
  
  /**
    * User display name
    */
  var displayName: String
  
  /**
    * User VSID
    */
  var id: String
}
object UserIdentityRef {
  
  inline def apply(displayName: String, id: String): UserIdentityRef = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentityRef]
  }
  
  extension [Self <: UserIdentityRef](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
