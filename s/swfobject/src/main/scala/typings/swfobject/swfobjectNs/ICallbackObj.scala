package typings.swfobject.swfobjectNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallbackObj extends js.Object {
  var id: String
  var ref: js.UndefOr[HTMLElement] = js.undefined
  var success: Boolean
}

object ICallbackObj {
  @scala.inline
  def apply(id: String, success: Boolean, ref: HTMLElement = null): ICallbackObj = {
    val __obj = js.Dynamic.literal(id = id, success = success)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ICallbackObj]
  }
}

