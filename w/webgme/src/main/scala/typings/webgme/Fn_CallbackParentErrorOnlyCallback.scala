package typings.webgme

import typings.webgme.Core.Node
import typings.webgme.GmeCommon.ErrorOnlyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackParentErrorOnlyCallback extends js.Object {
  def apply(parent: Node): js.Promise[Unit] = js.native
  def apply(parent: Node, callback: ErrorOnlyCallback): Unit = js.native
}

