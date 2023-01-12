package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Open API Specification (OAS) version 2.0 options (fka Swagger specification)
  */
trait Options
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var apis: js.UndefOr[js.Array[String]] = js.undefined
  
  var definition: js.UndefOr[SwaggerDefinition] = js.undefined
  
  var swaggerDefinition: js.UndefOr[SwaggerDefinition] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setApis(value: js.Array[String]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    inline def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    inline def setApisVarargs(value: String*): Self = StObject.set(x, "apis", js.Array(value*))
    
    inline def setDefinition(value: SwaggerDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setSwaggerDefinition(value: SwaggerDefinition): Self = StObject.set(x, "swaggerDefinition", value.asInstanceOf[js.Any])
    
    inline def setSwaggerDefinitionUndefined: Self = StObject.set(x, "swaggerDefinition", js.undefined)
  }
}
