package typings.webgme

import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackKey extends js.Object {
  def apply(key: String): js.Promise[CommitObject] = js.native
  /** Hash of object to load. */
  def apply(key: String, callback: ResultCallback[CommitObject]): Unit = js.native
}

