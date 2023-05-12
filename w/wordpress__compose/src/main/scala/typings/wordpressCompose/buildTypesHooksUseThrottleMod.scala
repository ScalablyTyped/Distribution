package typings.wordpressCompose

import typings.wordpressCompose.buildTypesUtilsDebounceMod.DebouncedFunc
import typings.wordpressCompose.buildTypesUtilsThrottleMod.ThrottleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseThrottleMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc): DebouncedFunc[TFunc] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[DebouncedFunc[TFunc]]
  inline def default[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Double): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  inline def default[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Double, options: ThrottleOptions): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  inline def default[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Unit, options: ThrottleOptions): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
}
