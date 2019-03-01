package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentClientCapabilities extends js.Object {
  /**
    * Capabilities specific to the `textDocument/codeAction`
    */
  var codeAction: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_CodeActionLiteralSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/codeLens`
    */
  var codeLens: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/completion`
    */
  var completion: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_CompletionItem] = js.undefined
  /**
    * Capabilities specific to the `textDocument/definition`
    */
  var definition: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationLinkSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentHighlight`
    */
  var documentHighlight: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentLink`
    */
  var documentLink: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentSymbol`
    */
  var documentSymbol: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationHierarchicalDocumentSymbolSupport
  ] = js.undefined
  /**
    * Capabilities specific to the `textDocument/formatting`
    */
  var formatting: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/hover`
    */
  var hover: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_ContentFormat] = js.undefined
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting`
    */
  var onTypeFormatting: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to `textDocument/publishDiagnostics`.
    */
  var publishDiagnostics: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_RelatedInformation] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rangeFormatting`
    */
  var rangeFormatting: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/references`
    */
  var references: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rename`
    */
  var rename: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationPrepareSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/signatureHelp`
    */
  var signatureHelp: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationSignatureInformation
  ] = js.undefined
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DidSave] = js.undefined
}

object TextDocumentClientCapabilities {
  @scala.inline
  def apply(
    codeAction: vscodeDashLanguageserverDashProtocolLib.Anon_CodeActionLiteralSupport = null,
    codeLens: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    completion: vscodeDashLanguageserverDashProtocolLib.Anon_CompletionItem = null,
    definition: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationLinkSupport = null,
    documentHighlight: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    documentLink: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    documentSymbol: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationHierarchicalDocumentSymbolSupport = null,
    formatting: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    hover: vscodeDashLanguageserverDashProtocolLib.Anon_ContentFormat = null,
    onTypeFormatting: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    publishDiagnostics: vscodeDashLanguageserverDashProtocolLib.Anon_RelatedInformation = null,
    rangeFormatting: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    references: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    rename: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationPrepareSupport = null,
    signatureHelp: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationSignatureInformation = null,
    synchronization: vscodeDashLanguageserverDashProtocolLib.Anon_DidSave = null
  ): TextDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (codeAction != null) __obj.updateDynamic("codeAction")(codeAction)
    if (codeLens != null) __obj.updateDynamic("codeLens")(codeLens)
    if (completion != null) __obj.updateDynamic("completion")(completion)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (documentHighlight != null) __obj.updateDynamic("documentHighlight")(documentHighlight)
    if (documentLink != null) __obj.updateDynamic("documentLink")(documentLink)
    if (documentSymbol != null) __obj.updateDynamic("documentSymbol")(documentSymbol)
    if (formatting != null) __obj.updateDynamic("formatting")(formatting)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (onTypeFormatting != null) __obj.updateDynamic("onTypeFormatting")(onTypeFormatting)
    if (publishDiagnostics != null) __obj.updateDynamic("publishDiagnostics")(publishDiagnostics)
    if (rangeFormatting != null) __obj.updateDynamic("rangeFormatting")(rangeFormatting)
    if (references != null) __obj.updateDynamic("references")(references)
    if (rename != null) __obj.updateDynamic("rename")(rename)
    if (signatureHelp != null) __obj.updateDynamic("signatureHelp")(signatureHelp)
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization)
    __obj.asInstanceOf[TextDocumentClientCapabilities]
  }
}

