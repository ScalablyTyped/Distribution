package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedImportSpecifier
  extends StObject
     with Node
     with HasSpan
     with ImportSpecifier {
  
  var imported: js.UndefOr[ModuleExportName] = js.undefined
  
  var isTypeOnly: Boolean
  
  var local: Identifier
  
  @JSName("type")
  var type_NamedImportSpecifier: typings.swcWasm.swcWasmStrings.ImportSpecifier
}
object NamedImportSpecifier {
  
  inline def apply(isTypeOnly: Boolean, local: Identifier, span: Span): NamedImportSpecifier = {
    val __obj = js.Dynamic.literal(isTypeOnly = isTypeOnly.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[NamedImportSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedImportSpecifier] (val x: Self) extends AnyVal {
    
    inline def setImported(value: ModuleExportName): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setImportedUndefined: Self = StObject.set(x, "imported", js.undefined)
    
    inline def setIsTypeOnly(value: Boolean): Self = StObject.set(x, "isTypeOnly", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: Identifier): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
