package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DiagnosticRelatedInformation")
@js.native
object DiagnosticRelatedInformationNs extends js.Object {
  /**
       * Creates a new DiagnosticRelatedInformation literal.
       */
  def create(
    location: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location,
    message: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticRelatedInformation = js.native
  /**
       * Checks whether the given literal conforms to the [DiagnosticRelatedInformation](#DiagnosticRelatedInformation) interface.
       */
  def is(value: js.Any): /* is DiagnosticRelatedInformation */scala.Boolean = js.native
}

