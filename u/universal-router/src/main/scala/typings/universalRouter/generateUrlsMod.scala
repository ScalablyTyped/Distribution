package typings.universalRouter

import org.scalablytyped.runtime.StringDictionary
import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.TokensToFunctionOptions
import typings.universalRouter.mod.RouterContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateUrlsMod {
  
  @JSImport("universal-router/src/generateUrls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a function to generate urls by route names.
    */
  inline def default(router: typings.universalRouter.mod.default[js.Any, RouterContext]): GenerateUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any]).asInstanceOf[GenerateUrl]
  inline def default(router: typings.universalRouter.mod.default[js.Any, RouterContext], options: GenerateUrlsOptions): GenerateUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GenerateUrl]
  
  type GenerateUrl = js.Function2[/* routeName */ String, /* params */ js.UndefOr[UrlParams], String]
  
  trait GenerateUrlsOptions
    extends StObject
       with ParseOptions
       with TokensToFunctionOptions {
    
    /**
      * Add a query string to generated url based on unknown route params.
      */
    var stringifyQueryParams: js.UndefOr[js.Function1[/* params */ UrlParams, String]] = js.undefined
  }
  object GenerateUrlsOptions {
    
    inline def apply(): GenerateUrlsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateUrlsOptions]
    }
    
    extension [Self <: GenerateUrlsOptions](x: Self) {
      
      inline def setStringifyQueryParams(value: /* params */ UrlParams => String): Self = StObject.set(x, "stringifyQueryParams", js.Any.fromFunction1(value))
      
      inline def setStringifyQueryParamsUndefined: Self = StObject.set(x, "stringifyQueryParams", js.undefined)
    }
  }
  
  type UrlParams = StringDictionary[String | Double | (js.Array[String | Double])]
}
