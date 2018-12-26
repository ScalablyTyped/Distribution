package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicFeature[T] extends js.Object {
  /**
       * Called to fill the initialize params.
       *
       * @params the initialize params.
       */
  var fillInitializeParams: js.UndefOr[
    js.Function1[
      /* params */ vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeParams, 
      scala.Unit
    ]
  ] = js.native
  /**
       * The message for which this features support dynamic activation / registration.
       */
  var messages: vscodeDashJsonrpcLib.libMessagesMod.MessageType | js.Array[vscodeDashJsonrpcLib.libMessagesMod.MessageType] = js.native
  /**
       * Called when the client is stopped to dispose this feature. Usually a feature
       * unregisters listeners registerd hooked up with the VS Code extension host.
       */
  def dispose(): scala.Unit = js.native
  /**
       * Called to fill in the client capabilities this feature implements.
       *
       * @param capabilities The client capabilities to fill.
       */
  def fillClientCapabilities(capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities): scala.Unit = js.native
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
  def initialize(capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities): scala.Unit = js.native
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
  def initialize(
    capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities,
    documentSelector: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentSelector
  ): scala.Unit = js.native
  /**
       * Is called when the server send a register request for the given message.
       *
       * @param message the message to register for.
       * @param data additional registration data as defined in the protocol.
       */
  def register(message: vscodeDashJsonrpcLib.libMessagesMod.MessageType, data: RegistrationData[T]): scala.Unit = js.native
  /**
       * Is called when the server wants to unregister a feature.
       *
       * @param id the id used when registering the feature.
       */
  def unregister(id: java.lang.String): scala.Unit = js.native
}

