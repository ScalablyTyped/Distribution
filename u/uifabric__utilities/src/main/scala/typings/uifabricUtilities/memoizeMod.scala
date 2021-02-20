package typings.uifabricUtilities

import typings.std.TypedPropertyDescriptor
import typings.uifabricUtilities.anon.Configurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoizeMod {
  
  @JSImport("@uifabric/utilities/lib/memoize", "createMemoizer")
  @js.native
  def createMemoizer[F /* <: js.Function1[/* input */ js.Any, _] */](getValue: F): F = js.native
  
  @JSImport("@uifabric/utilities/lib/memoize", "memoize")
  @js.native
  def memoize[T /* <: js.Function */](target: js.Any, key: String, descriptor: TypedPropertyDescriptor[T]): Configurable[T] = js.native
  
  @JSImport("@uifabric/utilities/lib/memoize", "memoizeFunction")
  @js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T): T = js.native
  @JSImport("@uifabric/utilities/lib/memoize", "memoizeFunction")
  @js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: js.UndefOr[scala.Nothing], ignoreNullOrUndefinedResult: Boolean): T = js.native
  @JSImport("@uifabric/utilities/lib/memoize", "memoizeFunction")
  @js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: Double): T = js.native
  @JSImport("@uifabric/utilities/lib/memoize", "memoizeFunction")
  @js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: Double, ignoreNullOrUndefinedResult: Boolean): T = js.native
  
  @JSImport("@uifabric/utilities/lib/memoize", "resetMemoizations")
  @js.native
  def resetMemoizations(): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/memoize", "setMemoizeWeakMap")
  @js.native
  def setMemoizeWeakMap(weakMap: js.Any): Unit = js.native
}
