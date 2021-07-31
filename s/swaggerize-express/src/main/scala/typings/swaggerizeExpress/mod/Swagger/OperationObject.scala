package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationObject extends StObject {
  
  var consumes: js.UndefOr[MimeTypes] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  
  var operationId: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[Parameters] = js.undefined
  
  var produces: js.UndefOr[MimeTypes] = js.undefined
  
  var responses: ResponsesObject
  
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object OperationObject {
  
  @scala.inline
  def apply(responses: ResponsesObject): OperationObject = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationObject]
  }
  
  @scala.inline
  implicit class OperationObjectMutableBuilder[Self <: OperationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumes(value: MimeTypes): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
    
    @scala.inline
    def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value :_*))
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: (ParameterObject | ReferenceObject)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setProduces(value: MimeTypes): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
    
    @scala.inline
    def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: ResponsesObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    
    @scala.inline
    def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
