package typings
package ynLib.ynMod.ynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithDefault extends Options {
  @JSName("default")
  var default_OptionsWithDefault: scala.Boolean
}

object OptionsWithDefault {
  @scala.inline
  def apply(default: scala.Boolean, lenient: js.UndefOr[scala.Boolean] = js.undefined): OptionsWithDefault = {
    val __obj = js.Dynamic.literal(default = default)
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    __obj.asInstanceOf[OptionsWithDefault]
  }
}

