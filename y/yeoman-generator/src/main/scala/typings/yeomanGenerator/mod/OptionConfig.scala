package typings.yeomanGenerator.mod

import org.scalablytyped.runtime.Instantiable0
import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.StringConstructor
import typings.std.global.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionConfig extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[
    (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number])
  ] = js.undefined
}

object OptionConfig {
  @scala.inline
  def apply(
    alias: String = null,
    default: js.Any = null,
    description: String = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    `type`: (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) = null
  ): OptionConfig = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionConfig]
  }
}

