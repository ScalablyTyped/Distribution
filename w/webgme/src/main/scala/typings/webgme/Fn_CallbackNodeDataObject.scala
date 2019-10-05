package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.Core.Node
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNodeDataObject extends js.Object {
  def apply(node: Node): js.Promise[DataObject] = js.native
  def apply(node: Node, callback: ResultCallback[DataObject]): Unit = js.native
}

