package typings
package theoLib.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertOptions extends js.Object {
  var format: FormatOptions
  var resolveAliases: js.UndefOr[scala.Boolean] = js.undefined
  var resolveMetaAliases: js.UndefOr[scala.Boolean] = js.undefined
  var transform: TransformOptions[scala.Nothing]
}

object ConvertOptions {
  @scala.inline
  def apply(
    format: FormatOptions,
    transform: TransformOptions[scala.Nothing],
    resolveAliases: js.UndefOr[scala.Boolean] = js.undefined,
    resolveMetaAliases: js.UndefOr[scala.Boolean] = js.undefined
  ): ConvertOptions = {
    val __obj = js.Dynamic.literal(format = format, transform = transform)
    if (!js.isUndefined(resolveAliases)) __obj.updateDynamic("resolveAliases")(resolveAliases)
    if (!js.isUndefined(resolveMetaAliases)) __obj.updateDynamic("resolveMetaAliases")(resolveMetaAliases)
    __obj.asInstanceOf[ConvertOptions]
  }
}

