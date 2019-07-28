package typings.webgme

import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.CommitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BranchNameCallbackOldHash extends js.Object {
  def apply(branchName: Name, oldHash: CommitHash): js.Promise[CommitResult] = js.native
  def apply(branchName: Name, oldHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
}

