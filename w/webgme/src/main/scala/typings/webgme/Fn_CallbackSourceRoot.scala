package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.Node
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackSourceRoot extends js.Object {
  def apply(sourceRoot: Node, targetRoot: Node): js.Promise[DataObject] = js.native
  def apply(sourceRoot: Node, targetRoot: Node, callback: ResultCallback[DataObject]): Unit = js.native
}

