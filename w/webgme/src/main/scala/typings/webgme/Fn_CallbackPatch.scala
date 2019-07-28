package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.Node
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackPatch extends js.Object {
  def apply(root: Node, patch: DataObject): js.Promise[DataObject] = js.native
  def apply(root: Node, patch: DataObject, callback: ResultCallback[DataObject]): Unit = js.native
}

