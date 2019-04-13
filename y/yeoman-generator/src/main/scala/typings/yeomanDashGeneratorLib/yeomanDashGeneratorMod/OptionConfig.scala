package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionConfig extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[stdLib.BooleanConstructor | stdLib.StringConstructor | stdLib.NumberConstructor] = js.undefined
}

object OptionConfig {
  @scala.inline
  def apply(
    alias: java.lang.String = null,
    default: js.Any = null,
    description: java.lang.String = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: stdLib.BooleanConstructor | stdLib.StringConstructor | stdLib.NumberConstructor = null
  ): OptionConfig = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionConfig]
  }
}

