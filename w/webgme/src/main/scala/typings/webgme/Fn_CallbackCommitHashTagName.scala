package typings.webgme

import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitHashTagName extends js.Object {
  def apply(tagName: Name, commitHash: CommitHash): js.Promise[Unit] = js.native
  def apply(tagName: Name, commitHash: CommitHash, callback: ResultCallback[Unit]): Unit = js.native
}

