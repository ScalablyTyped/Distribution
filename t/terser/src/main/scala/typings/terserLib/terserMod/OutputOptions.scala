package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputOptions extends js.Object {
  var ascii_only: js.UndefOr[scala.Boolean] = js.undefined
  var beautify: js.UndefOr[scala.Boolean] = js.undefined
  var braces: js.UndefOr[scala.Boolean] = js.undefined
  var comments: js.UndefOr[
    scala.Boolean | terserLib.terserLibStrings.all | terserLib.terserLibStrings.some | stdLib.RegExp
  ] = js.undefined
  var ecma: js.UndefOr[ECMA] = js.undefined
  var ie8: js.UndefOr[scala.Boolean] = js.undefined
  var indent_level: js.UndefOr[scala.Double] = js.undefined
  var indent_start: js.UndefOr[scala.Boolean] = js.undefined
  var inline_script: js.UndefOr[scala.Boolean] = js.undefined
  var keep_quoted_props: js.UndefOr[scala.Boolean] = js.undefined
  var max_line_len: js.UndefOr[scala.Boolean] = js.undefined
  var preamble: js.UndefOr[java.lang.String] = js.undefined
  var quote_keys: js.UndefOr[scala.Boolean] = js.undefined
  var quote_style: js.UndefOr[OutputQuoteStyle] = js.undefined
  var safari10: js.UndefOr[scala.Boolean] = js.undefined
  var semicolons: js.UndefOr[scala.Boolean] = js.undefined
  var shebang: js.UndefOr[scala.Boolean] = js.undefined
  var shorthand: js.UndefOr[scala.Boolean] = js.undefined
  var source_map: js.UndefOr[SourceMapOptions] = js.undefined
  var webkit: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var wrap_iife: js.UndefOr[scala.Boolean] = js.undefined
}

object OutputOptions {
  @scala.inline
  def apply(
    ascii_only: js.UndefOr[scala.Boolean] = js.undefined,
    beautify: js.UndefOr[scala.Boolean] = js.undefined,
    braces: js.UndefOr[scala.Boolean] = js.undefined,
    comments: scala.Boolean | terserLib.terserLibStrings.all | terserLib.terserLibStrings.some | stdLib.RegExp = null,
    ecma: ECMA = null,
    ie8: js.UndefOr[scala.Boolean] = js.undefined,
    indent_level: scala.Int | scala.Double = null,
    indent_start: js.UndefOr[scala.Boolean] = js.undefined,
    inline_script: js.UndefOr[scala.Boolean] = js.undefined,
    keep_quoted_props: js.UndefOr[scala.Boolean] = js.undefined,
    max_line_len: js.UndefOr[scala.Boolean] = js.undefined,
    preamble: java.lang.String = null,
    quote_keys: js.UndefOr[scala.Boolean] = js.undefined,
    quote_style: OutputQuoteStyle = null,
    safari10: js.UndefOr[scala.Boolean] = js.undefined,
    semicolons: js.UndefOr[scala.Boolean] = js.undefined,
    shebang: js.UndefOr[scala.Boolean] = js.undefined,
    shorthand: js.UndefOr[scala.Boolean] = js.undefined,
    source_map: SourceMapOptions = null,
    webkit: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    wrap_iife: js.UndefOr[scala.Boolean] = js.undefined
  ): OutputOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascii_only)) __obj.updateDynamic("ascii_only")(ascii_only)
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify)
    if (!js.isUndefined(braces)) __obj.updateDynamic("braces")(braces)
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (ecma != null) __obj.updateDynamic("ecma")(ecma)
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8)
    if (indent_level != null) __obj.updateDynamic("indent_level")(indent_level.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_start)) __obj.updateDynamic("indent_start")(indent_start)
    if (!js.isUndefined(inline_script)) __obj.updateDynamic("inline_script")(inline_script)
    if (!js.isUndefined(keep_quoted_props)) __obj.updateDynamic("keep_quoted_props")(keep_quoted_props)
    if (!js.isUndefined(max_line_len)) __obj.updateDynamic("max_line_len")(max_line_len)
    if (preamble != null) __obj.updateDynamic("preamble")(preamble)
    if (!js.isUndefined(quote_keys)) __obj.updateDynamic("quote_keys")(quote_keys)
    if (quote_style != null) __obj.updateDynamic("quote_style")(quote_style)
    if (!js.isUndefined(safari10)) __obj.updateDynamic("safari10")(safari10)
    if (!js.isUndefined(semicolons)) __obj.updateDynamic("semicolons")(semicolons)
    if (!js.isUndefined(shebang)) __obj.updateDynamic("shebang")(shebang)
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand)
    if (source_map != null) __obj.updateDynamic("source_map")(source_map)
    if (!js.isUndefined(webkit)) __obj.updateDynamic("webkit")(webkit)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap_iife)) __obj.updateDynamic("wrap_iife")(wrap_iife)
    __obj.asInstanceOf[OutputOptions]
  }
}

