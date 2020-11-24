package typings.wryContext

import typings.std.ReturnType
import typings.wryContext.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wry/context", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Slot: ReturnType[js.Function0[Instantiable]] = js.native
  
  def asyncFromGen[TArgs /* <: js.Array[_] */](genFn: js.Function1[/* args */ TArgs, _]): js.Function1[/* args */ TArgs, js.Promise[_]] = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(noContext) */ def bind[TArgs /* <: js.Array[_] */, TResult](callback: js.Function1[/* args */ TArgs, TResult]): js.Function1[/* args */ TArgs, TResult] = js.native
  
  def setTimeout(callback: js.Function0[_], delay: Double): js.Any = js.native
  
  def wrapYieldingFiberMethods[F /* <: js.Function */](Fiber: F): F = js.native
}
