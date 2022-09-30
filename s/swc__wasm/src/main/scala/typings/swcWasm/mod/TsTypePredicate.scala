package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypePredicate
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var asserts: Boolean
  
  var paramName: TsThisTypeOrIdent
  
  var typeAnnotation: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  @JSName("type")
  var type_TsTypePredicate: typings.swcWasm.swcWasmStrings.TsTypePredicate
}
object TsTypePredicate {
  
  inline def apply(asserts: Boolean, paramName: TsThisTypeOrIdent, span: Span): TsTypePredicate = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], paramName = paramName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypePredicate")
    __obj.asInstanceOf[TsTypePredicate]
  }
  
  extension [Self <: TsTypePredicate](x: Self) {
    
    inline def setAsserts(value: Boolean): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setParamName(value: TsThisTypeOrIdent): Self = StObject.set(x, "paramName", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
