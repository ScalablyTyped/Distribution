package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitA extends js.Object {
  def apply(commitA: webgmeLib.GmeStorageNs.CommitHash, commitB: webgmeLib.GmeStorageNs.CommitHash): js.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
  def apply(
    commitA: webgmeLib.GmeStorageNs.CommitHash,
    commitB: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitHash]
  ): scala.Unit = js.native
}

