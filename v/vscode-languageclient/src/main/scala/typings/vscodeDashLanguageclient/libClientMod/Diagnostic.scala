package typings.vscodeDashLanguageclient.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  /**
    * Creates a new Diagnostic literal.
    */
  def create(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    message: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    message: String,
    severity: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    message: String,
    severity: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    message: String,
    severity: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: String,
    source: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    message: String,
    severity: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticRelatedInformation
    ]
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    message: String,
    severity: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: Double
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    message: String,
    severity: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: Double,
    source: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    message: String,
    severity: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: Double,
    source: String,
    relatedInformation: js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticRelatedInformation
    ]
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = js.native
}

