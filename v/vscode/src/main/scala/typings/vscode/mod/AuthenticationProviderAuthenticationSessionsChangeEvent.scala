package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationProviderAuthenticationSessionsChangeEvent extends StObject {
  
  /**
  		 * The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider} that have been added.
  		*/
  val added: js.UndefOr[js.Array[AuthenticationSession]] = js.undefined
  
  /**
  		 * The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider} that have been changed.
  		 * A session changes when its data excluding the id are updated. An example of this is a session refresh that results in a new
  		 * access token being set for the session.
  		 */
  val changed: js.UndefOr[js.Array[AuthenticationSession]] = js.undefined
  
  /**
  		 * The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider} that have been removed.
  		 */
  val removed: js.UndefOr[js.Array[AuthenticationSession]] = js.undefined
}
object AuthenticationProviderAuthenticationSessionsChangeEvent {
  
  inline def apply(): AuthenticationProviderAuthenticationSessionsChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationProviderAuthenticationSessionsChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationProviderAuthenticationSessionsChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[AuthenticationSession]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    inline def setAddedVarargs(value: AuthenticationSession*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setChanged(value: js.Array[AuthenticationSession]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setChangedVarargs(value: AuthenticationSession*): Self = StObject.set(x, "changed", js.Array(value*))
    
    inline def setRemoved(value: js.Array[AuthenticationSession]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: AuthenticationSession*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
