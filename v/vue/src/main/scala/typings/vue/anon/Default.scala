package typings.vue.anon

import typings.vue.optionsMod.InjectKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var from: js.UndefOr[InjectKey] = js.undefined
}

object Default {
  @scala.inline
  def apply(default: js.Any = null, from: InjectKey = null): Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

