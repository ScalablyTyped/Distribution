package typings.winrt.Windows.Security.Credentials

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordCredential
  extends StObject
     with IPasswordCredential
object PasswordCredential {
  
  @scala.inline
  def apply(
    password: String,
    properties: IPropertySet,
    resource: String,
    retrievePassword: () => Unit,
    userName: String
  ): PasswordCredential = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], retrievePassword = js.Any.fromFunction0(retrievePassword), userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredential]
  }
}
