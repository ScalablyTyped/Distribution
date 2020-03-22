package typings.typedoc.mod.TypeScript

import typings.typescript.mod.DiagnosticReporter
import typings.typescript.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createBuilderStatusReporter")
@js.native
object createBuilderStatusReporter extends js.Object {
  /**
    * Create a function that reports watch status by writing to the system and handles the formating of the diagnostic
    */
  def apply(system: System): DiagnosticReporter = js.native
  def apply(system: System, pretty: Boolean): DiagnosticReporter = js.native
}

