package typings.terser.mod

import typings.terser.anon.Col
import typings.terser.terserBooleans.`false`
import typings.terser.terserStrings.all
import typings.terser.terserStrings.some
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatOptions extends StObject {
  
  var ascii_only: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated Not implemented anymore */
  var beautify: js.UndefOr[Boolean] = js.undefined
  
  var braces: js.UndefOr[Boolean] = js.undefined
  
  var comments: js.UndefOr[
    Boolean | all | some | js.RegExp | (js.Function2[/* node */ Any, /* comment */ Col, Boolean])
  ] = js.undefined
  
  var ecma: js.UndefOr[ECMA] = js.undefined
  
  var ie8: js.UndefOr[Boolean] = js.undefined
  
  var indent_level: js.UndefOr[Double] = js.undefined
  
  var indent_start: js.UndefOr[Double] = js.undefined
  
  var inline_script: js.UndefOr[Boolean] = js.undefined
  
  var keep_numbers: js.UndefOr[Boolean] = js.undefined
  
  var keep_quoted_props: js.UndefOr[Boolean] = js.undefined
  
  var max_line_len: js.UndefOr[Double | `false`] = js.undefined
  
  var preamble: js.UndefOr[String] = js.undefined
  
  var preserve_annotations: js.UndefOr[Boolean] = js.undefined
  
  var quote_keys: js.UndefOr[Boolean] = js.undefined
  
  var quote_style: js.UndefOr[OutputQuoteStyle] = js.undefined
  
  var safari10: js.UndefOr[Boolean] = js.undefined
  
  var semicolons: js.UndefOr[Boolean] = js.undefined
  
  var shebang: js.UndefOr[Boolean] = js.undefined
  
  var shorthand: js.UndefOr[Boolean] = js.undefined
  
  var source_map: js.UndefOr[SourceMapOptions] = js.undefined
  
  var webkit: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wrap_func_args: js.UndefOr[Boolean] = js.undefined
  
  var wrap_iife: js.UndefOr[Boolean] = js.undefined
}
object FormatOptions {
  
  inline def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  
  extension [Self <: FormatOptions](x: Self) {
    
    inline def setAscii_only(value: Boolean): Self = StObject.set(x, "ascii_only", value.asInstanceOf[js.Any])
    
    inline def setAscii_onlyUndefined: Self = StObject.set(x, "ascii_only", js.undefined)
    
    inline def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
    
    inline def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
    
    inline def setBraces(value: Boolean): Self = StObject.set(x, "braces", value.asInstanceOf[js.Any])
    
    inline def setBracesUndefined: Self = StObject.set(x, "braces", js.undefined)
    
    inline def setComments(
      value: Boolean | all | some | js.RegExp | (js.Function2[/* node */ Any, /* comment */ Col, Boolean])
    ): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsFunction2(value: (/* node */ Any, /* comment */ Col) => Boolean): Self = StObject.set(x, "comments", js.Any.fromFunction2(value))
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
    
    inline def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
    
    inline def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
    
    inline def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
    
    inline def setIndent_level(value: Double): Self = StObject.set(x, "indent_level", value.asInstanceOf[js.Any])
    
    inline def setIndent_levelUndefined: Self = StObject.set(x, "indent_level", js.undefined)
    
    inline def setIndent_start(value: Double): Self = StObject.set(x, "indent_start", value.asInstanceOf[js.Any])
    
    inline def setIndent_startUndefined: Self = StObject.set(x, "indent_start", js.undefined)
    
    inline def setInline_script(value: Boolean): Self = StObject.set(x, "inline_script", value.asInstanceOf[js.Any])
    
    inline def setInline_scriptUndefined: Self = StObject.set(x, "inline_script", js.undefined)
    
    inline def setKeep_numbers(value: Boolean): Self = StObject.set(x, "keep_numbers", value.asInstanceOf[js.Any])
    
    inline def setKeep_numbersUndefined: Self = StObject.set(x, "keep_numbers", js.undefined)
    
    inline def setKeep_quoted_props(value: Boolean): Self = StObject.set(x, "keep_quoted_props", value.asInstanceOf[js.Any])
    
    inline def setKeep_quoted_propsUndefined: Self = StObject.set(x, "keep_quoted_props", js.undefined)
    
    inline def setMax_line_len(value: Double | `false`): Self = StObject.set(x, "max_line_len", value.asInstanceOf[js.Any])
    
    inline def setMax_line_lenUndefined: Self = StObject.set(x, "max_line_len", js.undefined)
    
    inline def setPreamble(value: String): Self = StObject.set(x, "preamble", value.asInstanceOf[js.Any])
    
    inline def setPreambleUndefined: Self = StObject.set(x, "preamble", js.undefined)
    
    inline def setPreserve_annotations(value: Boolean): Self = StObject.set(x, "preserve_annotations", value.asInstanceOf[js.Any])
    
    inline def setPreserve_annotationsUndefined: Self = StObject.set(x, "preserve_annotations", js.undefined)
    
    inline def setQuote_keys(value: Boolean): Self = StObject.set(x, "quote_keys", value.asInstanceOf[js.Any])
    
    inline def setQuote_keysUndefined: Self = StObject.set(x, "quote_keys", js.undefined)
    
    inline def setQuote_style(value: OutputQuoteStyle): Self = StObject.set(x, "quote_style", value.asInstanceOf[js.Any])
    
    inline def setQuote_styleUndefined: Self = StObject.set(x, "quote_style", js.undefined)
    
    inline def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
    
    inline def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
    
    inline def setSemicolons(value: Boolean): Self = StObject.set(x, "semicolons", value.asInstanceOf[js.Any])
    
    inline def setSemicolonsUndefined: Self = StObject.set(x, "semicolons", js.undefined)
    
    inline def setShebang(value: Boolean): Self = StObject.set(x, "shebang", value.asInstanceOf[js.Any])
    
    inline def setShebangUndefined: Self = StObject.set(x, "shebang", js.undefined)
    
    inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    
    inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
    
    inline def setSource_map(value: SourceMapOptions): Self = StObject.set(x, "source_map", value.asInstanceOf[js.Any])
    
    inline def setSource_mapUndefined: Self = StObject.set(x, "source_map", js.undefined)
    
    inline def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
    
    inline def setWebkitUndefined: Self = StObject.set(x, "webkit", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrap_func_args(value: Boolean): Self = StObject.set(x, "wrap_func_args", value.asInstanceOf[js.Any])
    
    inline def setWrap_func_argsUndefined: Self = StObject.set(x, "wrap_func_args", js.undefined)
    
    inline def setWrap_iife(value: Boolean): Self = StObject.set(x, "wrap_iife", value.asInstanceOf[js.Any])
    
    inline def setWrap_iifeUndefined: Self = StObject.set(x, "wrap_iife", js.undefined)
  }
}
