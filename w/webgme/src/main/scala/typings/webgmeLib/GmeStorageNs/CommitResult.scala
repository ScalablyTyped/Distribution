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

