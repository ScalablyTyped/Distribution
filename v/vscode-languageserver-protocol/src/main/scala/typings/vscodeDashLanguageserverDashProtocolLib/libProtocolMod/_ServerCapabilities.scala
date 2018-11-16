package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait _ServerCapabilities extends js.Object {
  /**
       * The server provides code actions. CodeActionOptions may only be
       * specified if the client states that it supports
       * `codeActionLiteralSupport` in its initial `initialize` request.
       */
  var codeActionProvider: js.UndefOr[scala.Boolean | CodeActionOptions] = js.undefined
  /**
       * The server provides code lens.
       */
  var codeLensProvider: js.UndefOr[CodeLensOptions] = js.undefined
  /**
       * The server provides completion support.
       */
  var completionProvider: js.UndefOr[CompletionOptions] = js.undefined
  /**
       * The server provides goto definition support.
       */
  var definitionProvider: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The server provides document formatting.
       */
  var documentFormattingProvider: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The server provides document highlight support.
       */
  var documentHighlightProvider: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The server provides document link support.
       */
  var documentLinkProvider: js.UndefOr[DocumentLinkOptions] = js.undefined
  /**
       * The server provides document formatting on typing.
       */
  var documentOnTypeFormattingProvider: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_MoreTriggerCharacter] = js.undefined
  /**
       * The server provides document range formatting.
       */
  var documentRangeFormattingProvider: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The server provides document symbol support.
       */
  var documentSymbolProvider: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The server provides execute command support.
       */
  var executeCommandProvider: js.UndefOr[ExecuteCommandOptions] = js.undefined
  /**
       * Experimental server capabilities.
       */
  var experimental: js.UndefOr[js.Any] = js.undefined
  /**
       * The server provides hover support.
       */
  var hoverProvider: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The server provides find references support.
       */
  var referencesProvider: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The server provides rename support. RenameOptions may only be
       * specified if the client states that it supports
       * `prepareSupport` in its initial `initialize` request.
       */
  var renameProvider: js.UndefOr[scala.Boolean | RenameOptions] = js.undefined
  /**
       * The server provides signature help support.
       */
  var signatureHelpProvider: js.UndefOr[SignatureHelpOptions] = js.undefined
  /**
       * Defines how text documents are synced. Is either a detailed structure defining each notification or
       * for backwards compatibility the TextDocumentSyncKind number.
       */
  var textDocumentSync: js.UndefOr[TextDocumentSyncOptions | TextDocumentSyncKind] = js.undefined
  /**
       * The server provides workspace symbol support.
       */
  var workspaceSymbolProvider: js.UndefOr[scala.Boolean] = js.undefined
}

