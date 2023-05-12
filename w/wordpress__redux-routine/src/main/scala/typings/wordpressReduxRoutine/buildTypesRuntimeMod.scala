package typings.wordpressReduxRoutine

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.std.Generator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesRuntimeMod {
  
  @JSImport("@wordpress/redux-routine/build-types/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(controls: Unit, dispatch: Dispatch[AnyAction]): js.Function1[/* action */ AnyAction | (Generator[Any, Any, Any]), js.Promise[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(controls.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* action */ AnyAction | (Generator[Any, Any, Any]), js.Promise[Any]]]
  inline def default(
    controls: Record[String, js.Function1[/* value */ Any, js.Promise[Boolean] | Boolean]],
    dispatch: Dispatch[AnyAction]
  ): js.Function1[/* action */ AnyAction | (Generator[Any, Any, Any]), js.Promise[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(controls.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* action */ AnyAction | (Generator[Any, Any, Any]), js.Promise[Any]]]
}
