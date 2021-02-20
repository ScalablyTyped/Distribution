package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationSessionsChangeEvent extends StObject {
  
  /**
    * The [authenticationProvider](#AuthenticationProvider) that has had its sessions change.
    */
  val provider: AuthenticationProviderInformation = js.native
}
object AuthenticationSessionsChangeEvent {
  
  @scala.inline
  def apply(provider: AuthenticationProviderInformation): AuthenticationSessionsChangeEvent = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationSessionsChangeEvent]
  }
  
  @scala.inline
  implicit class AuthenticationSessionsChangeEventMutableBuilder[Self <: AuthenticationSessionsChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: AuthenticationProviderInformation): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
