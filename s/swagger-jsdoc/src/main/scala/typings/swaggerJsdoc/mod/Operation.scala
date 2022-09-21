package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var callbacks: js.UndefOr[StringDictionary[Callback | Reference]] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentation] = js.undefined
  
  var operationId: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[js.Array[Parameter | Reference]] = js.undefined
  
  var requestBody: js.UndefOr[RequestBody | Reference] = js.undefined
  
  var responses: js.UndefOr[Responses] = js.undefined
  
  var security: js.UndefOr[js.Array[SecurityRequirement]] = js.undefined
  
  var servers: js.UndefOr[js.Array[Server]] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object Operation {
  
  inline def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setCallbacks(value: StringDictionary[Callback | Reference]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExternalDocs(value: ExternalDocumentation): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setParameters(value: js.Array[Parameter | Reference]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: (Parameter | Reference)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRequestBody(value: RequestBody | Reference): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: Responses): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setSecurity(value: js.Array[SecurityRequirement]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: SecurityRequirement*): Self = StObject.set(x, "security", js.Array(value*))
    
    inline def setServers(value: js.Array[Server]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setServersVarargs(value: Server*): Self = StObject.set(x, "servers", js.Array(value*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
