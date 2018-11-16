package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BranchNameNewHashCallback extends js.Object {
  def apply(branchName: java.lang.String, newHash: webgmeLib.GmeStorageNs.CommitHash): stdLib.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
  /** Name of branch to create. */
  def apply(
    branchName: java.lang.String,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
}

