package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsIntersectionType
  extends StObject
     with Node
     with HasSpan
     with TsUnionOrIntersectionType {
  
  @JSName("type")
  var type_TsIntersectionType: typings.swcCore.swcCoreStrings.TsIntersectionType
  
  var types: js.Array[TsType]
}
object TsIntersectionType {
  
  inline def apply(span: Span, types: js.Array[TsType]): TsIntersectionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIntersectionType")
    __obj.asInstanceOf[TsIntersectionType]
  }
  
  extension [Self <: TsIntersectionType](x: Self) {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsIntersectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TsType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TsType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
