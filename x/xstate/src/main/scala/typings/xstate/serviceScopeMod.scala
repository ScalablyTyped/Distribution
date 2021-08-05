package typings.xstate

import typings.xstate.anon.ContextAny
import typings.xstate.interpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceScopeMod {
  
  @JSImport("xstate/lib/serviceScope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consume[T, TService /* <: Interpreter[js.Any, js.Any, js.Any, ContextAny] */](fn: js.Function1[/* service */ TService, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("consume")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def provide[T, TService /* <: Interpreter[js.Any, js.Any, js.Any, ContextAny] */](service: TService, fn: js.Function1[/* service */ js.UndefOr[TService], T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(service.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def provide[T, TService /* <: Interpreter[js.Any, js.Any, js.Any, ContextAny] */](service: Unit, fn: js.Function1[/* service */ js.UndefOr[TService], T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(service.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
}
