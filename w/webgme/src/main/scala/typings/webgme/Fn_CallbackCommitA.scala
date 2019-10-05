package typings.webgme

import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitA extends js.Object {
  def apply(commitA: CommitHash, commitB: CommitHash): js.Promise[CommitHash] = js.native
  def apply(commitA: CommitHash, commitB: CommitHash, callback: ResultCallback[CommitHash]): Unit = js.native
}

