package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Debug")
@js.native
class Debug ()
  extends typings.typescriptServices.TypeScript.Debug

/* static members */
@JSImport("typescript-services", "Debug")
@js.native
object Debug extends js.Object {
  var currentAssertionLevel: js.Any = js.native
  def assert(expression: js.Any): Unit = js.native
  def assert(expression: js.Any, message: js.UndefOr[scala.Nothing], verboseDebugInfo: js.Function0[String]): Unit = js.native
  def assert(expression: js.Any, message: String): Unit = js.native
  def assert(expression: js.Any, message: String, verboseDebugInfo: js.Function0[String]): Unit = js.native
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  def shouldAssert(level: typings.typescriptServices.TypeScript.AssertionLevel): Boolean = js.native
}

