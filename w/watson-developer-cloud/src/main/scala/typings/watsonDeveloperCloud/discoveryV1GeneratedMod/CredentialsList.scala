package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** CredentialsList. */
trait CredentialsList extends StObject {
  
  /** An array of credential definitions that were created for this instance. */
  var credentials: js.UndefOr[js.Array[Credentials]] = js.undefined
}
object CredentialsList {
  
  inline def apply(): CredentialsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialsList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CredentialsList] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: js.Array[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setCredentialsVarargs(value: Credentials*): Self = StObject.set(x, "credentials", js.Array(value*))
  }
}
