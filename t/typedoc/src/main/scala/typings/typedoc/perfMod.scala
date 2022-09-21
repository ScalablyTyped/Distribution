package typings.typedoc

import typings.std.MethodDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perfMod {
  
  @JSImport("typedoc/dist/lib/utils/perf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bench_(): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Bench")().asInstanceOf[MethodDecorator]
  
  inline def bench[T /* <: js.Function */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("bench")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def bench[T /* <: js.Function */](fn: T, name: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bench")(fn.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def measure[T](cb: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(cb.asInstanceOf[js.Any]).asInstanceOf[T]
}
