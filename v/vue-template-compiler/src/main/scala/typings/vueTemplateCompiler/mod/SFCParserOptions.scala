package typings.vueTemplateCompiler.mod

import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typings.vueTemplateCompiler.vueTemplateCompilerStrings.line
import typings.vueTemplateCompiler.vueTemplateCompilerStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * SFC parser related types
  */
trait SFCParserOptions extends StObject {
  
  var deindent: js.UndefOr[Boolean] = js.undefined
  
  var pad: js.UndefOr[`true` | line | space] = js.undefined
}
object SFCParserOptions {
  
  inline def apply(): SFCParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCParserOptions]
  }
  
  extension [Self <: SFCParserOptions](x: Self) {
    
    inline def setDeindent(value: Boolean): Self = StObject.set(x, "deindent", value.asInstanceOf[js.Any])
    
    inline def setDeindentUndefined: Self = StObject.set(x, "deindent", js.undefined)
    
    inline def setPad(value: `true` | line | space): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
