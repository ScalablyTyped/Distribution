package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Source extends js.Object {
  def apply(source: webgmeLib.CoreNs.Node, pointerName: java.lang.String): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    source: webgmeLib.CoreNs.Node,
    pointerName: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

