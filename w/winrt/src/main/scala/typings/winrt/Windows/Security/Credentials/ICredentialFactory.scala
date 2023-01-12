package typings.winrt.Windows.Security.Credentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICredentialFactory extends StObject {
  
  def createPasswordCredential(resource: String, userName: String, password: String): PasswordCredential
}
object ICredentialFactory {
  
  inline def apply(createPasswordCredential: (String, String, String) => PasswordCredential): ICredentialFactory = {
    val __obj = js.Dynamic.literal(createPasswordCredential = js.Any.fromFunction3(createPasswordCredential))
    __obj.asInstanceOf[ICredentialFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICredentialFactory] (val x: Self) extends AnyVal {
    
    inline def setCreatePasswordCredential(value: (String, String, String) => PasswordCredential): Self = StObject.set(x, "createPasswordCredential", js.Any.fromFunction3(value))
  }
}
