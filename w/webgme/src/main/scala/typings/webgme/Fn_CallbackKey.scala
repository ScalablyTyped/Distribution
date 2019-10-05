package typings.webgme

import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackKey extends js.Object {
  def apply(key: String): js.Promise[CommitObject] = js.native
  /** Hash of object to load. */
  def apply(key: String, callback: ResultCallback[CommitObject]): Unit = js.native
}

