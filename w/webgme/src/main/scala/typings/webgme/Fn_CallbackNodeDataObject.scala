package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.Node
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNodeDataObject extends js.Object {
  def apply(node: Node): js.Promise[DataObject] = js.native
  def apply(node: Node, callback: ResultCallback[DataObject]): Unit = js.native
}

