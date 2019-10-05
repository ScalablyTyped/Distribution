package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.Core.Node
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackSourceRoot extends js.Object {
  def apply(sourceRoot: Node, targetRoot: Node): js.Promise[DataObject] = js.native
  def apply(sourceRoot: Node, targetRoot: Node, callback: ResultCallback[DataObject]): Unit = js.native
}

