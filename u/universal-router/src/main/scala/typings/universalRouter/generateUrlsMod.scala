package typings.universalRouter

import org.scalablytyped.runtime.StringDictionary
import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.TokensToFunctionOptions
import typings.universalRouter.mod.RouterContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateUrlsMod {
  
  /**
    * Create a function to generate urls by route names.
    */
  @JSImport("universal-router/src/generateUrls", JSImport.Default)
  @js.native
  def default(router: typings.universalRouter.mod.default[_, RouterContext]): GenerateUrl = js.native
  @JSImport("universal-router/src/generateUrls", JSImport.Default)
  @js.native
  def default(router: typings.universalRouter.mod.default[_, RouterContext], options: GenerateUrlsOptions): GenerateUrl = js.native
  
  type GenerateUrl = js.Function2[/* routeName */ String, /* params */ js.UndefOr[UrlParams], String]
  
  @js.native
  trait GenerateUrlsOptions
    extends ParseOptions
       with TokensToFunctionOptions {
    
    /**
      * Add a query string to generated url based on unknown route params.
      */
    var stringifyQueryParams: js.UndefOr[js.Function1[/* params */ UrlParams, String]] = js.native
  }
  object GenerateUrlsOptions {
    
    @scala.inline
    def apply(): GenerateUrlsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateUrlsOptions]
    }
    
    @scala.inline
    implicit class GenerateUrlsOptionsMutableBuilder[Self <: GenerateUrlsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStringifyQueryParams(value: /* params */ UrlParams => String): Self = StObject.set(x, "stringifyQueryParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringifyQueryParamsUndefined: Self = StObject.set(x, "stringifyQueryParams", js.undefined)
    }
  }
  
  type UrlParams = StringDictionary[String | Double | (js.Array[String | Double])]
}
