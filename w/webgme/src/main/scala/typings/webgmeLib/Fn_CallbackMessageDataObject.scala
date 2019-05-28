package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMessageDataObject extends js.Object {
  def apply(message: java.lang.String): js.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    message: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

