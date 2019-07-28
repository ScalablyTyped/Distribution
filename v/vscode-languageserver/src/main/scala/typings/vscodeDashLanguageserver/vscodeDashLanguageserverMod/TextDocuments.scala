package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentSyncKind
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocument
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "TextDocuments")
@js.native
/**
  * Create a new text document manager.
  */
class TextDocuments () extends js.Object {
  var _documents: js.Any = js.native
  var _onDidChangeContent: js.Any = js.native
  var _onDidClose: js.Any = js.native
  var _onDidOpen: js.Any = js.native
  var _onDidSave: js.Any = js.native
  var _onWillSave: js.Any = js.native
  var _willSaveWaitUntil: js.Any = js.native
  /**
    * Returns the [TextDocumentSyncKind](#TextDocumentSyncKind) used by
    * this text document manager.
    */
  val syncKind: TextDocumentSyncKind = js.native
  /**
    * Returns all text documents managed by this instance.
    *
    * @return all text documents.
    */
  def all(): js.Array[TextDocument] = js.native
  /**
    * Returns the document for the given URI. Returns undefined if
    * the document is not mananged by this instance.
    *
    * @param uri The text document's URI to retrieve.
    * @return the text document or `undefined`.
    */
  def get(uri: String): js.UndefOr[TextDocument] = js.native
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
  def onDidChangeContent(listener: js.Function1[/* e */ TextDocumentChangeEvent, _]): Disposable = js.native
  def onDidChangeContent(listener: js.Function1[/* e */ TextDocumentChangeEvent, _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeContent(
    listener: js.Function1[/* e */ TextDocumentChangeEvent, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * An event that fires when a text document managed by this manager
    * has been closed.
    */
  def onDidClose(listener: js.Function1[/* e */ TextDocumentChangeEvent, _]): Disposable = js.native
  def onDidClose(listener: js.Function1[/* e */ TextDocumentChangeEvent, _], thisArgs: js.Any): Disposable = js.native
  def onDidClose(
    listener: js.Function1[/* e */ TextDocumentChangeEvent, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * An event that fires when a text document managed by this manager
    * has been opened.
    */
  def onDidOpen(listener: js.Function1[/* e */ TextDocumentChangeEvent, _]): Disposable = js.native
  def onDidOpen(listener: js.Function1[/* e */ TextDocumentChangeEvent, _], thisArgs: js.Any): Disposable = js.native
  def onDidOpen(
    listener: js.Function1[/* e */ TextDocumentChangeEvent, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * An event that fires when a text document managed by this manager
    * has been saved.
    */
  def onDidSave(listener: js.Function1[/* e */ TextDocumentChangeEvent, _]): Disposable = js.native
  def onDidSave(listener: js.Function1[/* e */ TextDocumentChangeEvent, _], thisArgs: js.Any): Disposable = js.native
  def onDidSave(
    listener: js.Function1[/* e */ TextDocumentChangeEvent, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * An event that fires when a text document managed by this manager
    * will be saved.
    */
  def onWillSave(listener: js.Function1[/* e */ TextDocumentWillSaveEvent, _]): Disposable = js.native
  def onWillSave(listener: js.Function1[/* e */ TextDocumentWillSaveEvent, _], thisArgs: js.Any): Disposable = js.native
  def onWillSave(
    listener: js.Function1[/* e */ TextDocumentWillSaveEvent, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * Sets a handler that will be called if a participant wants to provide
    * edits during a text document save.
    */
  def onWillSaveWaitUntil(handler: RequestHandler[TextDocumentWillSaveEvent, js.Array[TextEdit], Unit]): Unit = js.native
}

