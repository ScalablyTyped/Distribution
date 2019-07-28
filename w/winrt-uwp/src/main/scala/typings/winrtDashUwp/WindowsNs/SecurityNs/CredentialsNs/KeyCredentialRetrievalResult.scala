package typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a key credential retrieval. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialRetrievalResult")
@js.native
abstract class KeyCredentialRetrievalResult () extends js.Object {
  /** Gets the key credential. */
  var credential: KeyCredential = js.native
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus = js.native
}

