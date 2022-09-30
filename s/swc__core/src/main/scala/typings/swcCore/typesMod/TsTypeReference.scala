package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeReference
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var typeName: TsEntityName
  
  var typeParams: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_TsTypeReference: typings.swcCore.swcCoreStrings.TsTypeReference
}
object TsTypeReference {
  
  inline def apply(span: Span, typeName: TsEntityName): TsTypeReference = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeReference")
    __obj.asInstanceOf[TsTypeReference]
  }
  
  extension [Self <: TsTypeReference](x: Self) {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TsEntityName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeParams(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
    
    inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
  }
}
