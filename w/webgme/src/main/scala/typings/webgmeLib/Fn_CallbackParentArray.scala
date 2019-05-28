package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackParentArray extends js.Object {
  def apply(parent: webgmeLib.CoreNs.Node): js.Promise[js.Array[webgmeLib.GmeCommonNs.DataObject]] = js.native
  def apply(
    parent: webgmeLib.CoreNs.Node,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.DataObject]]
  ): scala.Unit = js.native
}

