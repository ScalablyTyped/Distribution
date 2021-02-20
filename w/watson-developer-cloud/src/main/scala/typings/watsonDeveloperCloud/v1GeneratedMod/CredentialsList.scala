package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** CredentialsList. */
@js.native
trait CredentialsList extends StObject {
  
  /** An array of credential definitions that were created for this instance. */
  var credentials: js.UndefOr[js.Array[Credentials]] = js.native
}
object CredentialsList {
  
  @scala.inline
  def apply(): CredentialsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialsList]
  }
  
  @scala.inline
  implicit class CredentialsListMutableBuilder[Self <: CredentialsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: js.Array[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setCredentialsVarargs(value: Credentials*): Self = StObject.set(x, "credentials", js.Array(value :_*))
  }
}
