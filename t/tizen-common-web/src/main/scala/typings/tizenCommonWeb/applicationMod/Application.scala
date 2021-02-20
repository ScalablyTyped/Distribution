package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends StObject {
  
  /**
    * Adds a listener which will invoke a callback function when an event occurs.
    *
    * System events do not require an application identifier to be specified. Therefore, the ***appId*** attribute of the EventInfo dictionary should not be specified when listening for system events. If it is specified, the event to listen for will be interpreted as an user event.
    *
    * @since 2.4
    *
    * @param event Event which will invoke the callback.
    * @param callback Callback function to be invoked when the event occurs.
    *
    * @returns Listener identifier.
    *
    * @throw WebAPIException TypeMismatchError, UnknownError
    *
    */
  def addEventListener(event: EventInfo, callback: EventCallback): Double = js.native
  
  /**
    * An attribute to store the application information for the current application.
    */
  val appInfo: ApplicationInformation = js.native
  
  /**
    * Broadcasts a user defined event to all the listeners which are listening for this event.
    *
    * An application can listen to events from other applications. However, it can only broadcast its own events. Therefore, the ***appId*** attribute of the EventInfo dictionary must be the identifier of the application which calls this method.
    *
    * @since 2.4
    *
    * @param event Event to broadcast.
    * @param data User defined event data to broadcast.
    *
    * @throw WebAPIException TypeMismatchError, UnknownError
    *
    */
  def broadcastEvent(event: EventInfo, data: UserEventData): Unit = js.native
  
  /**
    * Broadcasts a user defined event to all the trusted listeners which are listening for this event. Applications which have the same certificate as the sending application can receive the event.
    *
    * An application can listen to events from other applications. However, it can only broadcast its own events. Therefore, the ***appId*** attribute of the EventInfo dictionary must be the identifier of the application which calls this method.
    *
    * @since 2.4
    *
    * @param event Trusted event to broadcast.
    * @param data User defined trusted event data to broadcast.
    *
    * @throw WebAPIException TypeMismatchError, UnknownError
    *
    */
  def broadcastTrustedEvent(event: EventInfo, data: UserEventData): Unit = js.native
  
  /**
    * An attribute to store the ID of a running application.
    */
  val contextId: ApplicationContextId = js.native
  
  /**
    * Exits the current application.
    *
    *
    * @remark This method is not supported by Web Widget.
    *
    * @throw WebAPIException UnknownError
    *
    */
  def exit(): Unit = js.native
  
  /**
    * Gets the requested application control passed to the current application.
    *
    * Gets the requested application control that contains the application control
    * passed by the `launchAppControl()` method from the calling application.
    * The requested application control contains the reason the application
    * is launched and what it has to perform. For example, an application
    * might be launched to display an image on a page by another
    * application's request. In all of these cases, the application is
    * responsible for checking the contents of the application control and responding
    * appropriately when it is launched.
    *
    *
    * @remark This method is not supported by Web Widget.
    *
    * @returns The details of a requested application control.
    *
    * @throw WebAPIException UnknownError
    *
    */
  def getRequestedAppControl(): RequestedApplicationControl = js.native
  
  /**
    * Hides the current application.
    *
    *
    * @remark This method is not supported by Web Widget.
    *
    * @throw WebAPIException UnknownError
    *
    */
  def hide(): Unit = js.native
  
  /**
    * Removes an event listener with a specified listener identifier.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @since 2.4
    *
    * @param watchId Listener identifier.
    *
    * @throw WebAPIException UnknownError
    *
    */
  def removeEventListener(watchId: Double): Unit = js.native
}
object Application {
  
  @scala.inline
  def apply(
    addEventListener: (EventInfo, EventCallback) => Double,
    appInfo: ApplicationInformation,
    broadcastEvent: (EventInfo, UserEventData) => Unit,
    broadcastTrustedEvent: (EventInfo, UserEventData) => Unit,
    contextId: ApplicationContextId,
    exit: () => Unit,
    getRequestedAppControl: () => RequestedApplicationControl,
    hide: () => Unit,
    removeEventListener: Double => Unit
  ): Application = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), appInfo = appInfo.asInstanceOf[js.Any], broadcastEvent = js.Any.fromFunction2(broadcastEvent), broadcastTrustedEvent = js.Any.fromFunction2(broadcastTrustedEvent), contextId = contextId.asInstanceOf[js.Any], exit = js.Any.fromFunction0(exit), getRequestedAppControl = js.Any.fromFunction0(getRequestedAppControl), hide = js.Any.fromFunction0(hide), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (EventInfo, EventCallback) => Double): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppInfo(value: ApplicationInformation): Self = StObject.set(x, "appInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastEvent(value: (EventInfo, UserEventData) => Unit): Self = StObject.set(x, "broadcastEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBroadcastTrustedEvent(value: (EventInfo, UserEventData) => Unit): Self = StObject.set(x, "broadcastTrustedEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContextId(value: ApplicationContextId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestedAppControl(value: () => RequestedApplicationControl): Self = StObject.set(x, "getRequestedAppControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEventListener(value: Double => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
  }
}
