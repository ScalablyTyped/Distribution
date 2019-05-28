package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNodeDataObject extends js.Object {
  def apply(node: webgmeLib.CoreNs.Node): js.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    node: webgmeLib.CoreNs.Node,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

