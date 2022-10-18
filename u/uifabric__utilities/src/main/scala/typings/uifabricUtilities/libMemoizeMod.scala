package typings.uifabricUtilities

import typings.std.TypedPropertyDescriptor
import typings.uifabricUtilities.anon.Configurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMemoizeMod {
  
  @JSImport("@uifabric/utilities/lib/memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMemoizer[F /* <: js.Function1[/* input */ Any, Any] */](getValue: F): F = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoizer")(getValue.asInstanceOf[js.Any]).asInstanceOf[F]
  
  inline def memoize[T /* <: js.Function */](target: Any, key: String, descriptor: TypedPropertyDescriptor[T]): Configurable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Configurable[T]]
  
  inline def memoizeFunction[T /* <: js.Function1[/* repeated */ Any, RetType] */, RetType](cb: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeFunction")(cb.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def memoizeFunction[T /* <: js.Function1[/* repeated */ Any, RetType] */, RetType](cb: T, maxCacheSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeFunction")(cb.asInstanceOf[js.Any], maxCacheSize.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def memoizeFunction[T /* <: js.Function1[/* repeated */ Any, RetType] */, RetType](cb: T, maxCacheSize: Double, ignoreNullOrUndefinedResult: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeFunction")(cb.asInstanceOf[js.Any], maxCacheSize.asInstanceOf[js.Any], ignoreNullOrUndefinedResult.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def memoizeFunction[T /* <: js.Function1[/* repeated */ Any, RetType] */, RetType](cb: T, maxCacheSize: Unit, ignoreNullOrUndefinedResult: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeFunction")(cb.asInstanceOf[js.Any], maxCacheSize.asInstanceOf[js.Any], ignoreNullOrUndefinedResult.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def resetMemoizations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetMemoizations")().asInstanceOf[Unit]
  
  inline def setMemoizeWeakMap(weakMap: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMemoizeWeakMap")(weakMap.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
