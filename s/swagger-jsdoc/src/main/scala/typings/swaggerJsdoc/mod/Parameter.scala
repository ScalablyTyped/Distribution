package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
  
  var allowReserved: js.UndefOr[Boolean] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var example: js.UndefOr[Any] = js.undefined
  
  var examples: js.UndefOr[StringDictionary[Example | Reference]] = js.undefined
  
  var explode: js.UndefOr[Boolean] = js.undefined
  
  var in: String
  
  var name: String
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var schema: js.UndefOr[Schema | Reference] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object Parameter {
  
  inline def apply(in: String, name: String): Parameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setAllowEmptyValue(value: Boolean): Self = StObject.set(x, "allowEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyValueUndefined: Self = StObject.set(x, "allowEmptyValue", js.undefined)
    
    inline def setAllowReserved(value: Boolean): Self = StObject.set(x, "allowReserved", value.asInstanceOf[js.Any])
    
    inline def setAllowReservedUndefined: Self = StObject.set(x, "allowReserved", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExample(value: Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExamples(value: StringDictionary[Example | Reference]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
    
    inline def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
    
    inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSchema(value: Schema | Reference): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
