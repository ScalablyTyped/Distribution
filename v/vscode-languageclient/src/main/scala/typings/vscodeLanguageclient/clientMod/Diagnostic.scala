package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagnostic {
  
  @JSImport("vscode-languageclient/lib/client", "Diagnostic")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Diagnostic literal.
    */
  @scala.inline
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, message: String): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, message: String, severity: Unit, code: String): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: String,
    source: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: String,
    source: String,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: String,
    source: Unit,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, message: String, severity: Unit, code: Double): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Double,
    source: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Double,
    source: String,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Double,
    source: Unit,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Unit,
    source: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Unit,
    source: String,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Unit,
    source: Unit,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: Unit,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: String,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: Unit,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Unit,
    source: String
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Unit,
    source: String,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  @scala.inline
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typings.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Unit,
    source: Unit,
    relatedInformation: js.Array[typings.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typings.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Diagnostic]
  
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean]
}
