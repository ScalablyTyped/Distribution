package typings.wordpressData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesResolversCacheMiddlewareMod {
  
  @JSImport("@wordpress/data/build-types/resolvers-cache-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @typedef {import('./registry').WPDataRegistry} WPDataRegistry */
  /**
    * Creates a middleware handling resolvers cache invalidation.
    *
    * @param {WPDataRegistry} registry   The registry reference for which to create
    *                                    the middleware.
    * @param {string}         reducerKey The namespace for which to create the
    *                                    middleware.
    *
    * @return {Function} Middleware function.
    */
  inline def default(registry: WPDataRegistry, reducerKey: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(registry.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  type WPDataRegistry = typings.wordpressData.buildTypesRegistryMod.WPDataRegistry
}
