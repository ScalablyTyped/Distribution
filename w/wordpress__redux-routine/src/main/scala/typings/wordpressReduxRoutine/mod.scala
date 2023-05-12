package typings.wordpressReduxRoutine

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/redux-routine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def default(controls: Record[String, js.Function1[/* value */ AnyAction, js.Promise[Boolean] | Boolean]]): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(controls.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
}
