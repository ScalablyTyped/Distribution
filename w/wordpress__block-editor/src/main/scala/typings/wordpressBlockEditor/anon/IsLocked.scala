package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLocked extends StObject {
  
  var isLocked: Boolean
  
  var user: Null | String
}
object IsLocked {
  
  inline def apply(isLocked: Boolean): IsLocked = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[IsLocked]
  }
  
  extension [Self <: IsLocked](x: Self) {
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
