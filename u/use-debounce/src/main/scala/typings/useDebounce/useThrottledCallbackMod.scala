package typings.useDebounce

import typings.std.ReturnType
import typings.useDebounce.useDebouncedCallbackMod.CallOptions
import typings.useDebounce.useDebouncedCallbackMod.DebouncedState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useThrottledCallbackMod {
  
  @JSImport("use-debounce/dist/useThrottledCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](func: T, wait: Double): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  inline def default[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](func: T, wait: Double, hasLeadingTrailing: CallOptions): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], hasLeadingTrailing.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
}
