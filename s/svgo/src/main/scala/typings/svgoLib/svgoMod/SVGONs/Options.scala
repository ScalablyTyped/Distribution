package typings
package svgoLib.svgoMod.SVGONs

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
  var js2svg: js.UndefOr[svgoLib.svgoMod.Js2SvgOptions] = js.undefined
  /**
    * Individual plugin configurations.
    * For specific options, see plugin source in https://github.com/svg/svgo/tree/master/plugins.
    */
  var plugins: js.UndefOr[js.Array[svgoLib.PluginConfig]] = js.undefined
  /** Options for parsing original SVG into AST. */
  var svg2js: js.UndefOr[svgoLib.svgoMod.Svg2JsOptions] = js.undefined
}

