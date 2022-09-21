package typings.terser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinifyOptions extends StObject {
  
  var compress: js.UndefOr[Boolean | CompressOptions] = js.undefined
  
  var ecma: js.UndefOr[ECMA] = js.undefined
  
  var enclose: js.UndefOr[Boolean | String] = js.undefined
  
  var format: js.UndefOr[FormatOptions] = js.undefined
  
  var ie8: js.UndefOr[Boolean] = js.undefined
  
  var keep_classnames: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  var keep_fnames: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  var mangle: js.UndefOr[Boolean | MangleOptions] = js.undefined
  
  var module: js.UndefOr[Boolean] = js.undefined
  
  var nameCache: js.UndefOr[js.Object] = js.undefined
  
  /** @deprecated */
  var output: js.UndefOr[FormatOptions] = js.undefined
  
  var parse: js.UndefOr[ParseOptions] = js.undefined
  
  var safari10: js.UndefOr[Boolean] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.undefined
  
  var toplevel: js.UndefOr[Boolean] = js.undefined
}
object MinifyOptions {
  
  inline def apply(): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOptions]
  }
  
  extension [Self <: MinifyOptions](x: Self) {
    
    inline def setCompress(value: Boolean | CompressOptions): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
    
    inline def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
    
    inline def setEnclose(value: Boolean | String): Self = StObject.set(x, "enclose", value.asInstanceOf[js.Any])
    
    inline def setEncloseUndefined: Self = StObject.set(x, "enclose", js.undefined)
    
    inline def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
    
    inline def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
    
    inline def setKeep_classnames(value: Boolean | js.RegExp): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
    
    inline def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
    
    inline def setKeep_fnames(value: Boolean | js.RegExp): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
    
    inline def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
    
    inline def setMangle(value: Boolean | MangleOptions): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
    
    inline def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setNameCache(value: js.Object): Self = StObject.set(x, "nameCache", value.asInstanceOf[js.Any])
    
    inline def setNameCacheUndefined: Self = StObject.set(x, "nameCache", js.undefined)
    
    inline def setOutput(value: FormatOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setParse(value: ParseOptions): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
    
    inline def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
    
    inline def setSourceMap(value: Boolean | SourceMapOptions): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
    
    inline def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
  }
}
