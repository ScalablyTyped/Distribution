package typings.webgme

import typings.webgme.CoreNs.Node
import typings.webgme.GmeCommonNs.DataObject
import typings.webgme.GmeCommonNs.Path
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackRelativePath extends js.Object {
  def apply(startNode: Node, relativePath: Path): js.Promise[DataObject] = js.native
  def apply(startNode: Node, relativePath: Path, callback: ResultCallback[DataObject]): Unit = js.native
}

