package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackSourceRoot extends js.Object {
  def apply(sourceRoot: webgmeLib.CoreNs.Node, targetRoot: webgmeLib.CoreNs.Node): js.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    sourceRoot: webgmeLib.CoreNs.Node,
    targetRoot: webgmeLib.CoreNs.Node,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

