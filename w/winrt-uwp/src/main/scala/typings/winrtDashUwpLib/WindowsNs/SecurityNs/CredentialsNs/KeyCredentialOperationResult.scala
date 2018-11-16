package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a key credential operation. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialOperationResult")
@js.native
abstract class KeyCredentialOperationResult () extends js.Object {
  /** Gets the result of the key credential operation. */
  var result: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus = js.native
}

