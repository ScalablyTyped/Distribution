package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Components
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var callbacks: js.UndefOr[StringDictionary[Callback | Reference]] = js.undefined
  
  var examples: js.UndefOr[StringDictionary[Example | Reference]] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[Header | Reference]] = js.undefined
  
  var links: js.UndefOr[StringDictionary[Link | Reference]] = js.undefined
  
  var parameters: js.UndefOr[StringDictionary[Parameter | Reference]] = js.undefined
  
  var requestBodies: js.UndefOr[StringDictionary[RequestBody | Reference]] = js.undefined
  
  var responses: js.UndefOr[StringDictionary[Response | Reference]] = js.undefined
  
  var schemas: js.UndefOr[StringDictionary[Schema | Reference]] = js.undefined
  
  var securitySchemes: js.UndefOr[StringDictionary[SecurityScheme | Reference]] = js.undefined
}
object Components {
  
  inline def apply(): Components = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components]
  }
  
  extension [Self <: Components](x: Self) {
    
    inline def setCallbacks(value: StringDictionary[Callback | Reference]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setExamples(value: StringDictionary[Example | Reference]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setHeaders(value: StringDictionary[Header | Reference]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLinks(value: StringDictionary[Link | Reference]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setParameters(value: StringDictionary[Parameter | Reference]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRequestBodies(value: StringDictionary[RequestBody | Reference]): Self = StObject.set(x, "requestBodies", value.asInstanceOf[js.Any])
    
    inline def setRequestBodiesUndefined: Self = StObject.set(x, "requestBodies", js.undefined)
    
    inline def setResponses(value: StringDictionary[Response | Reference]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setSchemas(value: StringDictionary[Schema | Reference]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSecuritySchemes(value: StringDictionary[SecurityScheme | Reference]): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemesUndefined: Self = StObject.set(x, "securitySchemes", js.undefined)
  }
}
