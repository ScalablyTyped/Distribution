package typings.vscodeLanguageserver.mod

import typings.vscodeJsonrpc.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "TextDocuments")
@js.native
class TextDocuments[T] protected () extends js.Object {
  /**
    * Create a new text document manager.
    */
  def this(configuration: TextDocumentsConfiguration[T]) = this()
  
  var _configuration: js.Any = js.native
  
  var _documents: js.Any = js.native
  
  var _onDidChangeContent: js.Any = js.native
  
  var _onDidClose: js.Any = js.native
  
  var _onDidOpen: js.Any = js.native
  
  var _onDidSave: js.Any = js.native
  
  var _onWillSave: js.Any = js.native
  
  var _willSaveWaitUntil: js.Any = js.native
  
  /**
    * Returns all text documents managed by this instance.
    *
    * @return all text documents.
    */
  def all(): js.Array[T] = js.native
  
  /**
    * Returns the document for the given URI. Returns undefined if
    * the document is not mananged by this instance.
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
    * @param connection The connection to listen on.
    */
  def listen(connection: IConnection): Unit = js.native
  
  /**
    * An event that fires when a text document managed by this manager
    * has been opened or the content changes.
    */
  def onDidChangeContent: typings.vscodeJsonrpc.eventsMod.Event[TextDocumentChangeEvent[T]] = js.native
  
  /**
    * An event that fires when a text document managed by this manager
    * has been closed.
    */
  def onDidClose: typings.vscodeJsonrpc.eventsMod.Event[TextDocumentChangeEvent[T]] = js.native
  
  /**
    * An event that fires when a text document managed by this manager
    * has been opened.
    */
  def onDidOpen: typings.vscodeJsonrpc.eventsMod.Event[TextDocumentChangeEvent[T]] = js.native
  
  /**
    * An event that fires when a text document managed by this manager
    * has been saved.
    */
  def onDidSave: typings.vscodeJsonrpc.eventsMod.Event[TextDocumentChangeEvent[T]] = js.native
  
  /**
    * An event that fires when a text document managed by this manager
    * will be saved.
    */
  def onWillSave: typings.vscodeJsonrpc.eventsMod.Event[TextDocumentWillSaveEvent[T]] = js.native
  
  /**
    * Sets a handler that will be called if a participant wants to provide
    * edits during a text document save.
    */
  def onWillSaveWaitUntil(
    handler: RequestHandler[
      TextDocumentWillSaveEvent[T], 
      js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit], 
      Unit
    ]
  ): Unit = js.native
}
