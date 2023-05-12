package typings.wordpressCompose

import typings.wordpressCompose.buildTypesUtilsDebounceMod.DebounceOptions
import typings.wordpressCompose.buildTypesUtilsDebounceMod.DebouncedFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseDebounceMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc): DebouncedFunc[TFunc] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[DebouncedFunc[TFunc]]
  inline def default[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Double): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  inline def default[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Double, options: DebounceOptions): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  inline def default[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Unit, options: DebounceOptions): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
}
