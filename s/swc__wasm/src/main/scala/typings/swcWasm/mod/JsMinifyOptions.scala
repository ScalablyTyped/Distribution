package typings.swcWasm.mod

import typings.swcWasm.anon.JsFormatOptionsToSnakeCas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsMinifyOptions extends StObject {
  
  var compress: js.UndefOr[TerserCompressOptions | Boolean] = js.undefined
  
  var ecma: js.UndefOr[TerserEcmaVersion] = js.undefined
  
  var format: js.UndefOr[JsFormatOptionsToSnakeCas] = js.undefined
  
  var inlineSourcesContent: js.UndefOr[Boolean] = js.undefined
  
  var keep_classnames: js.UndefOr[Boolean] = js.undefined
  
  var keep_fnames: js.UndefOr[Boolean] = js.undefined
  
  var mangle: js.UndefOr[TerserMangleOptions | Boolean] = js.undefined
  
  var module: js.UndefOr[Boolean] = js.undefined
  
  var outputPath: js.UndefOr[String] = js.undefined
  
  var safari10: js.UndefOr[Boolean] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var toplevel: js.UndefOr[Boolean] = js.undefined
}
object JsMinifyOptions {
  
  inline def apply(): JsMinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsMinifyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsMinifyOptions] (val x: Self) extends AnyVal {
    
    inline def setCompress(value: TerserCompressOptions | Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setEcma(value: TerserEcmaVersion): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
    
    inline def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
    
    inline def setFormat(value: JsFormatOptionsToSnakeCas): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInlineSourcesContent(value: Boolean): Self = StObject.set(x, "inlineSourcesContent", value.asInstanceOf[js.Any])
    
    inline def setInlineSourcesContentUndefined: Self = StObject.set(x, "inlineSourcesContent", js.undefined)
    
    inline def setKeep_classnames(value: Boolean): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
    
    inline def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
    
    inline def setKeep_fnames(value: Boolean): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
    
    inline def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
    
    inline def setMangle(value: TerserMangleOptions | Boolean): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
    
    inline def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
    
    inline def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
    
    inline def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
  }
}
