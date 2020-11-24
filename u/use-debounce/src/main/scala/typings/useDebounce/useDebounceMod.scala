package typings.useDebounce

import typings.useDebounce.anon.EqualityFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-debounce/lib/useDebounce", JSImport.Namespace)
@js.native
object useDebounceMod extends js.Object {
  
  def default[T](value: T, delay: Double): js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]] = js.native
  def default[T](value: T, delay: Double, options: EqualityFn[T]): js.Tuple3[T, js.Function0[Unit], js.Function0[Unit]] = js.native
}
