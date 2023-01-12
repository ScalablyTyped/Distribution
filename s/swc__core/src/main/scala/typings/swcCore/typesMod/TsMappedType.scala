package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsMappedType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var nameType: js.UndefOr[TsType] = js.undefined
  
  var optional: js.UndefOr[TruePlusMinus] = js.undefined
  
  var readonly: js.UndefOr[TruePlusMinus] = js.undefined
  
  var typeAnnotation: js.UndefOr[TsType] = js.undefined
  
  var typeParam: TsTypeParameter
  
  @JSName("type")
  var type_TsMappedType: typings.swcCore.swcCoreStrings.TsMappedType
}
object TsMappedType {
  
  inline def apply(span: Span, typeParam: TsTypeParameter): TsMappedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMappedType")
    __obj.asInstanceOf[TsMappedType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsMappedType] (val x: Self) extends AnyVal {
    
    inline def setNameType(value: TsType): Self = StObject.set(x, "nameType", value.asInstanceOf[js.Any])
    
    inline def setNameTypeUndefined: Self = StObject.set(x, "nameType", js.undefined)
    
    inline def setOptional(value: TruePlusMinus): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setReadonly(value: TruePlusMinus): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setTypeParam(value: TsTypeParameter): Self = StObject.set(x, "typeParam", value.asInstanceOf[js.Any])
  }
}
