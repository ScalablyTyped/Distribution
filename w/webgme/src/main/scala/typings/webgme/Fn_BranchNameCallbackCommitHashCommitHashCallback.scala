package typings.webgme

import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.CommitHashCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BranchNameCallbackCommitHashCommitHashCallback extends js.Object {
  def apply(branchName: String): js.Promise[CommitHash] = js.native
  def apply(branchName: String, callback: CommitHashCallback): Unit = js.native
}

