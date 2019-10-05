package typings.webgme

import typings.std.Error
import typings.webgme.Core.DataObject
import typings.webgme.Core.GUID
import typings.webgme.Core.Node
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackGuid extends js.Object {
  def apply(node: Node, guid: GUID): js.Promise[DataObject] = js.native
  def apply(node: Node, guid: GUID, callback: ResultCallback[DataObject]): js.UndefOr[Error] = js.native
}

