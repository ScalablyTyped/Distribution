package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsConstructorType
  extends StObject
     with Node
     with HasSpan
     with TsFnOrConstructorType {
  
  var isAbstract: Boolean
  
  var params: js.Array[TsFnParameter]
  
  var typeAnnotation: TsTypeAnnotation
  
  var typeParams: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
  
  @JSName("type")
  var type_TsConstructorType: typings.swcWasm.swcWasmStrings.TsConstructorType
}
object TsConstructorType {
  
  inline def apply(isAbstract: Boolean, params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): TsConstructorType = {
    val __obj = js.Dynamic.literal(isAbstract = isAbstract.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructorType")
    __obj.asInstanceOf[TsConstructorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsConstructorType] (val x: Self) extends AnyVal {
    
    inline def setIsAbstract(value: Boolean): Self = StObject.set(x, "isAbstract", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[TsFnParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TsFnParameter*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsConstructorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeParams(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
    
    inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
  }
}
