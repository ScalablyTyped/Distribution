package typings.winrtUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a key credential retrieval. */
trait KeyCredentialRetrievalResult extends StObject {
  
  /** Gets the key credential. */
  var credential: KeyCredential
  
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus
}
object KeyCredentialRetrievalResult {
  
  @scala.inline
  def apply(credential: KeyCredential, status: KeyCredentialStatus): KeyCredentialRetrievalResult = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCredentialRetrievalResult]
  }
  
  @scala.inline
  implicit class KeyCredentialRetrievalResultMutableBuilder[Self <: KeyCredentialRetrievalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: KeyCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: KeyCredentialStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
