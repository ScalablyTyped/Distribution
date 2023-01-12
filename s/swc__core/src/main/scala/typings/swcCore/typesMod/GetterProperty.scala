package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetterProperty
  extends StObject
     with PropBase
     with HasSpan
     with Property {
  
  var body: js.UndefOr[BlockStatement] = js.undefined
  
  var typeAnnotation: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  @JSName("type")
  var type_GetterProperty: typings.swcCore.swcCoreStrings.GetterProperty
}
object GetterProperty {
  
  inline def apply(key: PropertyName, span: Span): GetterProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GetterProperty")
    __obj.asInstanceOf[GetterProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetterProperty] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setType(value: typings.swcCore.swcCoreStrings.GetterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
