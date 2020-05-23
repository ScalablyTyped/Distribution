package typings.winrtUwp.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a key credential retrieval. */
trait KeyCredentialRetrievalResult extends js.Object {
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
}

