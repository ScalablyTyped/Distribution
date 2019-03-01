package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentConfig extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[
    stdLib.StringConstructor | stdLib.NumberConstructor | stdLib.ArrayConstructor | stdLib.ObjectConstructor
  ] = js.undefined
}

object ArgumentConfig {
  @scala.inline
  def apply(
    default: js.Any = null,
    description: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: stdLib.StringConstructor | stdLib.NumberConstructor | stdLib.ArrayConstructor | stdLib.ObjectConstructor = null
  ): ArgumentConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentConfig]
  }
}

