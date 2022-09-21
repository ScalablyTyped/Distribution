package typings.tabris.mod

import typings.tabris.anon.PickNativeObjectonoffonce
import typings.tabris.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Listeners")
@js.native
open class Listeners[EventData /* <: Target */] protected () extends Observable[EventData] {
  /**
    * Objects of the type `Listeners` provide methods to manage listeners and trigger events. They
    * encapsulate the tabris event system in a way that is more convenient to use with TypeScript,
    * `async`/`await` and RxJS.
    */
  def this(target: TargetType[EventData], `type`: String) = this()
  
  // tslint:disable-next-line:callable-types
  def apply(listener: Listener[ExtendedEvent[EventData, js.Object]]): TargetType[EventData] = js.native
  
  /**
    * Registers a listener to be notified by new events. Each listener can only be added once. Returns the
    * target object. **Instances of  `Listeners` can also be called directly as a function to register a
    * new listener.** I.e. `widget.onResize(listener);` is the same as
    * `widget.onResize.addListener(listener);` It is also the same as `widget.on('resize', listener');`,
    * but with better TypeScript support. 
    * @param listener The listener function called with the [event object](./EventObject.md)
    */
  def addListener(listener: Listener[EventData]): TargetType[EventData] = js.native
  
  /**
    * Notifies the given listener the next time an event is issued, but not afterwards. Returns the target
    * object.
    * @param listener The listener function called with the [event object](./EventObject.md)
    */
  def once(listener: Listener[EventData]): TargetType[EventData] = js.native
  
  /**
    * Returns a promise that resolves the next time an event is issued. The dispatched event object will be
    * used as the resolved value.
    */
  def promise(): js.Promise[ExtendedEvent[EventData, js.Object]] = js.native
  
  /**
    * Deregisters a listener, it will not be notified of future events. Returns the target object.
    * @param listener
    */
  def removeListener(listener: Listener[EventData]): TargetType[EventData] = js.native
  
  /**
    * The object that issues the events, e.g. a widget.
    */
  val target: TargetType[EventData] = js.native
  
  /**
    * Issues a plain event object to all registered listeners with a newly constructed event object.
    */
  def trigger(): TargetType[EventData] = js.native
  def trigger(eventData: ListenersTriggerParam[EventData]): TargetType[EventData] = js.native
  
  /**
    * Like `trigger`, but returns a promise. The promise will resolve when all asynchronous listeners (if
    * any) have resolved. If none of the listeners are asynchronous (return a promise) this method works
    * just like `trigger()`. Useful for unit testing.
    * @param eventData
    */
  def triggerAsync(): js.Promise[TargetType[EventData]] = js.native
  def triggerAsync(eventData: ListenersTriggerParam[EventData]): js.Promise[TargetType[EventData]] = js.native
  
  /**
    * The event type. This value will be set in the `type` field of the event object given to the listener.
    * It is the same value used by the [on](${doc:NativeObjectUrl}#ontype-listener-context) and
    * [trigger](${doc:NativeObjectUrl}#triggertype) methods.
    */
  val `type`: String = js.native
}
/* static members */
object Listeners {
  
  @JSImport("tabris", "Listeners")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getListenerStore(target: js.Object): PickNativeObjectonoffonce = ^.asInstanceOf[js.Dynamic].applyDynamic("getListenerStore")(target.asInstanceOf[js.Any]).asInstanceOf[PickNativeObjectonoffonce]
}
