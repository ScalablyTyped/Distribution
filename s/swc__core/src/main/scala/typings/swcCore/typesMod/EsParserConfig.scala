package typings.swcCore.typesMod

import typings.swcCore.swcCoreStrings.ecmascript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EsParserConfig
  extends StObject
     with ParserConfig {
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var classPrivateProperty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var classProperty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `false`
    */
  var decorators: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `false`
    */
  var decoratorsBeforeExport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var dynamicImport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `false`
    */
  var exportDefaultFrom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var exportNamespaceFrom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `false`
    */
  var functionBind: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `false`
    */
  var importAssertions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var importMeta: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to false.
    */
  var jsx: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var nullishCoalescing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var numericSeparator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var optionalChaining: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var privateMethod: js.UndefOr[Boolean] = js.undefined
  
  var syntax: ecmascript
  
  /**
    * @deprecated Always true because it's in ecmascript spec.
    */
  var topLevelAwait: js.UndefOr[Boolean] = js.undefined
}
object EsParserConfig {
  
  inline def apply(): EsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "ecmascript")
    __obj.asInstanceOf[EsParserConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EsParserConfig] (val x: Self) extends AnyVal {
    
    inline def setClassPrivateProperty(value: Boolean): Self = StObject.set(x, "classPrivateProperty", value.asInstanceOf[js.Any])
    
    inline def setClassPrivatePropertyUndefined: Self = StObject.set(x, "classPrivateProperty", js.undefined)
    
    inline def setClassProperty(value: Boolean): Self = StObject.set(x, "classProperty", value.asInstanceOf[js.Any])
    
    inline def setClassPropertyUndefined: Self = StObject.set(x, "classProperty", js.undefined)
    
    inline def setDecorators(value: Boolean): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsBeforeExport(value: Boolean): Self = StObject.set(x, "decoratorsBeforeExport", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsBeforeExportUndefined: Self = StObject.set(x, "decoratorsBeforeExport", js.undefined)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDynamicImport(value: Boolean): Self = StObject.set(x, "dynamicImport", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportUndefined: Self = StObject.set(x, "dynamicImport", js.undefined)
    
    inline def setExportDefaultFrom(value: Boolean): Self = StObject.set(x, "exportDefaultFrom", value.asInstanceOf[js.Any])
    
    inline def setExportDefaultFromUndefined: Self = StObject.set(x, "exportDefaultFrom", js.undefined)
    
    inline def setExportNamespaceFrom(value: Boolean): Self = StObject.set(x, "exportNamespaceFrom", value.asInstanceOf[js.Any])
    
    inline def setExportNamespaceFromUndefined: Self = StObject.set(x, "exportNamespaceFrom", js.undefined)
    
    inline def setFunctionBind(value: Boolean): Self = StObject.set(x, "functionBind", value.asInstanceOf[js.Any])
    
    inline def setFunctionBindUndefined: Self = StObject.set(x, "functionBind", js.undefined)
    
    inline def setImportAssertions(value: Boolean): Self = StObject.set(x, "importAssertions", value.asInstanceOf[js.Any])
    
    inline def setImportAssertionsUndefined: Self = StObject.set(x, "importAssertions", js.undefined)
    
    inline def setImportMeta(value: Boolean): Self = StObject.set(x, "importMeta", value.asInstanceOf[js.Any])
    
    inline def setImportMetaUndefined: Self = StObject.set(x, "importMeta", js.undefined)
    
    inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
    
    inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    
    inline def setNullishCoalescing(value: Boolean): Self = StObject.set(x, "nullishCoalescing", value.asInstanceOf[js.Any])
    
    inline def setNullishCoalescingUndefined: Self = StObject.set(x, "nullishCoalescing", js.undefined)
    
    inline def setNumericSeparator(value: Boolean): Self = StObject.set(x, "numericSeparator", value.asInstanceOf[js.Any])
    
    inline def setNumericSeparatorUndefined: Self = StObject.set(x, "numericSeparator", js.undefined)
    
    inline def setOptionalChaining(value: Boolean): Self = StObject.set(x, "optionalChaining", value.asInstanceOf[js.Any])
    
    inline def setOptionalChainingUndefined: Self = StObject.set(x, "optionalChaining", js.undefined)
    
    inline def setPrivateMethod(value: Boolean): Self = StObject.set(x, "privateMethod", value.asInstanceOf[js.Any])
    
    inline def setPrivateMethodUndefined: Self = StObject.set(x, "privateMethod", js.undefined)
    
    inline def setSyntax(value: ecmascript): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setTopLevelAwait(value: Boolean): Self = StObject.set(x, "topLevelAwait", value.asInstanceOf[js.Any])
    
    inline def setTopLevelAwaitUndefined: Self = StObject.set(x, "topLevelAwait", js.undefined)
  }
}
