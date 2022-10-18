package typings.wordpressApiFetch

import org.scalablytyped.runtime.Shortcut
import typings.wordpressApiFetch.buildTypesTypesMod.APIFetchMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMiddlewaresMediaUploadMod extends Shortcut {
  
  /**
    * Middleware handling media upload failures and retries.
    *
    * @type {import('../types').APIFetchMiddleware}
    */
  @JSImport("@wordpress/api-fetch/build-types/middlewares/media-upload", JSImport.Default)
  @js.native
  val default: APIFetchMiddleware = js.native
  
  type _To = APIFetchMiddleware
  
  /* This means you don't have to write `default`, but can instead just say `buildTypesMiddlewaresMediaUploadMod.foo` */
  override def _to: APIFetchMiddleware = default
}
