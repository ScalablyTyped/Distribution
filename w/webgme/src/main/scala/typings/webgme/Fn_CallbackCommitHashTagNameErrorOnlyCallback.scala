package typings.webgme

import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.ErrorOnlyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitHashTagNameErrorOnlyCallback extends js.Object {
  def apply(tagName: String, commitHash: CommitHash): js.Promise[ErrorOnlyCallback] = js.native
  def apply(tagName: String, commitHash: CommitHash, callback: ErrorOnlyCallback): Unit = js.native
}

