package typings.webgme

import typings.webgme.GmeStorageNs.ErrorOnlyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackTagNameTagname extends js.Object {
  /** Name of tag to delete. */
  def apply(tagName: String, callback: ErrorOnlyCallback): Unit = js.native
  def apply(tagname: String): js.Promise[Unit] = js.native
}

