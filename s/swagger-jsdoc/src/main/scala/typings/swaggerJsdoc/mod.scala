package typings.swaggerJsdoc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-jsdoc", JSImport.Namespace)
  @js.native
  def apply(): js.Object = js.native
  @JSImport("swagger-jsdoc", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Object = js.native
  
  @js.native
  trait ApiInformation extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var title: String = js.native
    
    var version: String = js.native
  }
  object ApiInformation {
    
    @scala.inline
    def apply(title: String, version: String): ApiInformation = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiInformation]
    }
    
    @scala.inline
    implicit class ApiInformationMutableBuilder[Self <: ApiInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options
    extends /* key */ StringDictionary[js.Any] {
    
    var apis: js.UndefOr[js.Array[String]] = js.native
    
    var definition: js.UndefOr[SwaggerDefinition] = js.native
    
    var swaggerDefinition: js.UndefOr[SwaggerDefinition] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApis(value: js.Array[String]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
      
      @scala.inline
      def setApisVarargs(value: String*): Self = StObject.set(x, "apis", js.Array(value :_*))
      
      @scala.inline
      def setDefinition(value: SwaggerDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      @scala.inline
      def setSwaggerDefinition(value: SwaggerDefinition): Self = StObject.set(x, "swaggerDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerDefinitionUndefined: Self = StObject.set(x, "swaggerDefinition", js.undefined)
    }
  }
  
  @js.native
  trait ServerInformation
    extends /* key */ StringDictionary[js.Any] {
    
    var url: String = js.native
  }
  object ServerInformation {
    
    @scala.inline
    def apply(url: String): ServerInformation = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerInformation]
    }
    
    @scala.inline
    implicit class ServerInformationMutableBuilder[Self <: ServerInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SwaggerDefinition
    extends /* key */ StringDictionary[js.Any] {
    
    var basePath: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var info: ApiInformation = js.native
    
    var openapi: js.UndefOr[String] = js.native
    
    var servers: js.UndefOr[js.Array[ServerInformation]] = js.native
  }
  object SwaggerDefinition {
    
    @scala.inline
    def apply(info: ApiInformation): SwaggerDefinition = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwaggerDefinition]
    }
    
    @scala.inline
    implicit class SwaggerDefinitionMutableBuilder[Self <: SwaggerDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setInfo(value: ApiInformation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenapi(value: String): Self = StObject.set(x, "openapi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenapiUndefined: Self = StObject.set(x, "openapi", js.undefined)
      
      @scala.inline
      def setServers(value: js.Array[ServerInformation]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      @scala.inline
      def setServersVarargs(value: ServerInformation*): Self = StObject.set(x, "servers", js.Array(value :_*))
    }
  }
}
