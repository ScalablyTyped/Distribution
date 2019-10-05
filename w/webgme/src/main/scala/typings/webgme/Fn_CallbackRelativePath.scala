package typings.webgme

import typings.webgme.Core.Node
import typings.webgme.GmeCommon.DataObject
import typings.webgme.GmeCommon.Path
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackRelativePath extends js.Object {
  def apply(startNode: Node, relativePath: Path): js.Promise[DataObject] = js.native
  def apply(startNode: Node, relativePath: Path, callback: ResultCallback[DataObject]): Unit = js.native
}

