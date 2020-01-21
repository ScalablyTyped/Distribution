package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertOptions extends js.Object {
  var format: FormatOptions
  var resolveAliases: js.UndefOr[Boolean] = js.undefined
  var resolveMetaAliases: js.UndefOr[Boolean] = js.undefined
  var transform: TransformOptions[scala.Nothing]
}

object ConvertOptions {
  @scala.inline
  def apply(
    format: FormatOptions,
    transform: TransformOptions[scala.Nothing],
    resolveAliases: js.UndefOr[Boolean] = js.undefined,
    resolveMetaAliases: js.UndefOr[Boolean] = js.undefined
  ): ConvertOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveAliases)) __obj.updateDynamic("resolveAliases")(resolveAliases.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveMetaAliases)) __obj.updateDynamic("resolveMetaAliases")(resolveMetaAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
}

