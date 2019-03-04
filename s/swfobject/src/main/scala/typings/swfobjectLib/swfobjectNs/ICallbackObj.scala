package typings
package swfobjectLib.swfobjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallbackObj extends js.Object {
  var id: java.lang.String
  var ref: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var success: scala.Boolean
}

object ICallbackObj {
  @scala.inline
  def apply(id: java.lang.String, success: scala.Boolean, ref: stdLib.HTMLElement = null): ICallbackObj = {
    val __obj = js.Dynamic.literal(id = id, success = success)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ICallbackObj]
  }
}

