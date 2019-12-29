package typings.terser.terserMod

import typings.std.RegExp
import typings.terser.terserBooleans.`false`
import typings.terser.terserStrings.all
import typings.terser.terserStrings.some
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputOptions extends js.Object {
  var ascii_only: js.UndefOr[Boolean] = js.undefined
  var beautify: js.UndefOr[Boolean] = js.undefined
  var braces: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[Boolean | all | some | RegExp | js.Function] = js.undefined
  var ecma: js.UndefOr[ECMA] = js.undefined
  var ie8: js.UndefOr[Boolean] = js.undefined
  var indent_level: js.UndefOr[Double] = js.undefined
  var indent_start: js.UndefOr[Double] = js.undefined
  var inline_script: js.UndefOr[Boolean] = js.undefined
  var keep_quoted_props: js.UndefOr[Boolean] = js.undefined
  var max_line_len: js.UndefOr[Double | `false`] = js.undefined
  var preamble: js.UndefOr[String] = js.undefined
  var quote_keys: js.UndefOr[Boolean] = js.undefined
  var quote_style: js.UndefOr[OutputQuoteStyle] = js.undefined
  var safari10: js.UndefOr[Boolean] = js.undefined
  var semicolons: js.UndefOr[Boolean] = js.undefined
  var shebang: js.UndefOr[Boolean] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var source_map: js.UndefOr[SourceMapOptions] = js.undefined
  var webkit: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrap_iife: js.UndefOr[Boolean] = js.undefined
}

object OutputOptions {
  @scala.inline
  def apply(
    ascii_only: js.UndefOr[Boolean] = js.undefined,
    beautify: js.UndefOr[Boolean] = js.undefined,
    braces: js.UndefOr[Boolean] = js.undefined,
    comments: Boolean | all | some | RegExp | js.Function = null,
    ecma: ECMA = null,
    ie8: js.UndefOr[Boolean] = js.undefined,
    indent_level: Int | Double = null,
    indent_start: Int | Double = null,
    inline_script: js.UndefOr[Boolean] = js.undefined,
    keep_quoted_props: js.UndefOr[Boolean] = js.undefined,
    max_line_len: Double | `false` = null,
    preamble: String = null,
    quote_keys: js.UndefOr[Boolean] = js.undefined,
    quote_style: OutputQuoteStyle = null,
    safari10: js.UndefOr[Boolean] = js.undefined,
    semicolons: js.UndefOr[Boolean] = js.undefined,
    shebang: js.UndefOr[Boolean] = js.undefined,
    shorthand: js.UndefOr[Boolean] = js.undefined,
    source_map: SourceMapOptions = null,
    webkit: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    wrap_iife: js.UndefOr[Boolean] = js.undefined
  ): OutputOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascii_only)) __obj.updateDynamic("ascii_only")(ascii_only.asInstanceOf[js.Any])
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify.asInstanceOf[js.Any])
    if (!js.isUndefined(braces)) __obj.updateDynamic("braces")(braces.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (ecma != null) __obj.updateDynamic("ecma")(ecma.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8.asInstanceOf[js.Any])
    if (indent_level != null) __obj.updateDynamic("indent_level")(indent_level.asInstanceOf[js.Any])
    if (indent_start != null) __obj.updateDynamic("indent_start")(indent_start.asInstanceOf[js.Any])
    if (!js.isUndefined(inline_script)) __obj.updateDynamic("inline_script")(inline_script.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_quoted_props)) __obj.updateDynamic("keep_quoted_props")(keep_quoted_props.asInstanceOf[js.Any])
    if (max_line_len != null) __obj.updateDynamic("max_line_len")(max_line_len.asInstanceOf[js.Any])
    if (preamble != null) __obj.updateDynamic("preamble")(preamble.asInstanceOf[js.Any])
    if (!js.isUndefined(quote_keys)) __obj.updateDynamic("quote_keys")(quote_keys.asInstanceOf[js.Any])
    if (quote_style != null) __obj.updateDynamic("quote_style")(quote_style.asInstanceOf[js.Any])
    if (!js.isUndefined(safari10)) __obj.updateDynamic("safari10")(safari10.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolons)) __obj.updateDynamic("semicolons")(semicolons.asInstanceOf[js.Any])
    if (!js.isUndefined(shebang)) __obj.updateDynamic("shebang")(shebang.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand.asInstanceOf[js.Any])
    if (source_map != null) __obj.updateDynamic("source_map")(source_map.asInstanceOf[js.Any])
    if (!js.isUndefined(webkit)) __obj.updateDynamic("webkit")(webkit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap_iife)) __obj.updateDynamic("wrap_iife")(wrap_iife.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputOptions]
  }
}

