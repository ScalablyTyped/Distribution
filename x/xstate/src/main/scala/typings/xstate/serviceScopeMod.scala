package typings.xstate

import typings.xstate.anon.ContextAny
import typings.xstate.interpreterMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/serviceScope", JSImport.Namespace)
@js.native
object serviceScopeMod extends js.Object {
  
  def consume[T, TService /* <: Interpreter[_, _, _, ContextAny] */](fn: js.Function1[/* service */ TService, T]): T = js.native
  
  def provide[T, TService /* <: Interpreter[_, _, _, ContextAny] */](service: TService, fn: js.Function1[/* service */ js.UndefOr[TService], T]): T = js.native
  def provide[T, TService /* <: Interpreter[_, _, _, ContextAny] */](service: js.UndefOr[scala.Nothing], fn: js.Function1[/* service */ js.UndefOr[TService], T]): T = js.native
}
