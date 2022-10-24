package typings.wixStyleReact

import typings.lodash.mod.DebouncedFunc
import typings.wixStyleReact.anon.FnCallFuncWaitOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUseDebouncedCallbackUseDebouncedCallbackMod {
  
  @JSImport("wix-style-react/dist/types/providers/useDebouncedCallback/useDebouncedCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** A hook for creating a debounced callback function */
  inline def default(cb: Any, dependencies: Any): DebouncedFunc[js.Function1[/* args */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[js.Function1[/* args */ Any, Unit]]]
  inline def default(cb: Any, dependencies: Any, debounceMs: Double): DebouncedFunc[js.Function1[/* args */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[js.Function1[/* args */ Any, Unit]]]
  inline def default(cb: Any, dependencies: Any, debounceMs: Double, debounceFn: FnCallFuncWaitOptions): DebouncedFunc[js.Function1[/* args */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any], debounceFn.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[js.Function1[/* args */ Any, Unit]]]
  inline def default(cb: Any, dependencies: Any, debounceMs: Unit, debounceFn: FnCallFuncWaitOptions): DebouncedFunc[js.Function1[/* args */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any], debounceFn.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[js.Function1[/* args */ Any, Unit]]]
}
