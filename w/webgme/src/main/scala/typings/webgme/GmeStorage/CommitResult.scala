package typings.webgme.GmeStorage

import typings.webgme.webgmeStrings.CANCELED
import typings.webgme.webgmeStrings.FORKED
import typings.webgme.webgmeStrings.SYNCED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResult extends js.Object {
  /** The commitHash for the commit. */
  var hash: CommitHash
  var status: js.UndefOr[SYNCED | FORKED | CANCELED] = js.undefined
}

object CommitResult {
  @scala.inline
  def apply(hash: CommitHash, status: SYNCED | FORKED | CANCELED = null): CommitResult = {
    val __obj = js.Dynamic.literal(hash = hash)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitResult]
  }
}

