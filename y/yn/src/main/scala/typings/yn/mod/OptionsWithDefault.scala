package typings.yn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithDefault extends Options {
  @JSName("default")
  var default_OptionsWithDefault: Boolean
}

object OptionsWithDefault {
  @scala.inline
  def apply(default: Boolean, lenient: js.UndefOr[Boolean] = js.undefined): OptionsWithDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithDefault]
  }
}

