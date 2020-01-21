package typings.vue

import typings.vue.optionsMod.InjectKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var from: js.UndefOr[InjectKey] = js.undefined
}

object AnonDefault {
  @scala.inline
  def apply(default: js.Any = null, from: InjectKey = null): AnonDefault = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

