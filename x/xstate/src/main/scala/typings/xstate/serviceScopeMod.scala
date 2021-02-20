package typings.xstate

import typings.xstate.anon.ContextAny
import typings.xstate.interpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceScopeMod {
  
  @JSImport("xstate/lib/serviceScope", "consume")
  @js.native
  def consume[T, TService /* <: Interpreter[_, _, _, ContextAny] */](fn: js.Function1[/* service */ TService, T]): T = js.native
  
  @JSImport("xstate/lib/serviceScope", "provide")
  @js.native
  def provide[T, TService /* <: Interpreter[_, _, _, ContextAny] */](service: TService, fn: js.Function1[/* service */ js.UndefOr[TService], T]): T = js.native
  @JSImport("xstate/lib/serviceScope", "provide")
  @js.native
  def provide[T, TService /* <: Interpreter[_, _, _, ContextAny] */](service: js.UndefOr[scala.Nothing], fn: js.Function1[/* service */ js.UndefOr[TService], T]): T = js.native
}
