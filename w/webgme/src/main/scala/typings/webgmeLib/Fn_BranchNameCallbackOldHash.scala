package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BranchNameCallbackOldHash extends js.Object {
  def apply(branchName: webgmeLib.GmeCommonNs.Name, oldHash: webgmeLib.GmeStorageNs.CommitHash): js.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
  def apply(
    branchName: webgmeLib.GmeCommonNs.Name,
    oldHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
}

