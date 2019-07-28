package typings.webgme

import typings.webgme.GmeStorageNs.ErrorOnlyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackPaths extends js.Object {
  def apply(rootKey: String, paths: js.Array[String]): js.Promise[ErrorOnlyCallback] = js.native
  def apply(rootKey: String, paths: js.Array[String], callback: ErrorOnlyCallback): Unit = js.native
}

