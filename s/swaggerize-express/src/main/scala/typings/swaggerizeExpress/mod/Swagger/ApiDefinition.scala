package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiDefinition extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var consumes: js.UndefOr[MimeTypes] = js.undefined
  
  var definitions: js.UndefOr[DefinitionsObject] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var info: InfoObject
  
  var parameters: js.UndefOr[ParametersDefinitionsObject] = js.undefined
  
  var paths: PathsObject
  
  var produces: js.UndefOr[MimeTypes] = js.undefined
  
  var responses: js.UndefOr[ResponsesDefinitionsObject] = js.undefined
  
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  
  var securityDefinitions: js.UndefOr[SecurityDefinitionsObject] = js.undefined
  
  var swagger: String
  
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
}
object ApiDefinition {
  
  @scala.inline
  def apply(info: InfoObject, paths: PathsObject, swagger: String): ApiDefinition = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiDefinition]
  }
  
  @scala.inline
  implicit class ApiDefinitionMutableBuilder[Self <: ApiDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setConsumes(value: MimeTypes): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
    
    @scala.inline
    def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: DefinitionsObject): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setInfo(value: InfoObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ParametersDefinitionsObject): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setPaths(value: PathsObject): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduces(value: MimeTypes): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
    
    @scala.inline
    def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: ResponsesDefinitionsObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    
    @scala.inline
    def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDefinitions(value: SecurityDefinitionsObject): Self = StObject.set(x, "securityDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDefinitionsUndefined: Self = StObject.set(x, "securityDefinitions", js.undefined)
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value :_*))
    
    @scala.inline
    def setSwagger(value: String): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[TagObject]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagObject*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
