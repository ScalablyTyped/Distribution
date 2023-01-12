package typings.swcWasm.mod

import typings.swcWasm.swcWasmStrings.typescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsParserConfig
  extends StObject
     with ParserConfig {
  
  /**
    * Defaults to `false`.
    */
  var decorators: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `false`
    */
  var dynamicImport: js.UndefOr[Boolean] = js.undefined
  
  var syntax: typescript
  
  /**
    * Defaults to `false`.
    */
  var tsx: js.UndefOr[Boolean] = js.undefined
}
object TsParserConfig {
  
  inline def apply(): TsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "typescript")
    __obj.asInstanceOf[TsParserConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsParserConfig] (val x: Self) extends AnyVal {
    
    inline def setDecorators(value: Boolean): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDynamicImport(value: Boolean): Self = StObject.set(x, "dynamicImport", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportUndefined: Self = StObject.set(x, "dynamicImport", js.undefined)
    
    inline def setSyntax(value: typescript): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setTsx(value: Boolean): Self = StObject.set(x, "tsx", value.asInstanceOf[js.Any])
    
    inline def setTsxUndefined: Self = StObject.set(x, "tsx", js.undefined)
  }
}
