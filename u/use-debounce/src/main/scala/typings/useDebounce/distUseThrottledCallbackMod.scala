package typings.useDebounce

import typings.std.ReturnType
import typings.useDebounce.distUseDebouncedCallbackMod.CallOptions
import typings.useDebounce.distUseDebouncedCallbackMod.DebouncedState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUseThrottledCallbackMod {
  
  @JSImport("use-debounce/dist/useThrottledCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](func: T, wait: Double): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  inline def default[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](func: T, wait: Double, hasLeadingTrailing: CallOptions): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], hasLeadingTrailing.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
}
