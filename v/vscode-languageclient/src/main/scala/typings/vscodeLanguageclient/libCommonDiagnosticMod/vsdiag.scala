package typings.vscodeLanguageclient.libCommonDiagnosticMod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.mod.CancellationToken
import typings.vscode.mod.Diagnostic
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReportKind.full
import typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReportKind.unChanged
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
    /* "full" */ val full: typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReportKind.full & String = js.native
    
    @js.native
    sealed trait unChanged
      extends StObject
         with DocumentDiagnosticReportKind
    /* "unChanged" */ val unChanged: typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReportKind.unChanged & String = js.native
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
    - typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.RelatedFullDocumentDiagnosticReport
    - typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.RelatedUnchangedDocumentDiagnosticReport
  */
  trait DocumentDiagnosticReport extends StObject
  object DocumentDiagnosticReport {
    
    inline def RelatedFullDocumentDiagnosticReport(items: js.Array[Diagnostic], kind: full): typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.RelatedFullDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.RelatedFullDocumentDiagnosticReport]
    }
    
    inline def RelatedUnchangedDocumentDiagnosticReport(kind: unChanged, resultId: String): typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.RelatedUnchangedDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.RelatedUnchangedDocumentDiagnosticReport]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullDocumentDiagnosticReport] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviousResultId] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelatedFullDocumentDiagnosticReport] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelatedUnchangedDocumentDiagnosticReport] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnchangedDocumentDiagnosticReport] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceDiagnosticReport] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceDiagnosticReportPartialResult] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[WorkspaceDocumentDiagnosticReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: WorkspaceDocumentDiagnosticReport*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.WorkspaceFullDocumentDiagnosticReport
    - typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.WorkspaceUnchangedDocumentDiagnosticReport
  */
  trait WorkspaceDocumentDiagnosticReport extends StObject
  object WorkspaceDocumentDiagnosticReport {
    
    inline def WorkspaceFullDocumentDiagnosticReport(items: js.Array[Diagnostic], kind: full, uri: Uri): typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.WorkspaceFullDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
      __obj.asInstanceOf[typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.WorkspaceFullDocumentDiagnosticReport]
    }
    
    inline def WorkspaceUnchangedDocumentDiagnosticReport(kind: unChanged, resultId: String, uri: Uri): typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.WorkspaceUnchangedDocumentDiagnosticReport = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
      __obj.asInstanceOf[typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.WorkspaceUnchangedDocumentDiagnosticReport]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceFullDocumentDiagnosticReport] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceUnchangedDocumentDiagnosticReport] (val x: Self) extends AnyVal {
      
      inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
}
