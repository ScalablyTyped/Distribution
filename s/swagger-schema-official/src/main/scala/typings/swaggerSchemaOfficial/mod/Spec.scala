package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spec extends StObject {
  
  var basePath: js.UndefOr[String] = js.native
  
  var consumes: js.UndefOr[js.Array[String]] = js.native
  
  var definitions: js.UndefOr[StringDictionary[Schema]] = js.native
  
  var externalDocs: js.UndefOr[ExternalDocs] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var info: Info = js.native
  
  var parameters: js.UndefOr[StringDictionary[BodyParameter | QueryParameter]] = js.native
  
  var paths: StringDictionary[Path] = js.native
  
  var produces: js.UndefOr[js.Array[String]] = js.native
  
  var responses: js.UndefOr[StringDictionary[Response]] = js.native
  
  var schemes: js.UndefOr[js.Array[String]] = js.native
  
  var security: js.UndefOr[js.Array[StringDictionary[js.Array[String]]]] = js.native
  
  var securityDefinitions: js.UndefOr[StringDictionary[Security]] = js.native
  
  var swagger: String = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}
object Spec {
  
  @scala.inline
  def apply(info: Info, paths: StringDictionary[Path], swagger: String): Spec = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
  
  @scala.inline
  implicit class SpecMutableBuilder[Self <: Spec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setConsumes(value: js.Array[String]): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
    
    @scala.inline
    def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: StringDictionary[Schema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocs): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: StringDictionary[BodyParameter | QueryParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setPaths(value: StringDictionary[Path]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduces(value: js.Array[String]): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
    
    @scala.inline
    def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: StringDictionary[Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    
    @scala.inline
    def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[StringDictionary[js.Array[String]]]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDefinitions(value: StringDictionary[Security]): Self = StObject.set(x, "securityDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDefinitionsUndefined: Self = StObject.set(x, "securityDefinitions", js.undefined)
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: StringDictionary[js.Array[String]]*): Self = StObject.set(x, "security", js.Array(value :_*))
    
    @scala.inline
    def setSwagger(value: String): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
