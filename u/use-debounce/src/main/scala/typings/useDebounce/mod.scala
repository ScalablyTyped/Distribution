package typings.useDebounce

import typings.useDebounce.anon.EqualityFn
import typings.useDebounce.useDebouncedCallbackMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-debounce", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def useDebounce[T](value: T, delay: Double): js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]] = js.native
  def useDebounce[T](value: T, delay: Double, options: EqualityFn[T]): js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]] = js.native
  
  def useDebouncedCallback[T /* <: js.Array[_] */](func: js.Function1[/* args */ T, _], wait: Double): js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]] = js.native
  def useDebouncedCallback[T /* <: js.Array[_] */](func: js.Function1[/* args */ T, _], wait: Double, options: Options): js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]] = js.native
}
