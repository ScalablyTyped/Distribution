package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BranchNameCallbackName extends js.Object {
  def apply(branchName: webgmeLib.GmeCommonNs.Name): js.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
  def apply(
    branchName: webgmeLib.GmeCommonNs.Name,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitHash]
  ): scala.Unit = js.native
}

