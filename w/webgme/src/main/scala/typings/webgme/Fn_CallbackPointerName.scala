package typings.webgme

import typings.webgme.CoreNs.Node
import typings.webgme.GmeCommonNs.DataObject
import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackPointerName extends js.Object {
  def apply(target: Node, pointerName: Name): js.Promise[js.Array[DataObject]] = js.native
  def apply(target: Node, pointerName: Name, callback: ResultCallback[js.Array[DataObject]]): Unit = js.native
}

