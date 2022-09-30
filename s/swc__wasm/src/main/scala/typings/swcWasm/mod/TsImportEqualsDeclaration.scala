package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsImportEqualsDeclaration
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var declare: Boolean
  
  var id: Identifier
  
  var isExport: Boolean
  
  var isTypeOnly: Boolean
  
  var moduleRef: TsModuleReference
  
  @JSName("type")
  var type_TsImportEqualsDeclaration: typings.swcWasm.swcWasmStrings.TsImportEqualsDeclaration
}
object TsImportEqualsDeclaration {
  
  inline def apply(
    declare: Boolean,
    id: Identifier,
    isExport: Boolean,
    isTypeOnly: Boolean,
    moduleRef: TsModuleReference,
    span: Span
  ): TsImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], isTypeOnly = isTypeOnly.asInstanceOf[js.Any], moduleRef = moduleRef.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportEqualsDeclaration")
    __obj.asInstanceOf[TsImportEqualsDeclaration]
  }
  
  extension [Self <: TsImportEqualsDeclaration](x: Self) {
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsExport(value: Boolean): Self = StObject.set(x, "isExport", value.asInstanceOf[js.Any])
    
    inline def setIsTypeOnly(value: Boolean): Self = StObject.set(x, "isTypeOnly", value.asInstanceOf[js.Any])
    
    inline def setModuleRef(value: TsModuleReference): Self = StObject.set(x, "moduleRef", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
