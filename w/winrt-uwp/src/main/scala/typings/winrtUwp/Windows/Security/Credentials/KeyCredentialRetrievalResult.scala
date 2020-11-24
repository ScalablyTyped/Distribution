package typings.winrtUwp.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a key credential retrieval. */
@js.native
trait KeyCredentialRetrievalResult extends js.Object {
  
  /** Gets the key credential. */
  var credential: KeyCredential = js.native
  
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus = js.native
}
object KeyCredentialRetrievalResult {
  
  @scala.inline
  def apply(credential: KeyCredential, status: KeyCredentialStatus): KeyCredentialRetrievalResult = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCredentialRetrievalResult]
  }
  
  @scala.inline
  implicit class KeyCredentialRetrievalResultOps[Self <: KeyCredentialRetrievalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCredential(value: KeyCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: KeyCredentialStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
