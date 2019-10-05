package typings.webgme

import typings.webgme.Core.Node
import typings.webgme.GmeCommon.ErrorOnlyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNode extends js.Object {
  def apply(node: Node): js.Promise[Unit] = js.native
  def apply(node: Node, callback: ErrorOnlyCallback): Unit = js.native
}

