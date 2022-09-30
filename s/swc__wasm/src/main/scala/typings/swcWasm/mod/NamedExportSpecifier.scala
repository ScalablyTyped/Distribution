package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedExportSpecifier
  extends StObject
     with Node
     with HasSpan
     with ExportSpecifier {
  
  /**
    * `Some(bar)` in `export { foo as bar }`
    */
  var exported: js.UndefOr[ModuleExportName] = js.undefined
  
  var isTypeOnly: Boolean
  
  var orig: ModuleExportName
  
  @JSName("type")
  var type_NamedExportSpecifier: typings.swcWasm.swcWasmStrings.ExportSpecifier
}
object NamedExportSpecifier {
  
  inline def apply(isTypeOnly: Boolean, orig: ModuleExportName, span: Span): NamedExportSpecifier = {
    val __obj = js.Dynamic.literal(isTypeOnly = isTypeOnly.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[NamedExportSpecifier]
  }
  
  extension [Self <: NamedExportSpecifier](x: Self) {
    
    inline def setExported(value: ModuleExportName): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setExportedUndefined: Self = StObject.set(x, "exported", js.undefined)
    
    inline def setIsTypeOnly(value: Boolean): Self = StObject.set(x, "isTypeOnly", value.asInstanceOf[js.Any])
    
    inline def setOrig(value: ModuleExportName): Self = StObject.set(x, "orig", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
