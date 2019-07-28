package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticRelatedInformation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "Diagnostic")
@js.native
object DiagnosticNs extends js.Object {
  /**
    * Creates a new Diagnostic literal.
    */
  def create(range: Range, message: String): Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity): Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: String): Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: String, source: String): Diagnostic = js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Double): Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Double, source: String): Diagnostic = js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: Double,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = js.native
}

