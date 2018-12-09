package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Target extends js.Object {
  def apply(target: webgmeLib.CoreNs.Node, pointerName: webgmeLib.GmeCommonNs.Name): js.Promise[js.Array[webgmeLib.GmeCommonNs.DataObject]] = js.native
  def apply(
    target: webgmeLib.CoreNs.Node,
    pointerName: webgmeLib.GmeCommonNs.Name,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.DataObject]]
  ): scala.Unit = js.native
}

