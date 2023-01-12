package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* ***************** CREDENTIAL MANAGEMENT API DEFINITIONS ******************* */
/**
  * Declaration merge for 'navigator' which adds the credential management
  * interface.
  */
trait Navigator extends StObject {
  
  val credentials: CredentialsContainer
}
object Navigator {
  
  inline def apply(credentials: CredentialsContainer): Navigator = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: CredentialsContainer): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}
