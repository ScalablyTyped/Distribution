package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends js.Object {
  /**
    * The diagnostic's code, which usually appear in the user interface.
    */
  var code: js.UndefOr[Double | String] = js.undefined
  /**
    * The diagnostic's message. It usually appears in the user interface
    */
  var message: String
  /**
    * The range at which the message applies
    */
  var range: Range
  /**
    * An array of related diagnostic information, e.g. when symbol-names within
    * a scope collide all definitions can be marked via this property.
    */
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.undefined
  /**
    * The diagnostic's severity. Can be omitted. If omitted it is up to the
    * client to interpret diagnostics as error, warning, info or hint.
    */
  var severity: js.UndefOr[DiagnosticSeverity] = js.undefined
  /**
    * A human-readable string describing the source of this
    * diagnostic, e.g. 'typescript' or 'super lint'. It usually
    * appears in the user interface.
    */
  var source: js.UndefOr[String] = js.undefined
}

@JSImport("vscode-languageserver-types", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
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

