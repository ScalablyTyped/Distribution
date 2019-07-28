package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_CodeActionLiteralSupport
import typings.vscodeDashLanguageserverDashProtocol.Anon_CompletionItem
import typings.vscodeDashLanguageserverDashProtocol.Anon_ContentFormat
import typings.vscodeDashLanguageserverDashProtocol.Anon_DidSave
import typings.vscodeDashLanguageserverDashProtocol.Anon_DynamicRegistration
import typings.vscodeDashLanguageserverDashProtocol.Anon_DynamicRegistrationHierarchicalDocumentSymbolSupport
import typings.vscodeDashLanguageserverDashProtocol.Anon_DynamicRegistrationLinkSupport
import typings.vscodeDashLanguageserverDashProtocol.Anon_DynamicRegistrationPrepareSupport
import typings.vscodeDashLanguageserverDashProtocol.Anon_DynamicRegistrationSignatureInformation
import typings.vscodeDashLanguageserverDashProtocol.Anon_RelatedInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentClientCapabilities extends js.Object {
  /**
    * Capabilities specific to the `textDocument/codeAction`
    */
  var codeAction: js.UndefOr[Anon_CodeActionLiteralSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/codeLens`
    */
  var codeLens: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/completion`
    */
  var completion: js.UndefOr[Anon_CompletionItem] = js.undefined
  /**
    * Capabilities specific to the `textDocument/definition`
    */
  var definition: js.UndefOr[Anon_DynamicRegistrationLinkSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentHighlight`
    */
  var documentHighlight: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentLink`
    */
  var documentLink: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentSymbol`
    */
  var documentSymbol: js.UndefOr[Anon_DynamicRegistrationHierarchicalDocumentSymbolSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/formatting`
    */
  var formatting: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/hover`
    */
  var hover: js.UndefOr[Anon_ContentFormat] = js.undefined
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting`
    */
  var onTypeFormatting: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to `textDocument/publishDiagnostics`.
    */
  var publishDiagnostics: js.UndefOr[Anon_RelatedInformation] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rangeFormatting`
    */
  var rangeFormatting: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/references`
    */
  var references: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rename`
    */
  var rename: js.UndefOr[Anon_DynamicRegistrationPrepareSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/signatureHelp`
    */
  var signatureHelp: js.UndefOr[Anon_DynamicRegistrationSignatureInformation] = js.undefined
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[Anon_DidSave] = js.undefined
}

object TextDocumentClientCapabilities {
  @scala.inline
  def apply(
    codeAction: Anon_CodeActionLiteralSupport = null,
    codeLens: Anon_DynamicRegistration = null,
    completion: Anon_CompletionItem = null,
    definition: Anon_DynamicRegistrationLinkSupport = null,
    documentHighlight: Anon_DynamicRegistration = null,
    documentLink: Anon_DynamicRegistration = null,
    documentSymbol: Anon_DynamicRegistrationHierarchicalDocumentSymbolSupport = null,
    formatting: Anon_DynamicRegistration = null,
    hover: Anon_ContentFormat = null,
    onTypeFormatting: Anon_DynamicRegistration = null,
    publishDiagnostics: Anon_RelatedInformation = null,
    rangeFormatting: Anon_DynamicRegistration = null,
    references: Anon_DynamicRegistration = null,
    rename: Anon_DynamicRegistrationPrepareSupport = null,
    signatureHelp: Anon_DynamicRegistrationSignatureInformation = null,
    synchronization: Anon_DidSave = null
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

