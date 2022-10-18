package typings.wordpressApiFetch

import org.scalablytyped.runtime.Shortcut
import typings.wordpressApiFetch.buildTypesTypesMod.APIFetchMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMiddlewaresHttpV1Mod extends Shortcut {
  
  /**
    * API Fetch middleware which overrides the request method for HTTP v1
    * compatibility leveraging the REST API X-HTTP-Method-Override header.
    *
    * @type {import('../types').APIFetchMiddleware}
    */
  @JSImport("@wordpress/api-fetch/build-types/middlewares/http-v1", JSImport.Default)
  @js.native
  val default: APIFetchMiddleware = js.native
  
  type _To = APIFetchMiddleware
  
  /* This means you don't have to write `default`, but can instead just say `buildTypesMiddlewaresHttpV1Mod.foo` */
  override def _to: APIFetchMiddleware = default
}
