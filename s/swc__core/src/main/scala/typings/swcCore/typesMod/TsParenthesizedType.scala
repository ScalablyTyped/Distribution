package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsParenthesizedType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsParenthesizedType: typings.swcCore.swcCoreStrings.TsParenthesizedType
}
object TsParenthesizedType {
  
  inline def apply(span: Span, typeAnnotation: TsType): TsParenthesizedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsParenthesizedType")
    __obj.asInstanceOf[TsParenthesizedType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsParenthesizedType] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
