package typings.vscodeLanguageserver

import typings.vscodeJsonrpc.connectionMod.NotificationHandler
import typings.vscodeJsonrpc.connectionMod.RequestHandler
import typings.vscodeJsonrpc.disposableMod.Disposable
import typings.vscodeJsonrpc.eventsMod.Event
import typings.vscodeLanguageserver.anon.Uri
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSyncKind
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.TextEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textDocumentsMod {
  
  @JSImport("vscode-languageserver/lib/common/textDocuments", "TextDocuments")
  @js.native
  open class TextDocuments[T /* <: Uri */] protected () extends StObject {
    /**
      * Create a new text document manager.
      */
    def this(configuration: TextDocumentsConfiguration[T]) = this()
    
    /* private */ val _configuration: Any = js.native
    
    /* private */ val _onDidChangeContent: Any = js.native
    
    /* private */ val _onDidClose: Any = js.native
    
    /* private */ val _onDidOpen: Any = js.native
    
    /* private */ val _onDidSave: Any = js.native
    
    /* private */ val _onWillSave: Any = js.native
    
    /* private */ val _syncedDocuments: Any = js.native
    
    /* private */ var _willSaveWaitUntil: Any = js.native
    
    /**
      * Returns all text documents managed by this instance.
      *
      * @return all text documents.
      */
    def all(): js.Array[T] = js.native
    
    /**
      * Returns the document for the given URI. Returns undefined if
      * the document is not managed by this instance.
      *
      * @param uri The text document's URI to retrieve.
      * @return the text document or `undefined`.
      */
    def get(uri: String): js.UndefOr[T] = js.native
    
    /**
      * Returns the URIs of all text documents managed by this instance.
      *
      * @return the URI's of all text documents.
      */
    def keys(): js.Array[String] = js.native
    
    /**
      * Listens for `low level` notification on the given connection to
      * update the text documents managed by this instance.
      *
      * Please note that the connection only provides handlers not an event model. Therefore
      * listening on a connection will overwrite the following handlers on a connection:
      * `onDidOpenTextDocument`, `onDidChangeTextDocument`, `onDidCloseTextDocument`,
      * `onWillSaveTextDocument`, `onWillSaveTextDocumentWaitUntil` and `onDidSaveTextDocument`.
      *
      * Use the corresponding events on the TextDocuments instance instead.
      *
      * @param connection The connection to listen on.
      */
    def listen(connection: TextDocumentConnection): Disposable = js.native
    
    /**
      * An event that fires when a text document managed by this manager
      * has been opened or the content changes.
      */
    def onDidChangeContent: Event[TextDocumentChangeEvent[T]] = js.native
    
    /**
      * An event that fires when a text document managed by this manager
      * has been closed.
      */
    def onDidClose: Event[TextDocumentChangeEvent[T]] = js.native
    
    /**
      * An event that fires when a text document managed by this manager
      * has been opened.
      */
    def onDidOpen: Event[TextDocumentChangeEvent[T]] = js.native
    
    /**
      * An event that fires when a text document managed by this manager
      * has been saved.
      */
    def onDidSave: Event[TextDocumentChangeEvent[T]] = js.native
    
    /**
      * An event that fires when a text document managed by this manager
      * will be saved.
      */
    def onWillSave: Event[TextDocumentWillSaveEvent[T]] = js.native
    
    /**
      * Sets a handler that will be called if a participant wants to provide
      * edits during a text document save.
      */
    def onWillSaveWaitUntil(handler: RequestHandler[TextDocumentWillSaveEvent[T], js.Array[TextEdit], Unit]): Unit = js.native
  }
  
  trait ConnectionState extends StObject {
    
    var __textDocumentSync: js.UndefOr[TextDocumentSyncKind] = js.undefined
  }
  object ConnectionState {
    
    inline def apply(): ConnectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionState]
    }
    
    extension [Self <: ConnectionState](x: Self) {
      
      inline def set__textDocumentSync(value: TextDocumentSyncKind): Self = StObject.set(x, "__textDocumentSync", value.asInstanceOf[js.Any])
      
      inline def set__textDocumentSyncUndefined: Self = StObject.set(x, "__textDocumentSync", js.undefined)
    }
  }
  
  trait TextDocumentChangeEvent[T] extends StObject {
    
    /**
      * The document that has changed.
      */
    var document: T
  }
  object TextDocumentChangeEvent {
    
    inline def apply[T](document: T): TextDocumentChangeEvent[T] = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDocumentChangeEvent[T]]
    }
    
    extension [Self <: TextDocumentChangeEvent[?], T](x: Self & TextDocumentChangeEvent[T]) {
      
      inline def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextDocumentConnection extends StObject {
    
    def onDidChangeTextDocument(handler: NotificationHandler[DidChangeTextDocumentParams]): Disposable
    
    def onDidCloseTextDocument(handler: NotificationHandler[DidCloseTextDocumentParams]): Disposable
    
    def onDidOpenTextDocument(handler: NotificationHandler[DidOpenTextDocumentParams]): Disposable
    
    def onDidSaveTextDocument(handler: NotificationHandler[DidSaveTextDocumentParams]): Disposable
    
    def onWillSaveTextDocument(handler: NotificationHandler[WillSaveTextDocumentParams]): Disposable
    
    def onWillSaveTextDocumentWaitUntil(handler: RequestHandler[WillSaveTextDocumentParams, js.UndefOr[js.Array[TextEdit] | Null], Unit]): Disposable
  }
  object TextDocumentConnection {
    
    inline def apply(
      onDidChangeTextDocument: NotificationHandler[DidChangeTextDocumentParams] => Disposable,
      onDidCloseTextDocument: NotificationHandler[DidCloseTextDocumentParams] => Disposable,
      onDidOpenTextDocument: NotificationHandler[DidOpenTextDocumentParams] => Disposable,
      onDidSaveTextDocument: NotificationHandler[DidSaveTextDocumentParams] => Disposable,
      onWillSaveTextDocument: NotificationHandler[WillSaveTextDocumentParams] => Disposable,
      onWillSaveTextDocumentWaitUntil: RequestHandler[WillSaveTextDocumentParams, js.UndefOr[js.Array[TextEdit] | Null], Unit] => Disposable
    ): TextDocumentConnection = {
      val __obj = js.Dynamic.literal(onDidChangeTextDocument = js.Any.fromFunction1(onDidChangeTextDocument), onDidCloseTextDocument = js.Any.fromFunction1(onDidCloseTextDocument), onDidOpenTextDocument = js.Any.fromFunction1(onDidOpenTextDocument), onDidSaveTextDocument = js.Any.fromFunction1(onDidSaveTextDocument), onWillSaveTextDocument = js.Any.fromFunction1(onWillSaveTextDocument), onWillSaveTextDocumentWaitUntil = js.Any.fromFunction1(onWillSaveTextDocumentWaitUntil))
      __obj.asInstanceOf[TextDocumentConnection]
    }
    
    extension [Self <: TextDocumentConnection](x: Self) {
      
      inline def setOnDidChangeTextDocument(value: NotificationHandler[DidChangeTextDocumentParams] => Disposable): Self = StObject.set(x, "onDidChangeTextDocument", js.Any.fromFunction1(value))
      
      inline def setOnDidCloseTextDocument(value: NotificationHandler[DidCloseTextDocumentParams] => Disposable): Self = StObject.set(x, "onDidCloseTextDocument", js.Any.fromFunction1(value))
      
      inline def setOnDidOpenTextDocument(value: NotificationHandler[DidOpenTextDocumentParams] => Disposable): Self = StObject.set(x, "onDidOpenTextDocument", js.Any.fromFunction1(value))
      
      inline def setOnDidSaveTextDocument(value: NotificationHandler[DidSaveTextDocumentParams] => Disposable): Self = StObject.set(x, "onDidSaveTextDocument", js.Any.fromFunction1(value))
      
      inline def setOnWillSaveTextDocument(value: NotificationHandler[WillSaveTextDocumentParams] => Disposable): Self = StObject.set(x, "onWillSaveTextDocument", js.Any.fromFunction1(value))
      
      inline def setOnWillSaveTextDocumentWaitUntil(
        value: RequestHandler[WillSaveTextDocumentParams, js.UndefOr[js.Array[TextEdit] | Null], Unit] => Disposable
      ): Self = StObject.set(x, "onWillSaveTextDocumentWaitUntil", js.Any.fromFunction1(value))
    }
  }
  
  trait TextDocumentWillSaveEvent[T] extends StObject {
    
    /**
      * The document that will be saved
      */
    var document: T
    
    /**
      * The reason why save was triggered.
      */
    var reason: TextDocumentSaveReason
  }
  object TextDocumentWillSaveEvent {
    
    inline def apply[T](document: T, reason: TextDocumentSaveReason): TextDocumentWillSaveEvent[T] = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDocumentWillSaveEvent[T]]
    }
    
    extension [Self <: TextDocumentWillSaveEvent[?], T](x: Self & TextDocumentWillSaveEvent[T]) {
      
      inline def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setReason(value: TextDocumentSaveReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextDocumentsConfiguration[T /* <: Uri */] extends StObject {
    
    def create(uri: DocumentUri, languageId: String, version: Double, content: String): T
    
    def update(document: T, changes: js.Array[TextDocumentContentChangeEvent], version: Double): T
  }
  object TextDocumentsConfiguration {
    
    inline def apply[T /* <: Uri */](
      create: (DocumentUri, String, Double, String) => T,
      update: (T, js.Array[TextDocumentContentChangeEvent], Double) => T
    ): TextDocumentsConfiguration[T] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), update = js.Any.fromFunction3(update))
      __obj.asInstanceOf[TextDocumentsConfiguration[T]]
    }
    
    extension [Self <: TextDocumentsConfiguration[?], T /* <: Uri */](x: Self & TextDocumentsConfiguration[T]) {
      
      inline def setCreate(value: (DocumentUri, String, Double, String) => T): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
      
      inline def setUpdate(value: (T, js.Array[TextDocumentContentChangeEvent], Double) => T): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
}
