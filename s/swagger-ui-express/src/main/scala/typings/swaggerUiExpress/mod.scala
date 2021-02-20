package typings.swaggerUiExpress

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.ServerResponse
import typings.serveStatic.mod.ServeStaticOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-ui-express", "generateHTML")
  @js.native
  def generateHTML(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("swagger-ui-express", "generateHTML")
  @js.native
  def generateHTML(swaggerDoc: js.UndefOr[scala.Nothing], isExplorer: Boolean): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("swagger-ui-express", "generateHTML")
  @js.native
  def generateHTML(
    swaggerDoc: js.UndefOr[JsonObject],
    opts: js.UndefOr[SwaggerUiOptions],
    options: js.UndefOr[SwaggerOptions],
    customCss: js.UndefOr[String],
    customfavIcon: js.UndefOr[String],
    swaggerUrl: js.UndefOr[String],
    customSiteTitle: js.UndefOr[String]
  ): String = js.native
  @JSImport("swagger-ui-express", "generateHTML")
  @js.native
  def generateHTML(swaggerDoc: JsonObject): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("swagger-ui-express", "generateHTML")
  @js.native
  def generateHTML(swaggerDoc: JsonObject, isExplorer: Boolean): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("swagger-ui-express", "serve")
  @js.native
  val serve: js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.native
  
  @JSImport("swagger-ui-express", "serveFiles")
  @js.native
  def serveFiles(): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  @JSImport("swagger-ui-express", "serveFiles")
  @js.native
  def serveFiles(swaggerDoc: js.UndefOr[scala.Nothing], opts: SwaggerUiOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  @JSImport("swagger-ui-express", "serveFiles")
  @js.native
  def serveFiles(swaggerDoc: JsonObject): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  @JSImport("swagger-ui-express", "serveFiles")
  @js.native
  def serveFiles(swaggerDoc: JsonObject, opts: SwaggerUiOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  @JSImport("swagger-ui-express", "serveWithOptions")
  @js.native
  def serveWithOptions(options: ServeStaticOptions[ServerResponse]): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  @JSImport("swagger-ui-express", "setup")
  @js.native
  def setup(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("swagger-ui-express", "setup")
  @js.native
  def setup(swaggerDoc: js.UndefOr[scala.Nothing], isExplorer: Boolean): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("swagger-ui-express", "setup")
  @js.native
  def setup(
    swaggerDoc: js.UndefOr[JsonObject],
    opts: js.UndefOr[SwaggerUiOptions],
    options: js.UndefOr[SwaggerOptions],
    customCss: js.UndefOr[String],
    customfavIcon: js.UndefOr[String],
    swaggerUrl: js.UndefOr[String],
    customSiteTitle: js.UndefOr[String]
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("swagger-ui-express", "setup")
  @js.native
  def setup(swaggerDoc: JsonObject): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("swagger-ui-express", "setup")
  @js.native
  def setup(swaggerDoc: JsonObject, isExplorer: Boolean): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  type JsonObject = StringDictionary[js.Any]
  
  type SwaggerOptions = StringDictionary[js.Any]
  
  @js.native
  trait SwaggerUiOptions extends StObject {
    
    var customCss: js.UndefOr[String] = js.native
    
    var customCssUrl: js.UndefOr[String] = js.native
    
    var customJs: js.UndefOr[String] = js.native
    
    var customSiteTitle: js.UndefOr[String] = js.native
    
    var customfavIcon: js.UndefOr[String] = js.native
    
    var explorer: js.UndefOr[Boolean] = js.native
    
    var isExplorer: js.UndefOr[Boolean] = js.native
    
    var swaggerOptions: js.UndefOr[SwaggerOptions] = js.native
    
    var swaggerUrl: js.UndefOr[String] = js.native
    
    var swaggerUrls: js.UndefOr[js.Array[String]] = js.native
  }
  object SwaggerUiOptions {
    
    @scala.inline
    def apply(): SwaggerUiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerUiOptions]
    }
    
    @scala.inline
    implicit class SwaggerUiOptionsMutableBuilder[Self <: SwaggerUiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomCss(value: String): Self = StObject.set(x, "customCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCssUndefined: Self = StObject.set(x, "customCss", js.undefined)
      
      @scala.inline
      def setCustomCssUrl(value: String): Self = StObject.set(x, "customCssUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCssUrlUndefined: Self = StObject.set(x, "customCssUrl", js.undefined)
      
      @scala.inline
      def setCustomJs(value: String): Self = StObject.set(x, "customJs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomJsUndefined: Self = StObject.set(x, "customJs", js.undefined)
      
      @scala.inline
      def setCustomSiteTitle(value: String): Self = StObject.set(x, "customSiteTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSiteTitleUndefined: Self = StObject.set(x, "customSiteTitle", js.undefined)
      
      @scala.inline
      def setCustomfavIcon(value: String): Self = StObject.set(x, "customfavIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomfavIconUndefined: Self = StObject.set(x, "customfavIcon", js.undefined)
      
      @scala.inline
      def setExplorer(value: Boolean): Self = StObject.set(x, "explorer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplorerUndefined: Self = StObject.set(x, "explorer", js.undefined)
      
      @scala.inline
      def setIsExplorer(value: Boolean): Self = StObject.set(x, "isExplorer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExplorerUndefined: Self = StObject.set(x, "isExplorer", js.undefined)
      
      @scala.inline
      def setSwaggerOptions(value: SwaggerOptions): Self = StObject.set(x, "swaggerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerOptionsUndefined: Self = StObject.set(x, "swaggerOptions", js.undefined)
      
      @scala.inline
      def setSwaggerUrl(value: String): Self = StObject.set(x, "swaggerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerUrlUndefined: Self = StObject.set(x, "swaggerUrl", js.undefined)
      
      @scala.inline
      def setSwaggerUrls(value: js.Array[String]): Self = StObject.set(x, "swaggerUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerUrlsUndefined: Self = StObject.set(x, "swaggerUrls", js.undefined)
      
      @scala.inline
      def setSwaggerUrlsVarargs(value: String*): Self = StObject.set(x, "swaggerUrls", js.Array(value :_*))
    }
  }
}
