package typings.swcWasm.mod

import typings.swcWasm.swcWasmBooleans.`false`
import typings.swcWasm.swcWasmStrings.all
import typings.swcWasm.swcWasmStrings.some
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsFormatOptions extends StObject {
  
  /**
    * Currently noop.
    * @default false
    * @alias ascii_only
    */
  var asciiOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    * @default false
    */
  var beautify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    * @default false
    */
  var braces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - `false`: removes all comments
    * - `'some'`: preserves some comments
    * - `'all'`: preserves all comments
    * @default false
    */
  var comments: js.UndefOr[`false` | some | all] = js.undefined
  
  /**
    * Currently noop.
    * @default 5
    */
  var ecma: js.UndefOr[TerserEcmaVersion] = js.undefined
  
  /**
    * Currently noop.
    * @alias indent_level
    */
  var indentLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Currently noop.
    * @alias indent_start
    */
  var indentStart: js.UndefOr[Double] = js.undefined
  
  /**
    * Currently noop.
    * @alias inline_script
    */
  var inlineScript: js.UndefOr[Double] = js.undefined
  
  /**
    * Currently noop.
    * @alias keep_numbers
    */
  var keepNumbers: js.UndefOr[Double] = js.undefined
  
  /**
    * Currently noop.
    * @alias keep_quoted_props
    */
  var keepQuotedProps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    * @alias max_line_len
    */
  var maxLineLen: js.UndefOr[Double | `false`] = js.undefined
  
  /**
    * Currently noop.
    */
  var preamble: js.UndefOr[String] = js.undefined
  
  /**
    * Currently noop.
    * @alias preserve_annotations
    */
  var preserveAnnotations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    * @alias quote_keys
    */
  var quoteKeys: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    * @alias quote_style
    */
  var quoteStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    */
  var safari10: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    */
  var semicolons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    */
  var shebang: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    */
  var webkit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    * @alias wrap_func_args
    */
  var wrapFuncArgs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currently noop.
    * @alias wrap_iife
    */
  var wrapIife: js.UndefOr[Boolean] = js.undefined
}
object JsFormatOptions {
  
  inline def apply(): JsFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setAsciiOnly(value: Boolean): Self = StObject.set(x, "asciiOnly", value.asInstanceOf[js.Any])
    
    inline def setAsciiOnlyUndefined: Self = StObject.set(x, "asciiOnly", js.undefined)
    
    inline def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
    
    inline def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
    
    inline def setBraces(value: Boolean): Self = StObject.set(x, "braces", value.asInstanceOf[js.Any])
    
    inline def setBracesUndefined: Self = StObject.set(x, "braces", js.undefined)
    
    inline def setComments(value: `false` | some | all): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setEcma(value: TerserEcmaVersion): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
    
    inline def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
    
    inline def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    inline def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    inline def setIndentStart(value: Double): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
    
    inline def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
    
    inline def setInlineScript(value: Double): Self = StObject.set(x, "inlineScript", value.asInstanceOf[js.Any])
    
    inline def setInlineScriptUndefined: Self = StObject.set(x, "inlineScript", js.undefined)
    
    inline def setKeepNumbers(value: Double): Self = StObject.set(x, "keepNumbers", value.asInstanceOf[js.Any])
    
    inline def setKeepNumbersUndefined: Self = StObject.set(x, "keepNumbers", js.undefined)
    
    inline def setKeepQuotedProps(value: Boolean): Self = StObject.set(x, "keepQuotedProps", value.asInstanceOf[js.Any])
    
    inline def setKeepQuotedPropsUndefined: Self = StObject.set(x, "keepQuotedProps", js.undefined)
    
    inline def setMaxLineLen(value: Double | `false`): Self = StObject.set(x, "maxLineLen", value.asInstanceOf[js.Any])
    
    inline def setMaxLineLenUndefined: Self = StObject.set(x, "maxLineLen", js.undefined)
    
    inline def setPreamble(value: String): Self = StObject.set(x, "preamble", value.asInstanceOf[js.Any])
    
    inline def setPreambleUndefined: Self = StObject.set(x, "preamble", js.undefined)
    
    inline def setPreserveAnnotations(value: Boolean): Self = StObject.set(x, "preserveAnnotations", value.asInstanceOf[js.Any])
    
    inline def setPreserveAnnotationsUndefined: Self = StObject.set(x, "preserveAnnotations", js.undefined)
    
    inline def setQuoteKeys(value: Boolean): Self = StObject.set(x, "quoteKeys", value.asInstanceOf[js.Any])
    
    inline def setQuoteKeysUndefined: Self = StObject.set(x, "quoteKeys", js.undefined)
    
    inline def setQuoteStyle(value: Boolean): Self = StObject.set(x, "quoteStyle", value.asInstanceOf[js.Any])
    
    inline def setQuoteStyleUndefined: Self = StObject.set(x, "quoteStyle", js.undefined)
    
    inline def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
    
    inline def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
    
    inline def setSemicolons(value: Boolean): Self = StObject.set(x, "semicolons", value.asInstanceOf[js.Any])
    
    inline def setSemicolonsUndefined: Self = StObject.set(x, "semicolons", js.undefined)
    
    inline def setShebang(value: Boolean): Self = StObject.set(x, "shebang", value.asInstanceOf[js.Any])
    
    inline def setShebangUndefined: Self = StObject.set(x, "shebang", js.undefined)
    
    inline def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
    
    inline def setWebkitUndefined: Self = StObject.set(x, "webkit", js.undefined)
    
    inline def setWrapFuncArgs(value: Boolean): Self = StObject.set(x, "wrapFuncArgs", value.asInstanceOf[js.Any])
    
    inline def setWrapFuncArgsUndefined: Self = StObject.set(x, "wrapFuncArgs", js.undefined)
    
    inline def setWrapIife(value: Boolean): Self = StObject.set(x, "wrapIife", value.asInstanceOf[js.Any])
    
    inline def setWrapIifeUndefined: Self = StObject.set(x, "wrapIife", js.undefined)
  }
}
