package typings.wordpressApiFetch

import org.scalablytyped.runtime.Shortcut
import typings.wordpressApiFetch.buildTypesTypesMod.APIFetchMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMiddlewaresFetchAllMiddlewareMod extends Shortcut {
  
  /**
    * The REST API enforces an upper limit on the per_page option. To handle large
    * collections, apiFetch consumers can pass `per_page=-1`; this middleware will
    * then recursively assemble a full response array from all available pages.
    *
    * @type {import('../types').APIFetchMiddleware}
    */
  @JSImport("@wordpress/api-fetch/build-types/middlewares/fetch-all-middleware", JSImport.Default)
  @js.native
  val default: APIFetchMiddleware = js.native
  
  type _To = APIFetchMiddleware
  
  /* This means you don't have to write `default`, but can instead just say `buildTypesMiddlewaresFetchAllMiddlewareMod.foo` */
  override def _to: APIFetchMiddleware = default
}
