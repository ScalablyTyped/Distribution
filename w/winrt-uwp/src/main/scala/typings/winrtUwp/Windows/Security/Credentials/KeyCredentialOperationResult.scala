package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a key credential operation. */
trait KeyCredentialOperationResult extends js.Object {
  /** Gets the result of the key credential operation. */
  var result: IBuffer
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus
}

object KeyCredentialOperationResult {
  @scala.inline
  def apply(result: IBuffer, status: KeyCredentialStatus): KeyCredentialOperationResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCredentialOperationResult]
  }
}

