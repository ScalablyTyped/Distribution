package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeAnnotation
  extends StObject
     with Node
     with HasSpan {
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsTypeAnnotation: typings.swcCore.swcCoreStrings.TsTypeAnnotation
}
object TsTypeAnnotation {
  
  inline def apply(span: Span, typeAnnotation: TsType): TsTypeAnnotation = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAnnotation")
    __obj.asInstanceOf[TsTypeAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsTypeAnnotation] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
