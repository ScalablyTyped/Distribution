package typings.vscodeLanguageclient.anon

import typings.vscode.mod.FileDeleteEvent
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureState
import typings.vscodeLanguageclient.libCommonFeaturesMod.RegistrationData
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vscode-languageclient.vscode-languageclient/lib/common/features.DynamicFeature<vscode-languageserver-protocol.vscode-languageserver-protocol.FileOperationRegistrationOptions> & {send (event : vscode.vscode.FileDeleteEvent): std.Promise<void>} */
@js.native
trait DynamicFeatureFileOperatiFillClientCapabilities extends StObject {
  
  /**
    * Called when the client is stopped to dispose this feature. Usually a feature
    * un-registers listeners registered hooked up with the VS Code extension host.
    */
  def dispose(): Unit = js.native
  
  /**
    * Called to fill in the client capabilities this feature implements.
    *
    * @param capabilities The client capabilities to fill.
    */
  def fillClientCapabilities(capabilities: ClientCapabilities): Unit = js.native
  
  /**
    * Called to fill the initialize params.
    *
    * @params the initialize params.
    */
  var fillInitializeParams: js.UndefOr[js.Function1[/* params */ InitializeParams, Unit]] = js.native
  
  /**
    * Returns the state the feature is in.
    */
  def getState(): FeatureState = js.native
  
  /**
    * Initialize the feature. This method is called on a feature instance
    * when the client has successfully received the initialize request from
    * the server and before the client sends the initialized notification
    * to the server.
    *
    * @param capabilities the server capabilities.
    * @param documentSelector the document selector pass to the client's constructor.
    *  May be `undefined` if the client was created without a selector.
    */
  def initialize(capabilities: ServerCapabilities[LSPAny]): Unit = js.native
  def initialize(
    capabilities: ServerCapabilities[LSPAny],
    documentSelector: typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
  ): Unit = js.native
  
  /**
    * A preflight where the server capabilities are shown to all features
    * before a feature is actually initialized. This allows feature to
    * capture some state if they are a pre-requisite for other features.
    *
    * @param capabilities the server capabilities
    * @param documentSelector the document selector pass to the client's constructor.
    *  May be `undefined` if the client was created without a selector.
    */
  var preInitialize: js.UndefOr[
    js.Function2[
      /* capabilities */ ServerCapabilities[LSPAny], 
      /* documentSelector */ js.UndefOr[typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector], 
      Unit
    ]
  ] = js.native
  
  /**
    * Is called when the server send a register request for the given message.
    *
    * @param data additional registration data as defined in the protocol.
    */
  def register(data: RegistrationData[FileOperationRegistrationOptions]): Unit = js.native
  
  /**
    * The signature (e.g. method) for which this features support dynamic activation / registration.
    */
  var registrationType: RegistrationType[FileOperationRegistrationOptions] = js.native
  
  def send(event: FileDeleteEvent): js.Promise[Unit] = js.native
  
  /**
    * Is called when the server wants to unregister a feature.
    *
    * @param id the id used when registering the feature.
    */
  def unregister(id: String): Unit = js.native
}
