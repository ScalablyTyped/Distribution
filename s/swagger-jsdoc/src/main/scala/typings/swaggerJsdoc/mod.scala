package typings.swaggerJsdoc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Object = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Object]
  inline def apply(options: Options): js.Object = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @JSImport("swagger-jsdoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ApiInformation extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var title: String
    
    var version: String
  }
  object ApiInformation {
    
    inline def apply(title: String, version: String): ApiInformation = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiInformation]
    }
    
    extension [Self <: ApiInformation](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var apis: js.UndefOr[js.Array[String]] = js.undefined
    
    var definition: js.UndefOr[SwaggerDefinition] = js.undefined
    
    var swaggerDefinition: js.UndefOr[SwaggerDefinition] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApis(value: js.Array[String]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
      
      inline def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
      
      inline def setApisVarargs(value: String*): Self = StObject.set(x, "apis", js.Array(value :_*))
      
      inline def setDefinition(value: SwaggerDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      inline def setSwaggerDefinition(value: SwaggerDefinition): Self = StObject.set(x, "swaggerDefinition", value.asInstanceOf[js.Any])
      
      inline def setSwaggerDefinitionUndefined: Self = StObject.set(x, "swaggerDefinition", js.undefined)
    }
  }
  
  trait ServerInformation
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var url: String
  }
  object ServerInformation {
    
    inline def apply(url: String): ServerInformation = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerInformation]
    }
    
    extension [Self <: ServerInformation](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SwaggerDefinition
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var info: ApiInformation
    
    var openapi: js.UndefOr[String] = js.undefined
    
    var servers: js.UndefOr[js.Array[ServerInformation]] = js.undefined
  }
  object SwaggerDefinition {
    
    inline def apply(info: ApiInformation): SwaggerDefinition = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwaggerDefinition]
    }
    
    extension [Self <: SwaggerDefinition](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setInfo(value: ApiInformation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setOpenapi(value: String): Self = StObject.set(x, "openapi", value.asInstanceOf[js.Any])
      
      inline def setOpenapiUndefined: Self = StObject.set(x, "openapi", js.undefined)
      
      inline def setServers(value: js.Array[ServerInformation]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      inline def setServersVarargs(value: ServerInformation*): Self = StObject.set(x, "servers", js.Array(value :_*))
    }
  }
}
