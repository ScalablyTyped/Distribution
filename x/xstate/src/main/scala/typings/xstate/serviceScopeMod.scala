package typings.xstate

import typings.xstate.typesMod.AnyInterpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceScopeMod {
  
  @JSImport("xstate/lib/serviceScope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consume[T, TService /* <: AnyInterpreter */](fn: js.Function1[/* service */ TService, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("consume")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def provide[T, TService /* <: AnyInterpreter */](service: TService, fn: js.Function1[/* service */ js.UndefOr[TService], T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(service.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def provide[T, TService /* <: AnyInterpreter */](service: Unit, fn: js.Function1[/* service */ js.UndefOr[TService], T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(service.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
}
