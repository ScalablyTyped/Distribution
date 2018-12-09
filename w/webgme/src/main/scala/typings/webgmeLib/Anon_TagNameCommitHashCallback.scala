package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TagNameCommitHashCallback extends js.Object {
  def apply(tagName: webgmeLib.GmeCommonNs.Name, commitHash: webgmeLib.GmeStorageNs.CommitHash): js.Promise[scala.Unit] = js.native
  def apply(
    tagName: webgmeLib.GmeCommonNs.Name,
    commitHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[scala.Unit]
  ): scala.Unit = js.native
}

