package typings.xstate

import typings.xstate.xstateMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/devTools", JSImport.Namespace)
@js.native
object libDevToolsMod extends js.Object {
  def registerService(service: AnyInterpreter): Unit = js.native
  type AnyInterpreter = Interpreter[js.Any, js.Any, js.Any]
}

