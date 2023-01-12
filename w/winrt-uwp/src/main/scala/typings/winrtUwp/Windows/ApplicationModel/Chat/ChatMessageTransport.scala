package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the identity of a transport for sending and receiving messages. Physically, a chat message transport is a SIM slot on the phone. */
trait ChatMessageTransport extends StObject {
  
  /** Gets the configuration of the message transport. */
  var configuration: ChatMessageTransportConfiguration
  
  /** Gets a Boolean value that indicates whether the messaging transport is active. */
  var isActive: Boolean
  
  /** Gets a Boolean value that indicates whether the current application is set as the messaging notification provider. */
  var isAppSetAsNotificationProvider: Boolean
  
  /**
    * Sets the current application to handle messaging notifications.
    * @return An asynchronous action.
    */
  def requestSetAsNotificationProviderAsync(): IPromiseWithIAsyncAction
  
  /** Gets a descriptive name identifying the messaging transport. */
  var transportFriendlyName: String
  
  /** Gets the messaging transport’s identifier. */
  var transportId: String
  
  /** Gets the type of the message transport. */
  var transportKind: ChatMessageTransportKind
}
object ChatMessageTransport {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ChatMessageTransport] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: ChatMessageTransportConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsAppSetAsNotificationProvider(value: Boolean): Self = StObject.set(x, "isAppSetAsNotificationProvider", value.asInstanceOf[js.Any])
    
    inline def setRequestSetAsNotificationProviderAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "requestSetAsNotificationProviderAsync", js.Any.fromFunction0(value))
    
    inline def setTransportFriendlyName(value: String): Self = StObject.set(x, "transportFriendlyName", value.asInstanceOf[js.Any])
    
    inline def setTransportId(value: String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    inline def setTransportKind(value: ChatMessageTransportKind): Self = StObject.set(x, "transportKind", value.asInstanceOf[js.Any])
  }
}
