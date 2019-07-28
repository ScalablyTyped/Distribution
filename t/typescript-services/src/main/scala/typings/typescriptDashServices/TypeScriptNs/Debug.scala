package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Debug")
@js.native
class Debug () extends js.Object

/* static members */
@JSGlobal("TypeScript.Debug")
@js.native
object Debug extends js.Object {
  var currentAssertionLevel: js.Any = js.native
  def assert(expression: js.Any): Unit = js.native
  def assert(expression: js.Any, message: String): Unit = js.native
  def assert(expression: js.Any, message: String, verboseDebugInfo: js.Function0[String]): Unit = js.native
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  def shouldAssert(level: AssertionLevel): Boolean = js.native
}

