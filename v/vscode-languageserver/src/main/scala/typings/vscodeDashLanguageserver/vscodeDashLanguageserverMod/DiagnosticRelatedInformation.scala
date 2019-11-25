package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DiagnosticRelatedInformation")
@js.native
object DiagnosticRelatedInformation extends js.Object {
  /**
    * Creates a new DiagnosticRelatedInformation literal.
    */
  def create(
    location: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location,
    message: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticRelatedInformation = js.native
  /**
    * Checks whether the given literal conforms to the [DiagnosticRelatedInformation](#DiagnosticRelatedInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean = js.native
}

