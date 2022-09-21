package typings.vueCompilerSfc.mod

import typings.vueCompilerSfc.vueCompilerSfcStrings.line
import typings.vueCompilerSfc.vueCompilerSfcStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCParseOptions extends StObject {
  
  var compiler: js.UndefOr[TemplateCompiler] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var ignoreEmpty: js.UndefOr[Boolean] = js.undefined
  
  var pad: js.UndefOr[Boolean | line | space] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var sourceRoot: js.UndefOr[String] = js.undefined
}
object SFCParseOptions {
  
  inline def apply(): SFCParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCParseOptions]
  }
  
  extension [Self <: SFCParseOptions](x: Self) {
    
    inline def setCompiler(value: TemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyUndefined: Self = StObject.set(x, "ignoreEmpty", js.undefined)
    
    inline def setPad(value: Boolean | line | space): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
  }
}
