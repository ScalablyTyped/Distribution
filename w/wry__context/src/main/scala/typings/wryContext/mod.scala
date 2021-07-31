package typings.wryContext

import typings.std.ReturnType
import typings.wryContext.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wry/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wry/context", "Slot")
  @js.native
  val Slot: ReturnType[js.Function0[Instantiable]] = js.native
  
  @scala.inline
  def asyncFromGen[TArgs /* <: js.Array[js.Any] */](genFn: js.Function1[/* args */ TArgs, js.Any]): js.Function1[/* args */ TArgs, js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncFromGen")(genFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ TArgs, js.Promise[js.Any]]]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(noContext) */ @scala.inline
  def bind[TArgs /* <: js.Array[js.Any] */, TResult](callback: js.Function1[/* args */ TArgs, TResult]): js.Function1[/* args */ TArgs, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ TArgs, TResult]]
  
  @scala.inline
  def setTimeout(callback: js.Function0[js.Any], delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def wrapYieldingFiberMethods[F /* <: js.Function */](Fiber: F): F = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapYieldingFiberMethods")(Fiber.asInstanceOf[js.Any]).asInstanceOf[F]
}
