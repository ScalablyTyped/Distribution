package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Debug")
@js.native
class Debug ()
  extends typescriptDashServicesLib.TypeScriptNs.Debug

@JSImport("typescript-services", "Debug")
@js.native
object Debug extends js.Object {
  var currentAssertionLevel: js.Any = js.native
  def assert(expression: js.Any): scala.Unit = js.native
  def assert(expression: js.Any, message: java.lang.String): scala.Unit = js.native
  def assert(expression: js.Any, message: java.lang.String, verboseDebugInfo: js.Function0[java.lang.String]): scala.Unit = js.native
  def fail(): scala.Unit = js.native
  def fail(message: java.lang.String): scala.Unit = js.native
  def shouldAssert(level: typescriptDashServicesLib.TypeScriptNs.AssertionLevel): scala.Boolean = js.native
}

