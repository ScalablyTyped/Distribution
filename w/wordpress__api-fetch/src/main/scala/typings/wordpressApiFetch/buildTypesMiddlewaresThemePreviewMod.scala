package typings.wordpressApiFetch

import typings.std.Record
import typings.wordpressApiFetch.buildTypesTypesMod.APIFetchMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMiddlewaresThemePreviewMod {
  
  @JSImport("@wordpress/api-fetch/build-types/middlewares/theme-preview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This appends a `theme_preview` parameter to the REST API request URL if
    * the admin URL contains a `theme` GET parameter.
    *
    * @param {Record<string, any>} themePath
    * @return {import('../types').APIFetchMiddleware} Preloading middleware.
    */
  inline def default(themePath: Record[String, Any]): APIFetchMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(themePath.asInstanceOf[js.Any]).asInstanceOf[APIFetchMiddleware]
}
