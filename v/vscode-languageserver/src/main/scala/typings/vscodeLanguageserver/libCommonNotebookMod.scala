package typings.vscodeLanguageserver

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeJsonrpc.libCommonEventsMod.Event
import typings.vscodeLanguageserver.anon.Added
import typings.vscodeLanguageserver.anon.New
import typings.vscodeLanguageserver.anon.OnDidChangeNotebookDocument
import typings.vscodeLanguageserver.anon.Uri
import typings.vscodeLanguageserver.libCommonServerMod.Connection
import typings.vscodeLanguageserver.libCommonServerMod.Feature
import typings.vscodeLanguageserver.libCommonServerMod._Notebooks
import typings.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocuments
import typings.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocumentsConfiguration
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookDocument
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonNotebookMod {
  
  @JSImport("vscode-languageserver/lib/common/notebook", "NotebookDocuments")
  @js.native
  open class NotebookDocuments[T /* <: Uri */] protected () extends StObject {
    def this(configurationOrTextDocuments: TextDocuments[T]) = this()
    def this(configurationOrTextDocuments: TextDocumentsConfiguration[T]) = this()
    
    /* private */ var _cellTextDocuments: Any = js.native
    
    /* private */ val _onDidChange: Any = js.native
    
    /* private */ val _onDidClose: Any = js.native
    
    /* private */ val _onDidOpen: Any = js.native
    
    /* private */ val _onDidSave: Any = js.native
    
    def cellTextDocuments: TextDocuments[T] = js.native
    
    def findNotebookDocumentForCell(cell: NotebookCell): js.UndefOr[NotebookDocument] = js.native
    def findNotebookDocumentForCell(cell: DocumentUri): js.UndefOr[NotebookDocument] = js.native
    
    def getCellTextDocument(cell: NotebookCell): js.UndefOr[T] = js.native
    
    def getNotebookCell(uri: DocumentUri): js.UndefOr[NotebookCell] = js.native
    
    def getNotebookDocument(uri: URI): js.UndefOr[NotebookDocument] = js.native
    
    /**
      * Listens for `low level` notification on the given connection to
      * update the notebook documents managed by this instance.
      *
      * Please note that the connection only provides handlers not an event model. Therefore
      * listening on a connection will overwrite the following handlers on a connection:
      * `onDidOpenNotebookDocument`, `onDidChangeNotebookDocument`, `onDidSaveNotebookDocument`,
      *  and `onDidCloseNotebookDocument`.
      *
      * @param connection The connection to listen on.
      */
    def listen(connection: Connection): Disposable = js.native
    
    /* private */ val notebookCellMap: Any = js.native
    
    /* private */ val notebookDocuments: Any = js.native
    
    def onDidChange: Event[NotebookDocumentChangeEvent] = js.native
    
    def onDidClose: Event[NotebookDocument] = js.native
    
    def onDidOpen: Event[NotebookDocument] = js.native
    
    def onDidSave: Event[NotebookDocument] = js.native
    
    /* private */ var updateCellMap: Any = js.native
  }
  
  @JSImport("vscode-languageserver/lib/common/notebook", "NotebookSyncFeature")
  @js.native
  val NotebookSyncFeature: Feature[_Notebooks, NotebookSyncFeatureShape] = js.native
  
  trait NotebookDocumentChangeEvent extends StObject {
    
    /**
      * The cell changes if any.
      */
    var cells: js.UndefOr[Added] = js.undefined
    
    /**
      * The meta data change if any.
      *
      * Note: old and new should always be an object literal (e.g. LSPObject)
      */
    var metadata: js.UndefOr[New] = js.undefined
    
    /**
      * The notebook document that changed.
      */
    var notebookDocument: NotebookDocument
  }
  object NotebookDocumentChangeEvent {
    
    inline def apply(notebookDocument: NotebookDocument): NotebookDocumentChangeEvent = {
      val __obj = js.Dynamic.literal(notebookDocument = notebookDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotebookDocumentChangeEvent]
    }
    
    extension [Self <: NotebookDocumentChangeEvent](x: Self) {
      
      inline def setCells(value: Added): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setMetadata(value: New): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNotebookDocument(value: NotebookDocument): Self = StObject.set(x, "notebookDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotebookSyncFeatureShape extends StObject {
    
    var synchronization: OnDidChangeNotebookDocument
  }
  object NotebookSyncFeatureShape {
    
    inline def apply(synchronization: OnDidChangeNotebookDocument): NotebookSyncFeatureShape = {
      val __obj = js.Dynamic.literal(synchronization = synchronization.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotebookSyncFeatureShape]
    }
    
    extension [Self <: NotebookSyncFeatureShape](x: Self) {
      
      inline def setSynchronization(value: OnDidChangeNotebookDocument): Self = StObject.set(x, "synchronization", value.asInstanceOf[js.Any])
    }
  }
}
