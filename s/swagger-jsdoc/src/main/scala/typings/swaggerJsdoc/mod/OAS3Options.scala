package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Open API Specification (OAS) version 3.0 options
  */
trait OAS3Options
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var apis: js.UndefOr[js.Array[String]] = js.undefined
  
  var definition: js.UndefOr[OAS3Definition] = js.undefined
  
  var swaggerDefinition: js.UndefOr[OAS3Definition] = js.undefined
}
object OAS3Options {
  
  inline def apply(): OAS3Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAS3Options]
  }
  
  extension [Self <: OAS3Options](x: Self) {
    
    inline def setApis(value: js.Array[String]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    inline def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    inline def setApisVarargs(value: String*): Self = StObject.set(x, "apis", js.Array(value*))
    
    inline def setDefinition(value: OAS3Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setSwaggerDefinition(value: OAS3Definition): Self = StObject.set(x, "swaggerDefinition", value.asInstanceOf[js.Any])
    
    inline def setSwaggerDefinitionUndefined: Self = StObject.set(x, "swaggerDefinition", js.undefined)
  }
}
