package typings.yaml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringSchema
  extends StObject
     with CommonSchema
     with _JsonSchema {
  
  var contentEncoding: js.UndefOr[String] = js.undefined
  
  var contentMediaType: js.UndefOr[String] = js.undefined
  
  var contentSchema: js.UndefOr[JsonSchema] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var patter: js.UndefOr[String] = js.undefined
}
object StringSchema {
  
  inline def apply(): StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringSchema] (val x: Self) extends AnyVal {
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentMediaType(value: String): Self = StObject.set(x, "contentMediaType", value.asInstanceOf[js.Any])
    
    inline def setContentMediaTypeUndefined: Self = StObject.set(x, "contentMediaType", js.undefined)
    
    inline def setContentSchema(value: JsonSchema): Self = StObject.set(x, "contentSchema", value.asInstanceOf[js.Any])
    
    inline def setContentSchemaUndefined: Self = StObject.set(x, "contentSchema", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setPatter(value: String): Self = StObject.set(x, "patter", value.asInstanceOf[js.Any])
    
    inline def setPatterUndefined: Self = StObject.set(x, "patter", js.undefined)
  }
}
