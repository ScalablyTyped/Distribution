package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationSessionAccountInformation extends StObject {
  
  /**
    * The unique identifier of the account.
    */
  val id: String = js.native
  
  /**
    * The human-readable name of the account.
    */
  val label: String = js.native
}
object AuthenticationSessionAccountInformation {
  
  @scala.inline
  def apply(id: String, label: String): AuthenticationSessionAccountInformation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationSessionAccountInformation]
  }
  
  @scala.inline
  implicit class AuthenticationSessionAccountInformationMutableBuilder[Self <: AuthenticationSessionAccountInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
