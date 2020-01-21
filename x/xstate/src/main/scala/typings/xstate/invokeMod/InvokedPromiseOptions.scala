package typings.xstate.invokeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokedPromiseOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object InvokedPromiseOptions {
  @scala.inline
  def apply(id: String = null): InvokedPromiseOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokedPromiseOptions]
  }
}

