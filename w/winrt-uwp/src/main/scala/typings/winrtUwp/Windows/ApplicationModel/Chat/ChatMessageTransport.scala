package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the identity of a transport for sending and receiving messages. Physically, a chat message transport is a SIM slot on the phone. */
@js.native
trait ChatMessageTransport extends StObject {
  
  /** Gets the configuration of the message transport. */
  var configuration: ChatMessageTransportConfiguration = js.native
  
  /** Gets a Boolean value that indicates whether the messaging transport is active. */
  var isActive: Boolean = js.native
  
  /** Gets a Boolean value that indicates whether the current application is set as the messaging notification provider. */
  var isAppSetAsNotificationProvider: Boolean = js.native
  
  /**
    * Sets the current application to handle messaging notifications.
    * @return An asynchronous action.
    */
  def requestSetAsNotificationProviderAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets a descriptive name identifying the messaging transport. */
  var transportFriendlyName: String = js.native
  
  /** Gets the messaging transport’s identifier. */
  var transportId: String = js.native
  
  /** Gets the type of the message transport. */
  var transportKind: ChatMessageTransportKind = js.native
}
object ChatMessageTransport {
  
  @scala.inline
  def apply(
    configuration: ChatMessageTransportConfiguration,
    isActive: Boolean,
    isAppSetAsNotificationProvider: Boolean,
    requestSetAsNotificationProviderAsync: () => IPromiseWithIAsyncAction,
    transportFriendlyName: String,
    transportId: String,
    transportKind: ChatMessageTransportKind
  ): ChatMessageTransport = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isAppSetAsNotificationProvider = isAppSetAsNotificationProvider.asInstanceOf[js.Any], requestSetAsNotificationProviderAsync = js.Any.fromFunction0(requestSetAsNotificationProviderAsync), transportFriendlyName = transportFriendlyName.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any], transportKind = transportKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageTransport]
  }
  
  @scala.inline
  implicit class ChatMessageTransportMutableBuilder[Self <: ChatMessageTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: ChatMessageTransportConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAppSetAsNotificationProvider(value: Boolean): Self = StObject.set(x, "isAppSetAsNotificationProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSetAsNotificationProviderAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "requestSetAsNotificationProviderAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransportFriendlyName(value: String): Self = StObject.set(x, "transportFriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportId(value: String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportKind(value: ChatMessageTransportKind): Self = StObject.set(x, "transportKind", value.asInstanceOf[js.Any])
  }
}
