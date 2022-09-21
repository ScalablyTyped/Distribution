package typings.wordpressApiFetch

import org.scalablytyped.runtime.Shortcut
import typings.wordpressApiFetch.typesMod.APIFetchMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespaceEndpointMod extends Shortcut {
  
  /**
    * @type {import('../types').APIFetchMiddleware}
    */
  @JSImport("@wordpress/api-fetch/build-types/middlewares/namespace-endpoint", JSImport.Default)
  @js.native
  val default: APIFetchMiddleware = js.native
  
  type _To = APIFetchMiddleware
  
  /* This means you don't have to write `default`, but can instead just say `namespaceEndpointMod.foo` */
  override def _to: APIFetchMiddleware = default
}
