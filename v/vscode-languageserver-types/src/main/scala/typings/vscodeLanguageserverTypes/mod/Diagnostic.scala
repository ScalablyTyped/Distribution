package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostic extends StObject {
  
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
  
  /**
    * Additional metadata about the diagnostic.
    */
  var tags: js.UndefOr[js.Array[DiagnosticTag]] = js.undefined
}
object Diagnostic {
  
  @scala.inline
  def apply(message: String, range: Range): Diagnostic = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  @JSImport("vscode-languageserver-types", "Diagnostic")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Diagnostic literal.
    */
  @scala.inline
  def create(range: Range, message: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: Unit, code: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: Unit, code: String, source: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: Unit,
    code: String,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: Unit,
    code: String,
    source: Unit,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: Unit, code: Double): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: Unit, code: Double, source: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: Unit,
    code: Double,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: Unit,
    code: Double,
    source: Unit,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: Unit, code: Unit, source: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: Unit,
    code: Unit,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: Unit,
    code: Unit,
    source: Unit,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: DiagnosticSeverity): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: String, source: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: String,
    source: Unit,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Double): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Double, source: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: Double,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: Double,
    source: Unit,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(range: Range, message: String, severity: DiagnosticSeverity, code: Unit, source: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: Unit,
    source: String,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  @scala.inline
  def create(
    range: Range,
    message: String,
    severity: DiagnosticSeverity,
    code: Unit,
    source: Unit,
    relatedInformation: js.Array[DiagnosticRelatedInformation]
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean]
  
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
