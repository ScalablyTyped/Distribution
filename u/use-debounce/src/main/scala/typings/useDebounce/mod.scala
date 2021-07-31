package typings.useDebounce

import typings.useDebounce.anon.EqualityFn
import typings.useDebounce.useDebouncedCallbackMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useDebounce[T](value: T, delay: Double): js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]]]
  @scala.inline
  def useDebounce[T](value: T, delay: Double, options: EqualityFn[T]): js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]]]
  
  @scala.inline
  def useDebouncedCallback[T /* <: js.Array[js.Any] */](func: js.Function1[/* args */ T, js.Any], wait: Double): js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]]]
  @scala.inline
  def useDebouncedCallback[T /* <: js.Array[js.Any] */](func: js.Function1[/* args */ T, js.Any], wait: Double, options: Options): js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]]]
}
