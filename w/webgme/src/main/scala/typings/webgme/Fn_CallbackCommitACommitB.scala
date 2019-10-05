package typings.webgme

import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitHashCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitACommitB extends js.Object {
  def apply(commitA: CommitHash, commitB: CommitHash): js.Promise[CommitHash] = js.native
  def apply(commitA: CommitHash, commitB: CommitHash, callback: CommitHashCallback): Unit = js.native
}

