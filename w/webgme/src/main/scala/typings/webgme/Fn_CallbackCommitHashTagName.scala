package typings.webgme

import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitHashTagName extends js.Object {
  def apply(tagName: Name, commitHash: CommitHash): js.Promise[Unit] = js.native
  def apply(tagName: Name, commitHash: CommitHash, callback: ResultCallback[Unit]): Unit = js.native
}

