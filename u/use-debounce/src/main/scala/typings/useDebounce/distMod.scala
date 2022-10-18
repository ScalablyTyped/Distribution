package typings.useDebounce

import typings.std.ReturnType
import typings.useDebounce.anon.EqualityFn
import typings.useDebounce.distUseDebouncedCallbackMod.CallOptions
import typings.useDebounce.distUseDebouncedCallbackMod.ControlFunctions
import typings.useDebounce.distUseDebouncedCallbackMod.DebouncedState
import typings.useDebounce.distUseDebouncedCallbackMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("use-debounce/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDebounce[T](value: T, delay: Double): js.Tuple2[T, ControlFunctions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, ControlFunctions]]
  inline def useDebounce[T](value: T, delay: Double, options: EqualityFn[T]): js.Tuple2[T, ControlFunctions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, ControlFunctions]]
  
  inline def useDebouncedCallback[T /* <: js.Function1[/* args */ Any, ReturnType[T]] */](func: T): DebouncedState[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(func.asInstanceOf[js.Any]).asInstanceOf[DebouncedState[T]]
  inline def useDebouncedCallback[T /* <: js.Function1[/* args */ Any, ReturnType[T]] */](func: T, wait: Double): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  inline def useDebouncedCallback[T /* <: js.Function1[/* args */ Any, ReturnType[T]] */](func: T, wait: Double, options: Options): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  inline def useDebouncedCallback[T /* <: js.Function1[/* args */ Any, ReturnType[T]] */](func: T, wait: Unit, options: Options): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  
  inline def useThrottledCallback[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](func: T, wait: Double): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottledCallback")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
  inline def useThrottledCallback[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](func: T, wait: Double, hasLeadingTrailing: CallOptions): DebouncedState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottledCallback")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], hasLeadingTrailing.asInstanceOf[js.Any])).asInstanceOf[DebouncedState[T]]
}
