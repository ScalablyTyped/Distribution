package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackPatch extends js.Object {
  def apply(root: webgmeLib.CoreNs.Node, patch: webgmeLib.CoreNs.DataObject): js.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    root: webgmeLib.CoreNs.Node,
    patch: webgmeLib.CoreNs.DataObject,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

