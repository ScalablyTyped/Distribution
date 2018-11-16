package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NodeGuid extends js.Object {
  def apply(node: webgmeLib.CoreNs.Node, guid: webgmeLib.CoreNs.GUID): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    node: webgmeLib.CoreNs.Node,
    guid: webgmeLib.CoreNs.GUID,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): js.UndefOr[nodeLib.Error] = js.native
}

