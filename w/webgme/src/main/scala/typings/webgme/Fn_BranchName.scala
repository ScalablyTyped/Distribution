package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.ObjectHash
import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.CommitResult
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

