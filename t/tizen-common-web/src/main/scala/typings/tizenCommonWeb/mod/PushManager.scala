package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushManager extends StObject {
  
  /**
    * Connects to the push service and gets state change events and push notifications.
    *
    * The _ErrorCallback()_ is launched with these error types:
    *
    * *   AbortError - If the operation cannot be finished properly.
    *
    *
    * @since 3.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/push
    *
    * @param stateChangeCallback The callback to be called when the state of registration is changed. The callback would be called at least once,
    * just after connection is established.
    * @param notificationCallback The callback to be called when the notification message arrives.
    * @param errorCallback The callback to be called when the connect request fails.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def connect(
    stateChangeCallback: PushRegistrationStateChangeCallback,
    notificationCallback: PushNotificationCallback
  ): Unit = js.native
  def connect(
    stateChangeCallback: PushRegistrationStateChangeCallback,
    notificationCallback: PushNotificationCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Disconnects the push service and stops receiving push notifications.
    *
    * @since 3.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/push
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def disconnect(): Unit = js.native
  
  /**
    * Gets push messages when the application is launched by the push service.
    *
    * If the application is launched by the push service, the push service is connected when the application is launched.
    * Therefore, you can get push messages without calling the [connect()](push.html#PushManager::connect) function.
    *
    * If the application was not launched by the push service, this method returns null.
    *
    * @since 3.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/push
    *
    * @returns The last message delivered from the push service or null.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def getPushMessage(): PushMessage | Null = js.native
  
  /**
    * Gets the push service registration ID for this application if the registration process is successful. null is returned if the application has not been registered yet.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/push
    *
    * @returns ID assigned by push service.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getRegistrationId(): PushRegistrationId = js.native
  
  /**
    * Requests to get unread push notifications. As a consequence, the PushNotificationCallback which was set using the connectService() method will be invoked to retrieve the notifications..
    *
    * The connectService() method must be called to connect to Tizen push server and receive push notifications before calling the getUnreadNotifications() method.
    * If connectService is not called, ServiceNotAvailableError occurs.
    * If any unread message exists, you will get unread push notification message through PushNotificationCallback of connectService().
    * For instance, if there are 10 unread messages, the PushNotificationCallback will be invoked 10 times.
    * If an application receives unread messages, the messages are removed from the system.
    *
    * When an application registers with the push server to receive push notifications,
    * the push server stores messages for the application until they are delivered.
    * While the application is not running, messages cannot be delivered.
    * This method allows retrieving such missed push messages.
    * Once a missed push notification is retrieved the server deletes it from its database.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/push
    *
    * @throw WebAPIException with error type ServiceNotAvailableError, if the network is unreachable for some reason(e.g disconnected to the Tizen push server)
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getUnreadNotifications(): Unit = js.native
  
  /**
    * Registers an application to the Tizen push server.
    *
    * The _ErrorCallback()_ is launched with these error types:
    *
    * *   TimeoutError - If the operation timed out.
    * *   AbortError - If the operation cannot be finished properly.
    *
    *
    * The _connect()_ method must be called before calling the _register()_ method.
    *
    * @since 3.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/push
    *
    * @remark In order to use the push messaging service, see [Push Guide](/application/web/guides/messaging/push).
    *
    * @param successCallback The callback to be called when the registration request succeeds.
    * @param errorCallback The callback to be called when the registration request fails.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type InvalidStateError, if the application is not connected to the push service.
    * @throw WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def register(successCallback: PushRegisterSuccessCallback): Unit = js.native
  def register(successCallback: PushRegisterSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Unregisters an application from the Tizen push server.
    *
    * The _ErrorCallback()_ is launched with these error types:
    *
    * *   TimeoutError - If the operation timed out.
    * *   AbortError - If the operation cannot be finished properly.
    *
    *
    * @since 3.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/push
    *
    * @param successCallback The callback to be called when the unregistration request succeeds.
    * @param errorCallback The callback to be called when the unregistration request fails.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type InvalidStateError, if the application is not connected to the push service.
    * @throw WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def unregister(): Unit = js.native
  def unregister(successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def unregister(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def unregister(successCallback: SuccessCallback): Unit = js.native
  def unregister(successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
}
