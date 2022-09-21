package typings.vscodeLanguageclient

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.mod.NotebookCell
import typings.vscode.mod.NotebookDocument
import typings.vscode.mod.TextDocument
import typings.vscodeLanguageclient.anon.Data
import typings.vscodeLanguageclient.anon.DidChange
import typings.vscodeLanguageclient.featuresMod.DynamicFeature
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.vscodeLanguageclientBooleans.`true`
import typings.vscodeLanguageserverProtocol.protocolMod.NotebookDocumentFilter
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import typings.vscodeLanguageserverProtocol.protocolNotebookMod.NotebookDocumentSyncRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notebookMod {
  
  @JSImport("vscode-languageclient/lib/common/notebook", "NotebookDocumentSyncFeature")
  @js.native
  open class NotebookDocumentSyncFeature protected ()
    extends StObject
       with DynamicFeature[NotebookDocumentSyncRegistrationOptions]
       with NotebookDocumentProviderShape {
    def this(client: FeatureClient[NotebookDocumentMiddleware, NotebookDocumentOptions]) = this()
    
    /* private */ val client: Any = js.native
    
    /* private */ var dedicatedChannel: Any = js.native
    
    /* private */ var findNotebookDocumentAndCell: Any = js.native
    
    /* CompleteClass */
    override def getProvider(notebookCell: NotebookCell): js.UndefOr[NotebookDocumentSyncFeatureShape] = js.native
    
    def handles(textDocument: TextDocument): Boolean = js.native
    
    @JSName("preInitialize")
    def preInitialize_MNotebookDocumentSyncFeature(capabilities: ServerCapabilities[Any]): Unit = js.native
    
    /* private */ val registrations: Any = js.native
  }
  /* static members */
  object NotebookDocumentSyncFeature {
    
    @JSImport("vscode-languageclient/lib/common/notebook", "NotebookDocumentSyncFeature.CellScheme")
    @js.native
    val CellScheme: String = js.native
  }
  
  trait NotebookCellTextDocumentFilter
    extends StObject
       with typings.vscodeLanguageserverProtocol.protocolMod.NotebookCellTextDocumentFilter {
    
    var sync: `true`
  }
  object NotebookCellTextDocumentFilter {
    
    inline def apply(notebook: String | NotebookDocumentFilter): NotebookCellTextDocumentFilter = {
      val __obj = js.Dynamic.literal(notebook = notebook.asInstanceOf[js.Any], sync = true)
      __obj.asInstanceOf[NotebookCellTextDocumentFilter]
    }
    
    extension [Self <: NotebookCellTextDocumentFilter](x: Self) {
      
      inline def setSync(value: `true`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotebookDocumentMiddleware extends StObject {
    
    var notebooks: js.UndefOr[DidChange] = js.undefined
  }
  object NotebookDocumentMiddleware {
    
    inline def apply(): NotebookDocumentMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotebookDocumentMiddleware]
    }
    
    extension [Self <: NotebookDocumentMiddleware](x: Self) {
      
      inline def setNotebooks(value: DidChange): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
      
      inline def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    }
  }
  
  trait NotebookDocumentOptions extends StObject {
    
    var notebookDocumentOptions: js.UndefOr[NotebookDocumentOptions_] = js.undefined
  }
  object NotebookDocumentOptions {
    
    inline def apply(): NotebookDocumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotebookDocumentOptions]
    }
    
    extension [Self <: NotebookDocumentOptions](x: Self) {
      
      inline def setNotebookDocumentOptions(value: NotebookDocumentOptions_): Self = StObject.set(x, "notebookDocumentOptions", value.asInstanceOf[js.Any])
      
      inline def setNotebookDocumentOptionsUndefined: Self = StObject.set(x, "notebookDocumentOptions", js.undefined)
    }
  }
  
  trait NotebookDocumentOptions_ extends StObject {
    
    var filterCells: js.UndefOr[
        js.Function2[
          /* notebookDocument */ NotebookDocument, 
          /* cells */ js.Array[NotebookCell], 
          js.Array[NotebookCell]
        ]
      ] = js.undefined
  }
  object NotebookDocumentOptions_ {
    
    inline def apply(): NotebookDocumentOptions_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotebookDocumentOptions_]
    }
    
    extension [Self <: NotebookDocumentOptions_](x: Self) {
      
      inline def setFilterCells(
        value: (/* notebookDocument */ NotebookDocument, /* cells */ js.Array[NotebookCell]) => js.Array[NotebookCell]
      ): Self = StObject.set(x, "filterCells", js.Any.fromFunction2(value))
      
      inline def setFilterCellsUndefined: Self = StObject.set(x, "filterCells", js.undefined)
    }
  }
  
  trait NotebookDocumentProviderShape extends StObject {
    
    def getProvider(notebookCell: NotebookCell): js.UndefOr[NotebookDocumentSyncFeatureShape]
  }
  object NotebookDocumentProviderShape {
    
    inline def apply(getProvider: NotebookCell => js.UndefOr[NotebookDocumentSyncFeatureShape]): NotebookDocumentProviderShape = {
      val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
      __obj.asInstanceOf[NotebookDocumentProviderShape]
    }
    
    extension [Self <: NotebookDocumentProviderShape](x: Self) {
      
      inline def setGetProvider(value: NotebookCell => js.UndefOr[NotebookDocumentSyncFeatureShape]): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
    }
  }
  
  trait NotebookDocumentSyncFeatureShape extends StObject {
    
    def sendDidChangeNotebookDocument(event: VNotebookDocumentChangeEvent): js.Promise[Unit]
    
    def sendDidCloseNotebookDocument(notebookDocument: NotebookDocument): js.Promise[Unit]
    
    def sendDidOpenNotebookDocument(notebookDocument: NotebookDocument): js.Promise[Unit]
    
    def sendDidSaveNotebookDocument(notebookDocument: NotebookDocument): js.Promise[Unit]
  }
  object NotebookDocumentSyncFeatureShape {
    
    inline def apply(
      sendDidChangeNotebookDocument: VNotebookDocumentChangeEvent => js.Promise[Unit],
      sendDidCloseNotebookDocument: NotebookDocument => js.Promise[Unit],
      sendDidOpenNotebookDocument: NotebookDocument => js.Promise[Unit],
      sendDidSaveNotebookDocument: NotebookDocument => js.Promise[Unit]
    ): NotebookDocumentSyncFeatureShape = {
      val __obj = js.Dynamic.literal(sendDidChangeNotebookDocument = js.Any.fromFunction1(sendDidChangeNotebookDocument), sendDidCloseNotebookDocument = js.Any.fromFunction1(sendDidCloseNotebookDocument), sendDidOpenNotebookDocument = js.Any.fromFunction1(sendDidOpenNotebookDocument), sendDidSaveNotebookDocument = js.Any.fromFunction1(sendDidSaveNotebookDocument))
      __obj.asInstanceOf[NotebookDocumentSyncFeatureShape]
    }
    
    extension [Self <: NotebookDocumentSyncFeatureShape](x: Self) {
      
      inline def setSendDidChangeNotebookDocument(value: VNotebookDocumentChangeEvent => js.Promise[Unit]): Self = StObject.set(x, "sendDidChangeNotebookDocument", js.Any.fromFunction1(value))
      
      inline def setSendDidCloseNotebookDocument(value: NotebookDocument => js.Promise[Unit]): Self = StObject.set(x, "sendDidCloseNotebookDocument", js.Any.fromFunction1(value))
      
      inline def setSendDidOpenNotebookDocument(value: NotebookDocument => js.Promise[Unit]): Self = StObject.set(x, "sendDidOpenNotebookDocument", js.Any.fromFunction1(value))
      
      inline def setSendDidSaveNotebookDocument(value: NotebookDocument => js.Promise[Unit]): Self = StObject.set(x, "sendDidSaveNotebookDocument", js.Any.fromFunction1(value))
    }
  }
  
  trait VNotebookDocumentChangeEvent extends StObject {
    
    /**
      * Changes to cells.
      */
    var cells: js.UndefOr[Data] = js.undefined
    
    /**
      * The changed meta data if any.
      */
    var metadata: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * The notebook document
      */
    var notebook: NotebookDocument
  }
  object VNotebookDocumentChangeEvent {
    
    inline def apply(notebook: NotebookDocument): VNotebookDocumentChangeEvent = {
      val __obj = js.Dynamic.literal(notebook = notebook.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNotebookDocumentChangeEvent]
    }
    
    extension [Self <: VNotebookDocumentChangeEvent](x: Self) {
      
      inline def setCells(value: Data): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNotebook(value: NotebookDocument): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    }
  }
}
