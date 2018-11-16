package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BranchNameNewHash extends js.Object {
  def apply(
    branchName: java.lang.String,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    oldHash: webgmeLib.GmeStorageNs.CommitHash
  ): stdLib.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
  def apply(
    branchName: java.lang.String,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    oldHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
}

