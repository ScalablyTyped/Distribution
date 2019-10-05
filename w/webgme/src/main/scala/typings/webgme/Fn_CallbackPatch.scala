package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.Core.Node
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackPatch extends js.Object {
  def apply(root: Node, patch: DataObject): js.Promise[DataObject] = js.native
  def apply(root: Node, patch: DataObject, callback: ResultCallback[DataObject]): Unit = js.native
}

