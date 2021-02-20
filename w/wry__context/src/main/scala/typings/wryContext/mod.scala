package typings.wryContext

import typings.std.ReturnType
import typings.wryContext.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wry/context", "Slot")
  @js.native
  val Slot: ReturnType[js.Function0[Instantiable]] = js.native
  
  @JSImport("@wry/context", "asyncFromGen")
  @js.native
  def asyncFromGen[TArgs /* <: js.Array[_] */](genFn: js.Function1[/* args */ TArgs, _]): js.Function1[/* args */ TArgs, js.Promise[_]] = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(noContext) */ @JSImport("@wry/context", "bind")
  @js.native
  def bind[TArgs /* <: js.Array[_] */, TResult](callback: js.Function1[/* args */ TArgs, TResult]): js.Function1[/* args */ TArgs, TResult] = js.native
  
  @JSImport("@wry/context", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function0[_], delay: Double): js.Any = js.native
  
  @JSImport("@wry/context", "wrapYieldingFiberMethods")
  @js.native
  def wrapYieldingFiberMethods[F /* <: js.Function */](Fiber: F): F = js.native
}
