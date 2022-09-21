package typings.vscodeLanguageclient.diagnosticMod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Diagnostic
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.diagnosticMod.vsdiag.DocumentDiagnosticReportKind.full
import typings.vscodeLanguageclient.diagnosticMod.vsdiag.DocumentDiagnosticReportKind.unChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vsdiag {
  
  @js.native
  sealed trait DocumentDiagnosticReportKind extends StObject
  @JSImport("vscode-languageclient/lib/common/diagnostic", "vsdiag.DocumentDiagnosticReportKind")
  @js.native
  object DocumentDiagnosticReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DocumentDiagnosticReportKind & String] = js.native
    
    @js.native
    sealed trait full
      extends StObject
         with DocumentDiagnosticReportKind
    /* "full" */ val full: typings.vscodeLanguageclient.diagnosticMod.vsdiag.DocumentDiagnosticReportKind.full & String = js.native
    
    @js.native
    sealed trait unChanged
      extends StObject
         with DocumentDiagnosticReportKind
    /* "unChanged" */ val unChanged: typings.vscodeLanguageclient.diagnosticMod.vsdiag.DocumentDiagnosticReportKind.unChanged & String = js.native
  }
  
  @js.native
  trait DiagnosticProvider extends StObject {
    
    def onDidChangeDiagnostics(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
    def onDidChangeDiagnostics(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
    def onDidChangeDiagnostics(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onDidChangeDiagnostics(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    @JSName("onDidChangeDiagnostics")
    var onDidChangeDiagnostics_Original: Event[Unit] = js.native
    
    def provideDiagnostics(document: TextDocument, previousResultId: String, token: CancellationToken): ProviderResult[DocumentDiagnosticReport] = js.native
    def provideDiagnostics(document: TextDocument, previousResultId: Unit, token: CancellationToken): ProviderResult[DocumentDiagnosticReport] = js.native
    def provideDiagnostics(document: Uri, previousResultId: String, token: CancellationToken): ProviderResult[DocumentDiagnosticReport] = js.native
    def provideDiagnostics(document: Uri, previousResultId: Unit, token: CancellationToken): ProviderResult[DocumentDiagnosticReport] = js.native
    
    var provideWorkspaceDiagnostics: js.UndefOr[
        js.Function3[
          /* resultIds */ js.Array[PreviousResultId], 
          /* token */ CancellationToken, 
          /* resultReporter */ ResultReporter, 
          ProviderResult[WorkspaceDiagnosticReport]
        ]
      ] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeLanguageclient.diagnosticMod.vsdiag.RelatedFullDocumentDiagnosticReport
    - typings.vscodeLanguageclient.diagnosticMod.vsdiag.RelatedUnchangedDocumentDiagnosticReport
  */
  trait DocumentDiagnosticReport extends StObject
  object DocumentDiagnosticReport {
    
    inline def RelatedFullDocumentDiagnosticReport(items: js.Array[Diagnostic], kind: full): typings.vscodeLanguageclient.diagnosticMod.vsdiag.RelatedFullDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vscodeLanguageclient.diagnosticMod.vsdiag.RelatedFullDocumentDiagnosticReport]
    }
    
    inline def RelatedUnchangedDocumentDiagnosticReport(kind: unChanged, resultId: String): typings.vscodeLanguageclient.diagnosticMod.vsdiag.RelatedUnchangedDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vscodeLanguageclient.diagnosticMod.vsdiag.RelatedUnchangedDocumentDiagnosticReport]
    }
  }
  
  trait FullDocumentDiagnosticReport extends StObject {
    
    var items: js.Array[Diagnostic]
    
    var kind: full
    
    var resultId: js.UndefOr[String] = js.undefined
  }
  object FullDocumentDiagnosticReport {
    
    inline def apply(items: js.Array[Diagnostic], kind: full): FullDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullDocumentDiagnosticReport]
    }
    
    extension [Self <: FullDocumentDiagnosticReport](x: Self) {
      
      inline def setItems(value: js.Array[Diagnostic]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Diagnostic*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKind(value: full): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
      
      inline def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
    }
  }
  
  trait PreviousResultId extends StObject {
    
    var uri: Uri
    
    var value: String
  }
  object PreviousResultId {
    
    inline def apply(uri: Uri, value: String): PreviousResultId = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviousResultId]
    }
    
    extension [Self <: PreviousResultId](x: Self) {
      
      inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelatedFullDocumentDiagnosticReport
    extends StObject
       with FullDocumentDiagnosticReport
       with DocumentDiagnosticReport {
    
    var relatedDocuments: js.UndefOr[
        StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]
      ] = js.undefined
  }
  object RelatedFullDocumentDiagnosticReport {
    
    inline def apply(items: js.Array[Diagnostic], kind: full): RelatedFullDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelatedFullDocumentDiagnosticReport]
    }
    
    extension [Self <: RelatedFullDocumentDiagnosticReport](x: Self) {
      
      inline def setRelatedDocuments(value: StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]): Self = StObject.set(x, "relatedDocuments", value.asInstanceOf[js.Any])
      
      inline def setRelatedDocumentsUndefined: Self = StObject.set(x, "relatedDocuments", js.undefined)
    }
  }
  
  trait RelatedUnchangedDocumentDiagnosticReport
    extends StObject
       with UnchangedDocumentDiagnosticReport
       with DocumentDiagnosticReport {
    
    var relatedDocuments: js.UndefOr[
        StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]
      ] = js.undefined
  }
  object RelatedUnchangedDocumentDiagnosticReport {
    
    inline def apply(kind: unChanged, resultId: String): RelatedUnchangedDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelatedUnchangedDocumentDiagnosticReport]
    }
    
    extension [Self <: RelatedUnchangedDocumentDiagnosticReport](x: Self) {
      
      inline def setRelatedDocuments(value: StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]): Self = StObject.set(x, "relatedDocuments", value.asInstanceOf[js.Any])
      
      inline def setRelatedDocumentsUndefined: Self = StObject.set(x, "relatedDocuments", js.undefined)
    }
  }
  
  type ResultReporter = js.Function1[/* chunk */ WorkspaceDiagnosticReportPartialResult | Null, Unit]
  
  trait UnchangedDocumentDiagnosticReport extends StObject {
    
    var kind: unChanged
    
    var resultId: String
  }
  object UnchangedDocumentDiagnosticReport {
    
    inline def apply(kind: unChanged, resultId: String): UnchangedDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnchangedDocumentDiagnosticReport]
    }
    
    extension [Self <: UnchangedDocumentDiagnosticReport](x: Self) {
      
      inline def setKind(value: unChanged): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkspaceDiagnosticReport extends StObject {
    
    var items: js.Array[WorkspaceDocumentDiagnosticReport]
  }
  object WorkspaceDiagnosticReport {
    
    inline def apply(items: js.Array[WorkspaceDocumentDiagnosticReport]): WorkspaceDiagnosticReport = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceDiagnosticReport]
    }
    
    extension [Self <: WorkspaceDiagnosticReport](x: Self) {
      
      inline def setItems(value: js.Array[WorkspaceDocumentDiagnosticReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: WorkspaceDocumentDiagnosticReport*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait WorkspaceDiagnosticReportPartialResult extends StObject {
    
    var items: js.Array[WorkspaceDocumentDiagnosticReport]
  }
  object WorkspaceDiagnosticReportPartialResult {
    
    inline def apply(items: js.Array[WorkspaceDocumentDiagnosticReport]): WorkspaceDiagnosticReportPartialResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceDiagnosticReportPartialResult]
    }
    
    extension [Self <: WorkspaceDiagnosticReportPartialResult](x: Self) {
      
      inline def setItems(value: js.Array[WorkspaceDocumentDiagnosticReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: WorkspaceDocumentDiagnosticReport*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeLanguageclient.diagnosticMod.vsdiag.WorkspaceFullDocumentDiagnosticReport
    - typings.vscodeLanguageclient.diagnosticMod.vsdiag.WorkspaceUnchangedDocumentDiagnosticReport
  */
  trait WorkspaceDocumentDiagnosticReport extends StObject
  object WorkspaceDocumentDiagnosticReport {
    
    inline def WorkspaceFullDocumentDiagnosticReport(items: js.Array[Diagnostic], kind: full, uri: Uri): typings.vscodeLanguageclient.diagnosticMod.vsdiag.WorkspaceFullDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
      __obj.asInstanceOf[typings.vscodeLanguageclient.diagnosticMod.vsdiag.WorkspaceFullDocumentDiagnosticReport]
    }
    
    inline def WorkspaceUnchangedDocumentDiagnosticReport(kind: unChanged, resultId: String, uri: Uri): typings.vscodeLanguageclient.diagnosticMod.vsdiag.WorkspaceUnchangedDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
      __obj.asInstanceOf[typings.vscodeLanguageclient.diagnosticMod.vsdiag.WorkspaceUnchangedDocumentDiagnosticReport]
    }
  }
  
  trait WorkspaceFullDocumentDiagnosticReport
    extends StObject
       with FullDocumentDiagnosticReport
       with WorkspaceDocumentDiagnosticReport {
    
    var uri: Uri
    
    var version: Double | Null
  }
  object WorkspaceFullDocumentDiagnosticReport {
    
    inline def apply(items: js.Array[Diagnostic], kind: full, uri: Uri): WorkspaceFullDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
      __obj.asInstanceOf[WorkspaceFullDocumentDiagnosticReport]
    }
    
    extension [Self <: WorkspaceFullDocumentDiagnosticReport](x: Self) {
      
      inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
  
  trait WorkspaceUnchangedDocumentDiagnosticReport
    extends StObject
       with UnchangedDocumentDiagnosticReport
       with WorkspaceDocumentDiagnosticReport {
    
    var uri: Uri
    
    var version: Double | Null
  }
  object WorkspaceUnchangedDocumentDiagnosticReport {
    
    inline def apply(kind: unChanged, resultId: String, uri: Uri): WorkspaceUnchangedDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
      __obj.asInstanceOf[WorkspaceUnchangedDocumentDiagnosticReport]
    }
    
    extension [Self <: WorkspaceUnchangedDocumentDiagnosticReport](x: Self) {
      
      inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
}
