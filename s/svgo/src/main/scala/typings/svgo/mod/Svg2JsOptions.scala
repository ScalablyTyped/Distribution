package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg2JsOptions extends js.Object {
  /** @default true */
  var lowercase: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var normalize: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var position: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var strict: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var trim: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var xmlns: js.UndefOr[Boolean] = js.undefined
}

object Svg2JsOptions {
  @scala.inline
  def apply(
    lowercase: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined,
    xmlns: js.UndefOr[Boolean] = js.undefined
  ): Svg2JsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Svg2JsOptions]
  }
}

