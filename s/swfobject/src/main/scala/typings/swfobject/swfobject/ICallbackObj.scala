package typings.swfobject.swfobject

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICallbackObj]
  }
}

