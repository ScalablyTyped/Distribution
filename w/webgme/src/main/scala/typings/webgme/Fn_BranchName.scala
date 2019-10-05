package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.Core.ObjectHash
import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BranchName extends js.Object {
  def apply(branchName: Name, parents: CommitHash, rootHash: ObjectHash, coreObjects: DataObject, msg: String): js.Promise[CommitResult] = js.native
  def apply(
    branchName: Name,
    parents: CommitHash,
    rootHash: ObjectHash,
    coreObjects: DataObject,
    msg: String,
    callback: ResultCallback[CommitResult]
  ): Unit = js.native
}

