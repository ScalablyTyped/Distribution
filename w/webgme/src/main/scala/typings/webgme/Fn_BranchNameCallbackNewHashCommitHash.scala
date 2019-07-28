package typings.webgme

import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.CommitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BranchNameCallbackNewHashCommitHash extends js.Object {
  def apply(branchName: String, newHash: CommitHash): js.Promise[CommitResult] = js.native
  /** Name of branch to create. */
  def apply(branchName: String, newHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
}

