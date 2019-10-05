package typings.webgme

import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitResult
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

