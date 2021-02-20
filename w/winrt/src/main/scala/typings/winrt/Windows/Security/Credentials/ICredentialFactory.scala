package typings.winrt.Windows.Security.Credentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICredentialFactory extends StObject {
  
  def createPasswordCredential(resource: String, userName: String, password: String): PasswordCredential = js.native
}
object ICredentialFactory {
  
  @scala.inline
  def apply(createPasswordCredential: (String, String, String) => PasswordCredential): ICredentialFactory = {
    val __obj = js.Dynamic.literal(createPasswordCredential = js.Any.fromFunction3(createPasswordCredential))
    __obj.asInstanceOf[ICredentialFactory]
  }
  
  @scala.inline
  implicit class ICredentialFactoryMutableBuilder[Self <: ICredentialFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatePasswordCredential(value: (String, String, String) => PasswordCredential): Self = StObject.set(x, "createPasswordCredential", js.Any.fromFunction3(value))
  }
}
