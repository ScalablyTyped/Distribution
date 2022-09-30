package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsIndexSignature
  extends StObject
     with Node
     with HasSpan
     with ClassMember
     with TsTypeElement {
  
  var params: js.Array[TsFnParameter]
  
  var readonly: Boolean
  
  var static: Boolean
  
  var typeAnnotation: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  @JSName("type")
  var type_TsIndexSignature: typings.swcWasm.swcWasmStrings.TsIndexSignature
}
object TsIndexSignature {
  
  inline def apply(params: js.Array[TsFnParameter], readonly: Boolean, span: Span, static: Boolean): TsIndexSignature = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexSignature")
    __obj.asInstanceOf[TsIndexSignature]
  }
  
  extension [Self <: TsIndexSignature](x: Self) {
    
    inline def setParams(value: js.Array[TsFnParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TsFnParameter*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsIndexSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
