package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticRelatedInformation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  /**
    * Creates a new Diagnostic literal.
    */
  def create(range: Range, message: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: String, source: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Double): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Double, source: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: Double,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = js.native
}

