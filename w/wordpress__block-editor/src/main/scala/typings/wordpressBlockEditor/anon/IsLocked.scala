package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsLocked extends StObject {
  
  var isLocked: Boolean = js.native
  
  var user: Null | String = js.native
}
object IsLocked {
  
  @scala.inline
  def apply(isLocked: Boolean): IsLocked = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLocked]
  }
  
  @scala.inline
  implicit class IsLockedMutableBuilder[Self <: IsLocked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = StObject.set(x, "user", null)
  }
}
