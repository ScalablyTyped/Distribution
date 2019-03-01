package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg2JsOptions extends js.Object {
  /** @default true */
  var lowercase: js.UndefOr[scala.Boolean] = js.undefined
  /** @default true */
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  /** @default true */
  var position: js.UndefOr[scala.Boolean] = js.undefined
  /** @default true */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /** @default false */
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  /** @default true */
  var xmlns: js.UndefOr[scala.Boolean] = js.undefined
}

object Svg2JsOptions {
  @scala.inline
  def apply(
    lowercase: js.UndefOr[scala.Boolean] = js.undefined,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    xmlns: js.UndefOr[scala.Boolean] = js.undefined
  ): Svg2JsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[Svg2JsOptions]
  }
}

