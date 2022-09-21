package typings.swaggerUiExpress

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.serveStatic.mod.ServeStaticOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-ui-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateHTML(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateHTML")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def generateHTML(
    swaggerDoc: js.UndefOr[JsonObject],
    opts: js.UndefOr[SwaggerUiOptions],
    options: js.UndefOr[SwaggerOptions],
    customCss: js.UndefOr[String],
    customfavIcon: js.UndefOr[String],
    swaggerUrl: js.UndefOr[String],
    customSiteTitle: js.UndefOr[String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateHTML")(swaggerDoc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], options.asInstanceOf[js.Any], customCss.asInstanceOf[js.Any], customfavIcon.asInstanceOf[js.Any], swaggerUrl.asInstanceOf[js.Any], customSiteTitle.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateHTML(swaggerDoc: Unit, isExplorer: Boolean): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateHTML")(swaggerDoc.asInstanceOf[js.Any], isExplorer.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def generateHTML(swaggerDoc: JsonObject): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateHTML")(swaggerDoc.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def generateHTML(swaggerDoc: JsonObject, isExplorer: Boolean): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateHTML")(swaggerDoc.asInstanceOf[js.Any], isExplorer.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("swagger-ui-express", "serve")
  @js.native
  val serve: js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ] = js.native
  
  inline def serveFiles(): js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("serveFiles")().asInstanceOf[js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ]]
  inline def serveFiles(swaggerDoc: Unit, opts: SwaggerUiOptions): js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("serveFiles")(swaggerDoc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ]]
  inline def serveFiles(swaggerDoc: JsonObject): js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("serveFiles")(swaggerDoc.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ]]
  inline def serveFiles(swaggerDoc: JsonObject, opts: SwaggerUiOptions): js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("serveFiles")(swaggerDoc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ]]
  
  inline def serveWithOptions(options: ServeStaticOptions[ServerResponse[IncomingMessage]]): js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("serveWithOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ]]
  
  inline def setup(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def setup(
    swaggerDoc: js.UndefOr[JsonObject],
    opts: js.UndefOr[SwaggerUiOptions],
    options: js.UndefOr[SwaggerOptions],
    customCss: js.UndefOr[String],
    customfavIcon: js.UndefOr[String],
    swaggerUrl: js.UndefOr[String],
    customSiteTitle: js.UndefOr[String]
  ): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(swaggerDoc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], options.asInstanceOf[js.Any], customCss.asInstanceOf[js.Any], customfavIcon.asInstanceOf[js.Any], swaggerUrl.asInstanceOf[js.Any], customSiteTitle.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def setup(swaggerDoc: Unit, isExplorer: Boolean): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(swaggerDoc.asInstanceOf[js.Any], isExplorer.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def setup(swaggerDoc: JsonObject): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(swaggerDoc.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def setup(swaggerDoc: JsonObject, isExplorer: Boolean): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(swaggerDoc.asInstanceOf[js.Any], isExplorer.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  type JsonObject = StringDictionary[Any]
  
  type SwaggerOptions = StringDictionary[Any]
  
  trait SwaggerUiOptions extends StObject {
    
    var customCss: js.UndefOr[String] = js.undefined
    
    var customCssUrl: js.UndefOr[String] = js.undefined
    
    var customJs: js.UndefOr[String] = js.undefined
    
    var customSiteTitle: js.UndefOr[String] = js.undefined
    
    var customfavIcon: js.UndefOr[String] = js.undefined
    
    var explorer: js.UndefOr[Boolean] = js.undefined
    
    var isExplorer: js.UndefOr[Boolean] = js.undefined
    
    var swaggerOptions: js.UndefOr[SwaggerOptions] = js.undefined
    
    var swaggerUrl: js.UndefOr[String] = js.undefined
    
    var swaggerUrls: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SwaggerUiOptions {
    
    inline def apply(): SwaggerUiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerUiOptions]
    }
    
    extension [Self <: SwaggerUiOptions](x: Self) {
      
      inline def setCustomCss(value: String): Self = StObject.set(x, "customCss", value.asInstanceOf[js.Any])
      
      inline def setCustomCssUndefined: Self = StObject.set(x, "customCss", js.undefined)
      
      inline def setCustomCssUrl(value: String): Self = StObject.set(x, "customCssUrl", value.asInstanceOf[js.Any])
      
      inline def setCustomCssUrlUndefined: Self = StObject.set(x, "customCssUrl", js.undefined)
      
      inline def setCustomJs(value: String): Self = StObject.set(x, "customJs", value.asInstanceOf[js.Any])
      
      inline def setCustomJsUndefined: Self = StObject.set(x, "customJs", js.undefined)
      
      inline def setCustomSiteTitle(value: String): Self = StObject.set(x, "customSiteTitle", value.asInstanceOf[js.Any])
      
      inline def setCustomSiteTitleUndefined: Self = StObject.set(x, "customSiteTitle", js.undefined)
      
      inline def setCustomfavIcon(value: String): Self = StObject.set(x, "customfavIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomfavIconUndefined: Self = StObject.set(x, "customfavIcon", js.undefined)
      
      inline def setExplorer(value: Boolean): Self = StObject.set(x, "explorer", value.asInstanceOf[js.Any])
      
      inline def setExplorerUndefined: Self = StObject.set(x, "explorer", js.undefined)
      
      inline def setIsExplorer(value: Boolean): Self = StObject.set(x, "isExplorer", value.asInstanceOf[js.Any])
      
      inline def setIsExplorerUndefined: Self = StObject.set(x, "isExplorer", js.undefined)
      
      inline def setSwaggerOptions(value: SwaggerOptions): Self = StObject.set(x, "swaggerOptions", value.asInstanceOf[js.Any])
      
      inline def setSwaggerOptionsUndefined: Self = StObject.set(x, "swaggerOptions", js.undefined)
      
      inline def setSwaggerUrl(value: String): Self = StObject.set(x, "swaggerUrl", value.asInstanceOf[js.Any])
      
      inline def setSwaggerUrlUndefined: Self = StObject.set(x, "swaggerUrl", js.undefined)
      
      inline def setSwaggerUrls(value: js.Array[String]): Self = StObject.set(x, "swaggerUrls", value.asInstanceOf[js.Any])
      
      inline def setSwaggerUrlsUndefined: Self = StObject.set(x, "swaggerUrls", js.undefined)
      
      inline def setSwaggerUrlsVarargs(value: String*): Self = StObject.set(x, "swaggerUrls", js.Array(value*))
    }
  }
}
