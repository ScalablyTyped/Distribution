package typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typings.std.Set
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.document
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.executionSummary
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.kind
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.metadata
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.LSPObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCell extends StObject {
  
  /**
    * The URI of the cell's text document
    * content.
    */
  var document: DocumentUri
  
  /**
    * Additional execution summary information
    * if supported by the client.
    */
  var executionSummary: js.UndefOr[ExecutionSummary] = js.undefined
  
  /**
    * The cell's kind
    */
  var kind: NotebookCellKind
  
  /**
    * Additional metadata stored with the cell.
    *
    * Note: should always be an object literal (e.g. LSPObject)
    */
  var metadata: js.UndefOr[LSPObject] = js.undefined
}
object NotebookCell {
  
  inline def apply(document: DocumentUri, kind: NotebookCellKind): NotebookCell = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCell]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.notebook", "NotebookCell")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(kind: NotebookCellKind, document: DocumentUri): NotebookCell = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(kind.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[NotebookCell]
  
  inline def diff(one: NotebookCell, two: NotebookCell): Set[
    /* keyof vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ kind | document | metadata | executionSummary
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Set[
    /* keyof vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ kind | document | metadata | executionSummary
  ]]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ Boolean]
  
  extension [Self <: NotebookCell](x: Self) {
    
    inline def setDocument(value: DocumentUri): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummary(value: ExecutionSummary): Self = StObject.set(x, "executionSummary", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummaryUndefined: Self = StObject.set(x, "executionSummary", js.undefined)
    
    inline def setKind(value: NotebookCellKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: LSPObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
