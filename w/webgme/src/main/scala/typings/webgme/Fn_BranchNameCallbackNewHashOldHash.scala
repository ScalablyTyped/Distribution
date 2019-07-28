package typings.webgme

import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.CommitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BranchNameCallbackNewHashOldHash extends js.Object {
  def apply(branchName: String, newHash: CommitHash, oldHash: CommitHash): js.Promise[CommitResult] = js.native
  def apply(
    branchName: String,
    newHash: CommitHash,
    oldHash: CommitHash,
    callback: ResultCallback[CommitResult]
  ): Unit = js.native
}

