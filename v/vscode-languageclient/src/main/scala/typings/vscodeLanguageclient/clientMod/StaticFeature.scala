package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticFeature extends StObject {
  
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
    * when the client has successfully received the initialize request from
    * the server and before the client sends the initialized notification
    * to the server.
    *
    * @param capabilities the server capabilities
    * @param documentSelector the document selector pass to the client's constructor.
    *  May be `undefined` if the client was created without a selector.
    */
  def initialize(capabilities: ServerCapabilities[js.Any]): Unit = js.native
  def initialize(
    capabilities: ServerCapabilities[js.Any],
    documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
  ): Unit = js.native
}
