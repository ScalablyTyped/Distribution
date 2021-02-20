package typings.useDebounce

import typings.useDebounce.anon.EqualityFn
import typings.useDebounce.useDebouncedCallbackMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-debounce", "useDebounce")
  @js.native
  def useDebounce[T](value: T, delay: Double): js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]] = js.native
  @JSImport("use-debounce", "useDebounce")
  @js.native
  def useDebounce[T](value: T, delay: Double, options: EqualityFn[T]): js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]] = js.native
  
  @JSImport("use-debounce", "useDebouncedCallback")
  @js.native
  def useDebouncedCallback[T /* <: js.Array[_] */](func: js.Function1[/* args */ T, _], wait: Double): js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]] = js.native
  @JSImport("use-debounce", "useDebouncedCallback")
  @js.native
  def useDebouncedCallback[T /* <: js.Array[_] */](func: js.Function1[/* args */ T, _], wait: Double, options: Options): js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]] = js.native
}
