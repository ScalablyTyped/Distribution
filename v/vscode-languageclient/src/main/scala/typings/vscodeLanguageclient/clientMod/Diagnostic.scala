package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  /**
    * Creates a new Diagnostic literal.
    */
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, message: String): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: String,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = js.native
}

