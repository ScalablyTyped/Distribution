package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeOperator
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var op: TsTypeOperatorOp
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsTypeOperator: typings.swcWasm.swcWasmStrings.TsTypeOperator
}
object TsTypeOperator {
  
  inline def apply(op: TsTypeOperatorOp, span: Span, typeAnnotation: TsType): TsTypeOperator = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeOperator")
    __obj.asInstanceOf[TsTypeOperator]
  }
  
  extension [Self <: TsTypeOperator](x: Self) {
    
    inline def setOp(value: TsTypeOperatorOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
