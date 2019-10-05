package typings.webgme

import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitHashDictionary extends js.Object {
  /** On success the promise will be resolved with Object.module:Storage~CommitHash> result. */
  def apply(): js.Promise[Dictionary[CommitHash]] = js.native
  /** On success the callback will run with Object.module:Storage~CommitHash result. */
  def apply(callback: ResultCallback[Dictionary[CommitHash]]): Unit = js.native
}

