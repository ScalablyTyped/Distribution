package typings.wordpressData

import org.scalablytyped.runtime.Shortcut
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesPromiseMiddlewareMod extends Shortcut {
  
  /**
    * Simplest possible promise redux middleware.
    *
    * @type {import('redux').Middleware}
    */
  @JSImport("@wordpress/data/build-types/promise-middleware", JSImport.Default)
  @js.native
  val default: Middleware[js.Object, Any, Dispatch[AnyAction]] = js.native
  
  type _To = Middleware[js.Object, Any, Dispatch[AnyAction]]
  
  /* This means you don't have to write `default`, but can instead just say `buildTypesPromiseMiddlewareMod.foo` */
  override def _to: Middleware[js.Object, Any, Dispatch[AnyAction]] = default
}
