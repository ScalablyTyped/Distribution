package typings.xstate

import typings.xstate.anon.ContextAny
import typings.xstate.mod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devToolsMod {
  
  @JSImport("xstate/lib/devTools", "registerService")
  @js.native
  def registerService(service: AnyInterpreter): Unit = js.native
  
  type AnyInterpreter = Interpreter[js.Any, js.Any, js.Any, ContextAny]
}
