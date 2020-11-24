package typings.tizenCommonWeb.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends js.Object {
  
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
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddEventListener(value: (EventInfo, EventCallback) => Double): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppInfo(value: ApplicationInformation): Self = this.set("appInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastEvent(value: (EventInfo, UserEventData) => Unit): Self = this.set("broadcastEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBroadcastTrustedEvent(value: (EventInfo, UserEventData) => Unit): Self = this.set("broadcastTrustedEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContextId(value: ApplicationContextId): Self = this.set("contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: () => Unit): Self = this.set("exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestedAppControl(value: () => RequestedApplicationControl): Self = this.set("getRequestedAppControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEventListener(value: Double => Unit): Self = this.set("removeEventListener", js.Any.fromFunction1(value))
  }
}
