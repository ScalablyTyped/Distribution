package typings.xstate

import typings.xstate.anon.ContextAny
import typings.xstate.mod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devToolsMod {
  
  @JSImport("xstate/lib/devTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerService(service: AnyInterpreter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerService")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AnyInterpreter = Interpreter[js.Any, js.Any, js.Any, ContextAny]
}
