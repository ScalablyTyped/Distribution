package typings
package webgmeLib.GmeStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResult extends js.Object {
  /** The commitHash for the commit. */
  var hash: CommitHash
  var status: js.UndefOr[
    webgmeLib.webgmeLibStrings.SYNCED | webgmeLib.webgmeLibStrings.FORKED | webgmeLib.webgmeLibStrings.CANCELED
  ]
}

object CommitResult {
  @scala.inline
  def apply(
    hash: CommitHash,
    status: webgmeLib.webgmeLibStrings.SYNCED | webgmeLib.webgmeLibStrings.FORKED | webgmeLib.webgmeLibStrings.CANCELED = null
  ): CommitResult = {
    val __obj = js.Dynamic.literal(hash = hash)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitResult]
  }
}

