package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationProviderInformation extends StObject {
  
  /**
    * The unique identifier of the authentication provider.
    */
  val id: String = js.native
  
  /**
    * The human-readable name of the authentication provider.
    */
  val label: String = js.native
}
object AuthenticationProviderInformation {
  
  @scala.inline
  def apply(id: String, label: String): AuthenticationProviderInformation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationProviderInformation]
  }
  
  @scala.inline
  implicit class AuthenticationProviderInformationMutableBuilder[Self <: AuthenticationProviderInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
