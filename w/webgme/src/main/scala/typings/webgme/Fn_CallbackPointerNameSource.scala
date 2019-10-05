package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.Core.Node
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackPointerNameSource extends js.Object {
  def apply(source: Node, pointerName: String): js.Promise[DataObject] = js.native
  def apply(source: Node, pointerName: String, callback: ResultCallback[DataObject]): Unit = js.native
}

