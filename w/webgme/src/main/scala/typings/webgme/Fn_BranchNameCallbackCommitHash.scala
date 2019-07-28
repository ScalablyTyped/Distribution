package typings.webgme

import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BranchNameCallbackCommitHash extends js.Object {
  def apply(branchName: Name): js.Promise[CommitHash] = js.native
  def apply(branchName: Name, callback: ResultCallback[CommitHash]): Unit = js.native
}

