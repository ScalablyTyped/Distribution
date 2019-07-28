package typings.webgme

import typings.std.Error
import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.GUID
import typings.webgme.CoreNs.Node
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackGuid extends js.Object {
  def apply(node: Node, guid: GUID): js.Promise[DataObject] = js.native
  def apply(node: Node, guid: GUID, callback: ResultCallback[DataObject]): js.UndefOr[Error] = js.native
}

