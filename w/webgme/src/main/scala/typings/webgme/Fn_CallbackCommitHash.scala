package typings.webgme

import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitHash extends js.Object {
  def apply(): js.Promise[CommitHash] = js.native
  def apply(callback: ResultCallback[CommitHash]): Unit = js.native
}

