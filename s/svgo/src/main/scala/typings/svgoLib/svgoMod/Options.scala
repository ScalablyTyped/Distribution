package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Output as Data URI string. */
  var datauri: js.UndefOr[
    svgoLib.svgoLibStrings.base64 | svgoLib.svgoLibStrings.enc | svgoLib.svgoLibStrings.unenc
  ] = js.undefined
  /** Precision of floating point numbers. Will be passed to each plugin that suppors this param. */
  var floatPrecision: js.UndefOr[scala.Double] = js.undefined
  /** Use full set of plugins. */
  var full: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for rendering optimized SVG from AST. */
  var js2svg: js.UndefOr[Js2SvgOptions] = js.undefined
  /**
    * Individual plugin configurations.
    * For specific options, see plugin source in https://github.com/svg/svgo/tree/master/plugins.
    */
  var plugins: js.UndefOr[js.Array[svgoLib.PluginConfig]] = js.undefined
  /** Options for parsing original SVG into AST. */
  var svg2js: js.UndefOr[Svg2JsOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    datauri: svgoLib.svgoLibStrings.base64 | svgoLib.svgoLibStrings.enc | svgoLib.svgoLibStrings.unenc = null,
    floatPrecision: scala.Int | scala.Double = null,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    js2svg: Js2SvgOptions = null,
    plugins: js.Array[svgoLib.PluginConfig] = null,
    svg2js: Svg2JsOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (datauri != null) __obj.updateDynamic("datauri")(datauri.asInstanceOf[js.Any])
    if (floatPrecision != null) __obj.updateDynamic("floatPrecision")(floatPrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (js2svg != null) __obj.updateDynamic("js2svg")(js2svg)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (svg2js != null) __obj.updateDynamic("svg2js")(svg2js)
    __obj.asInstanceOf[Options]
  }
}

