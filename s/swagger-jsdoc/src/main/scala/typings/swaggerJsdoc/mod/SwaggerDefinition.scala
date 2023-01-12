package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For describing Open API Specification (OAS) version 2.0 (fka Swagger specification)
  */
trait SwaggerDefinition
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var consumes: js.UndefOr[js.Array[String]] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentation] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var info: Information
  
  var produces: js.UndefOr[js.Array[String]] = js.undefined
  
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  
  var swagger: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object SwaggerDefinition {
  
  inline def apply(info: Information): SwaggerDefinition = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwaggerDefinition] (val x: Self) extends AnyVal {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setConsumes(value: js.Array[String]): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    inline def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
    
    inline def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value*))
    
    inline def setExternalDocs(value: ExternalDocumentation): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInfo(value: Information): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setProduces(value: js.Array[String]): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
    
    inline def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
    
    inline def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value*))
    
    inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
    
    inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    
    inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
    
    inline def setSwagger(value: String): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
    
    inline def setSwaggerUndefined: Self = StObject.set(x, "swagger", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
