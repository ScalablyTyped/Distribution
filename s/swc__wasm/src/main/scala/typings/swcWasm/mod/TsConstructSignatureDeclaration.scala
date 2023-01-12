package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsConstructSignatureDeclaration
  extends StObject
     with Node
     with HasSpan
     with TsTypeElement {
  
  var params: js.Array[TsFnParameter]
  
  var typeAnnotation: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  var typeParams: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
  
  @JSName("type")
  var type_TsConstructSignatureDeclaration: typings.swcWasm.swcWasmStrings.TsConstructSignatureDeclaration
}
object TsConstructSignatureDeclaration {
  
  inline def apply(params: js.Array[TsFnParameter], span: Span): TsConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructSignatureDeclaration")
    __obj.asInstanceOf[TsConstructSignatureDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsConstructSignatureDeclaration] (val x: Self) extends AnyVal {
    
    inline def setParams(value: js.Array[TsFnParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TsFnParameter*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsConstructSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setTypeParams(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
    
    inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
  }
}
