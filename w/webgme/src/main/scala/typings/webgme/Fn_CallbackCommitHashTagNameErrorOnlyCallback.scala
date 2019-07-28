package typings.webgme

import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.ErrorOnlyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitHashTagNameErrorOnlyCallback extends js.Object {
  def apply(tagName: String, commitHash: CommitHash): js.Promise[ErrorOnlyCallback] = js.native
  def apply(tagName: String, commitHash: CommitHash, callback: ErrorOnlyCallback): Unit = js.native
}

