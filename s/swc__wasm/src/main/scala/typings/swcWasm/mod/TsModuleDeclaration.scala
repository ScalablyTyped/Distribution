package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsModuleDeclaration
  extends StObject
     with Node
     with HasSpan
     with Declaration {
  
  var body: js.UndefOr[TsNamespaceBody] = js.undefined
  
  var declare: Boolean
  
  var global: Boolean
  
  var id: TsModuleName
  
  @JSName("type")
  var type_TsModuleDeclaration: typings.swcWasm.swcWasmStrings.TsModuleDeclaration
}
object TsModuleDeclaration {
  
  inline def apply(declare: Boolean, global: Boolean, id: TsModuleName, span: Span): TsModuleDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsModuleDeclaration")
    __obj.asInstanceOf[TsModuleDeclaration]
  }
  
  extension [Self <: TsModuleDeclaration](x: Self) {
    
    inline def setBody(value: TsNamespaceBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setId(value: TsModuleName): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsModuleDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
