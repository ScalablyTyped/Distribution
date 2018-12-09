package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CommitA extends js.Object {
  def apply(commitA: webgmeLib.GmeStorageNs.CommitHash, commitB: webgmeLib.GmeStorageNs.CommitHash): js.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
  def apply(
    commitA: webgmeLib.GmeStorageNs.CommitHash,
    commitB: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeStorageNs.CommitHashCallback
  ): scala.Unit = js.native
}

