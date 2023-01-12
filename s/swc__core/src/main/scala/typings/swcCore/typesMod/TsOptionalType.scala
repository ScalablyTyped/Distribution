package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsOptionalType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsOptionalType: typings.swcCore.swcCoreStrings.TsOptionalType
}
object TsOptionalType {
  
  inline def apply(span: Span, typeAnnotation: TsType): TsOptionalType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsOptionalType")
    __obj.asInstanceOf[TsOptionalType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsOptionalType] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
