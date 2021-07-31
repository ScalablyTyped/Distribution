package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicFeature[RO] extends StObject {
  
  /**
    * Called when the client is stopped to dispose this feature. Usually a feature
    * unregisters listeners registerd hooked up with the VS Code extension host.
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
    * Initialize the feature. This method is called on a feature instance
    * when the client has successfully received the initalize request from
    * the server and before the client sends the initialized notification
    * to the server.
    *
    * @param capabilities the server capabilities.
    * @param documentSelector the document selector pass to the client's constuctor.
    *  May be `undefined` if the client was created without a selector.
    */
  def initialize(capabilities: ServerCapabilities[js.Any]): Unit = js.native
  def initialize(
    capabilities: ServerCapabilities[js.Any],
    documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
  ): Unit = js.native
  
  /**
    * The message for which this features support dynamic activation / registration.
    */
  var messages: typings.vscodeJsonrpc.messagesMod.MessageType | js.Array[typings.vscodeJsonrpc.messagesMod.MessageType] = js.native
  
  /**
    * Is called when the server send a register request for the given message.
    *
    * @param message the message to register for.
    * @param data additional registration data as defined in the protocol.
    */
  def register(message: typings.vscodeJsonrpc.messagesMod.MessageType, data: RegistrationData[RO]): Unit = js.native
  
  /**
    * Is called when the server wants to unregister a feature.
    *
    * @param id the id used when registering the feature.
    */
  def unregister(id: String): Unit = js.native
}
