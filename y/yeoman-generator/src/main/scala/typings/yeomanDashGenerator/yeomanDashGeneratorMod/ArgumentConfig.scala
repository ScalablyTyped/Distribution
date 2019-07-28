package typings.yeomanDashGenerator.yeomanDashGeneratorMod

import typings.std.ArrayConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentConfig extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[StringConstructor | NumberConstructor | ArrayConstructor | ObjectConstructor] = js.undefined
}

object ArgumentConfig {
  @scala.inline
  def apply(
    default: js.Any = null,
    description: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    `type`: StringConstructor | NumberConstructor | ArrayConstructor | ObjectConstructor = null
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

