package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.Node
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackPointerNameSource extends js.Object {
  def apply(source: Node, pointerName: String): js.Promise[DataObject] = js.native
  def apply(source: Node, pointerName: String, callback: ResultCallback[DataObject]): Unit = js.native
}

