package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsIndexedAccessType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var indexType: TsType
  
  var objectType: TsType
  
  var readonly: Boolean
  
  @JSName("type")
  var type_TsIndexedAccessType: typings.swcCore.swcCoreStrings.TsIndexedAccessType
}
object TsIndexedAccessType {
  
  inline def apply(indexType: TsType, objectType: TsType, readonly: Boolean, span: Span): TsIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexedAccessType")
    __obj.asInstanceOf[TsIndexedAccessType]
  }
  
  extension [Self <: TsIndexedAccessType](x: Self) {
    
    inline def setIndexType(value: TsType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: TsType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
