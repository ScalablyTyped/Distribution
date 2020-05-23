package typings.svgo.mod

import typings.svgo.svgoStrings.base64
import typings.svgo.svgoStrings.enc
import typings.svgo.svgoStrings.unenc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Output as Data URI string. */
  var datauri: js.UndefOr[base64 | enc | unenc] = js.undefined
  /** Precision of floating point numbers. Will be passed to each plugin that suppors this param. */
  var floatPrecision: js.UndefOr[Double] = js.undefined
  /** Use full set of plugins. */
  var full: js.UndefOr[Boolean] = js.undefined
  /** Options for rendering optimized SVG from AST. */
  var js2svg: js.UndefOr[Js2SvgOptions] = js.undefined
  /**
    * Individual plugin configurations.
    * For specific options, see plugin source in https://github.com/svg/svgo/tree/master/plugins.
    */
  var plugins: js.UndefOr[js.Array[PluginConfig]] = js.undefined
  /** Options for parsing original SVG into AST. */
  var svg2js: js.UndefOr[Svg2JsOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    datauri: base64 | enc | unenc = null,
    floatPrecision: js.UndefOr[Double] = js.undefined,
    full: js.UndefOr[Boolean] = js.undefined,
    js2svg: Js2SvgOptions = null,
    plugins: js.Array[PluginConfig] = null,
    svg2js: Svg2JsOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (datauri != null) __obj.updateDynamic("datauri")(datauri.asInstanceOf[js.Any])
    if (!js.isUndefined(floatPrecision)) __obj.updateDynamic("floatPrecision")(floatPrecision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (js2svg != null) __obj.updateDynamic("js2svg")(js2svg.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (svg2js != null) __obj.updateDynamic("svg2js")(svg2js.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

