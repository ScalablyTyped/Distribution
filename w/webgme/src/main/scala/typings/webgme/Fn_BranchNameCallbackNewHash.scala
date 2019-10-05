package typings.webgme

import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BranchNameCallbackNewHash extends js.Object {
  def apply(branchName: Name, newHash: CommitHash): js.Promise[CommitResult] = js.native
  def apply(branchName: Name, newHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
}

