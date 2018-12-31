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
  var codeLens: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `textDocument/completion`
    */
  var completion: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationContextSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/definition`
    */
  var definition: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentHighlight`
    */
  var documentHighlight: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentLink`
    */
  var documentLink: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentSymbol`
    */
  var documentSymbol: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationHierarchicalDocumentSymbolSupport
  ] = js.undefined
  /**
    * Capabilities specific to the `textDocument/formatting`
    */
  var formatting: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `textDocument/hover`
    */
  var hover: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationContentFormat] = js.undefined
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting`
    */
  var onTypeFormatting: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to `textDocument/publishDiagnostics`.
    */
  var publishDiagnostics: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_RelatedInformation] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rangeFormatting`
    */
  var rangeFormatting: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `textDocument/references`
    */
  var references: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rename`
    */
  var rename: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationPrepareSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/signatureHelp`
    */
  var signatureHelp: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_SignatureInformation] = js.undefined
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_WillSaveWaitUntil] = js.undefined
}

