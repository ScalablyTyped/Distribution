package typings.xstate

import typings.xstate.anon.ContextAny
import typings.xstate.mod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/devTools", JSImport.Namespace)
@js.native
object devToolsMod extends js.Object {
  
  def registerService(service: AnyInterpreter): Unit = js.native
  
  type AnyInterpreter = Interpreter[js.Any, js.Any, js.Any, ContextAny]
}
