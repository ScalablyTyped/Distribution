package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagnostic extends StObject {
  
  /**
    * The diagnostic's code, which usually appear in the user interface.
    */
  var code: js.UndefOr[Double | String] = js.native
  
  /**
    * The diagnostic's message. It usually appears in the user interface
    */
  var message: String = js.native
  
  /**
    * The range at which the message applies
    */
  var range: Range = js.native
  
  /**
    * An array of related diagnostic information, e.g. when symbol-names within
    * a scope collide all definitions can be marked via this property.
    */
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.native
  
  /**
    * The diagnostic's severity. Can be omitted. If omitted it is up to the
    * client to interpret diagnostics as error, warning, info or hint.
    */
  var severity: js.UndefOr[DiagnosticSeverity] = js.native
  
  /**
    * A human-readable string describing the source of this
    * diagnostic, e.g. 'typescript' or 'super lint'. It usually
    * appears in the user interface.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Additional metadata about the diagnostic.
    */
  var tags: js.UndefOr[js.Array[DiagnosticTag]] = js.native
}
object Diagnostic {
  
  @scala.inline
  def apply(message: String, range: Range): Diagnostic = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  /**
    * Creates a new Diagnostic literal.
    */
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: js.UndefOr[scala.Nothing],
    code: js.UndefOr[scala.Nothing],
    source: js.UndefOr[scala.Nothing],
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: js.UndefOr[scala.Nothing],
    code: js.UndefOr[scala.Nothing],
    source: String
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: js.UndefOr[scala.Nothing],
    code: js.UndefOr[scala.Nothing],
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: js.UndefOr[scala.Nothing], code: String): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: js.UndefOr[scala.Nothing],
    code: String,
    source: js.UndefOr[scala.Nothing],
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: js.UndefOr[scala.Nothing], code: String, source: String): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: js.UndefOr[scala.Nothing],
    code: String,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: js.UndefOr[scala.Nothing], code: Double): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: js.UndefOr[scala.Nothing],
    code: Double,
    source: js.UndefOr[scala.Nothing],
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: js.UndefOr[scala.Nothing], code: Double, source: String): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: js.UndefOr[scala.Nothing],
    code: Double,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: js.UndefOr[scala.Nothing],
    source: js.UndefOr[scala.Nothing],
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: js.UndefOr[scala.Nothing],
    source: String
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: js.UndefOr[scala.Nothing],
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: String): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: String,
    source: js.UndefOr[scala.Nothing],
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: String, source: String): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Double): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: Double,
    source: js.UndefOr[scala.Nothing],
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Double, source: String): Diagnostic = js.native
  @JSImport("vscode-languageserver-types", "Diagnostic.create")
  @js.native
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
  @JSImport("vscode-languageserver-types", "Diagnostic.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = js.native
  
  @scala.inline
  implicit class DiagnosticMutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedInformation(value: js.Array[DiagnosticRelatedInformation]): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    @scala.inline
    def setRelatedInformationVarargs(value: DiagnosticRelatedInformation*): Self = StObject.set(x, "relatedInformation", js.Array(value :_*))
    
    @scala.inline
    def setSeverity(value: DiagnosticSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[DiagnosticTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: DiagnosticTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
