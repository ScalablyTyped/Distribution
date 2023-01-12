package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spec extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var consumes: js.UndefOr[js.Array[String]] = js.undefined
  
  var definitions: js.UndefOr[StringDictionary[Schema]] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var info: Info
  
  var parameters: js.UndefOr[StringDictionary[BodyParameter | QueryParameter]] = js.undefined
  
  var paths: StringDictionary[Path]
  
  var produces: js.UndefOr[js.Array[String]] = js.undefined
  
  var responses: js.UndefOr[StringDictionary[Response]] = js.undefined
  
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  
  var security: js.UndefOr[js.Array[StringDictionary[js.Array[String]]]] = js.undefined
  
  var securityDefinitions: js.UndefOr[StringDictionary[Security]] = js.undefined
  
  var swagger: String
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object Spec {
  
  inline def apply(info: Info, paths: StringDictionary[Path], swagger: String): Spec = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spec] (val x: Self) extends AnyVal {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setConsumes(value: js.Array[String]): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    inline def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
    
    inline def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value*))
    
    inline def setDefinitions(value: StringDictionary[Schema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setExternalDocs(value: ExternalDocs): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: StringDictionary[BodyParameter | QueryParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPaths(value: StringDictionary[Path]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setProduces(value: js.Array[String]): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
    
    inline def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
    
    inline def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value*))
    
    inline def setResponses(value: StringDictionary[Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
    
    inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    
    inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
    
    inline def setSecurity(value: js.Array[StringDictionary[js.Array[String]]]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityDefinitions(value: StringDictionary[Security]): Self = StObject.set(x, "securityDefinitions", value.asInstanceOf[js.Any])
    
    inline def setSecurityDefinitionsUndefined: Self = StObject.set(x, "securityDefinitions", js.undefined)
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: StringDictionary[js.Array[String]]*): Self = StObject.set(x, "security", js.Array(value*))
    
    inline def setSwagger(value: String): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
