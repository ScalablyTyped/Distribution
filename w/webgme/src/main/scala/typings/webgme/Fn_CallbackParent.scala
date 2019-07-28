package typings.webgme

import typings.webgme.CoreNs.Node
import typings.webgme.GmeCommonNs.DataObject
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackParent extends js.Object {
  def apply(parent: Node, relativeId: String): js.Promise[js.Array[DataObject]] = js.native
  def apply(parent: Node, relativeId: String, callback: ResultCallback[js.Array[DataObject]]): Unit = js.native
}

