package typings.atUifabricUtilities

import typings.std.TypedPropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/memoize", JSImport.Namespace)
@js.native
object libMemoizeMod extends js.Object {
  def memoize[T /* <: js.Function */](target: js.Any, key: String, descriptor: TypedPropertyDescriptor[T]): Anon_Configurable[T] = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RET_TYPE] */, RET_TYPE](cb: T): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RET_TYPE] */, RET_TYPE](cb: T, maxCacheSize: Double): T = js.native
  def resetMemoizations(): Unit = js.native
  def setMemoizeWeakMap(weakMap: js.Any): Unit = js.native
}

