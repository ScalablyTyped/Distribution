package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsNamespaceDeclaration
  extends StObject
     with Node
     with HasSpan
     with TsNamespaceBody {
  
  var body: TsNamespaceBody
  
  var declare: Boolean
  
  var global: Boolean
  
  var id: Identifier
  
  @JSName("type")
  var type_TsNamespaceDeclaration: typings.swcWasm.swcWasmStrings.TsNamespaceDeclaration
}
object TsNamespaceDeclaration {
  
  inline def apply(body: TsNamespaceBody, declare: Boolean, global: Boolean, id: Identifier, span: Span): TsNamespaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNamespaceDeclaration")
    __obj.asInstanceOf[TsNamespaceDeclaration]
  }
  
  extension [Self <: TsNamespaceDeclaration](x: Self) {
    
    inline def setBody(value: TsNamespaceBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsNamespaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
