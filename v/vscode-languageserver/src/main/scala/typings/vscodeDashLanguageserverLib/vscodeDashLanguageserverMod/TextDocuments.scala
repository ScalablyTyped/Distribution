package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "TextDocuments")
@js.native
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
  val syncKind: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentSyncKind = js.native
  /**
       * Returns all text documents managed by this instance.
       *
       * @return all text documents.
       */
  def all(): js.Array[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument
  ] = js.native
  /**
       * Returns the document for the given URI. Returns undefined if
       * the document is not mananged by this instance.
       *
       * @param uri The text document's URI to retrieve.
       * @return the text document or `undefined`.
       */
  def get(uri: java.lang.String): js.UndefOr[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument
  ] = js.native
  /**
       * Returns the URIs of all text documents managed by this instance.
       *
       * @return the URI's of all text documents.
       */
  def keys(): js.Array[java.lang.String] = js.native
  /**
       * Listens for `low level` notification on the given connection to
       * update the text documents managed by this instance.
       *
       * @param connection The connection to listen on.
       */
  def listen(connection: IConnection): scala.Unit = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been opened or the content changes.
       */
  def onDidChangeContent(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been opened or the content changes.
       */
  def onDidChangeContent(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been opened or the content changes.
       */
  def onDidChangeContent(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been closed.
       */
  def onDidClose(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been closed.
       */
  def onDidClose(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been closed.
       */
  def onDidClose(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been opened.
       */
  def onDidOpen(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been opened.
       */
  def onDidOpen(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been opened.
       */
  def onDidOpen(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been saved.
       */
  def onDidSave(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been saved.
       */
  def onDidSave(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * has been saved.
       */
  def onDidSave(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentChangeEvent, 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * will be saved.
       */
  def onWillSave(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent, 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * will be saved.
       */
  def onWillSave(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent, 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * An event that fires when a text document managed by this manager
       * will be saved.
       */
  def onWillSave(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent, 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
       * Sets a handler that will be called if a participant wants to provide
       * edits during a text document save.
       */
  def onWillSaveWaitUntil(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentWillSaveEvent, 
      js.Array[
        vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

