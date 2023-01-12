package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsFunctionType
  extends StObject
     with Node
     with HasSpan
     with TsFnOrConstructorType {
  
  var params: js.Array[TsFnParameter]
  
  var typeAnnotation: TsTypeAnnotation
  
  var typeParams: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
  
  @JSName("type")
  var type_TsFunctionType: typings.swcCore.swcCoreStrings.TsFunctionType
}
object TsFunctionType {
  
  inline def apply(params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): TsFunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsFunctionType")
    __obj.asInstanceOf[TsFunctionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsFunctionType] (val x: Self) extends AnyVal {
    
    inline def setParams(value: js.Array[TsFnParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TsFnParameter*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsFunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeParams(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
    
    inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
  }
}
