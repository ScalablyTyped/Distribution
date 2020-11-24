package typings.uifabricUtilities

import typings.std.TypedPropertyDescriptor
import typings.uifabricUtilities.anon.Configurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/memoize", JSImport.Namespace)
@js.native
object memoizeMod extends js.Object {
  
  def createMemoizer[F /* <: js.Function1[/* input */ js.Any, _] */](getValue: F): F = js.native
  
  def memoize[T /* <: js.Function */](target: js.Any, key: String, descriptor: TypedPropertyDescriptor[T]): Configurable[T] = js.native
  
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: js.UndefOr[scala.Nothing], ignoreNullOrUndefinedResult: Boolean): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: Double): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: Double, ignoreNullOrUndefinedResult: Boolean): T = js.native
  
  def resetMemoizations(): Unit = js.native
  
  def setMemoizeWeakMap(weakMap: js.Any): Unit = js.native
}
