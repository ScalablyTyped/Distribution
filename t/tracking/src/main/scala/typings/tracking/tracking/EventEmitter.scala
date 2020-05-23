package typings.tracking.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventEmitter utility class.
  */
@js.native
trait EventEmitter extends js.Object {
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param event Name of the event.
    * @param listener Listener function.
    */
  def addListener(event: String, listener: TrackEventListener): this.type = js.native
  /**
    * Execute each of the listeners in order with the supplied arguments.
    * @param event Name of the event.
    * @param args Callback arguments.
    */
  def emit(event: String, args: js.Any*): Boolean = js.native
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param event Name of the event.
    * @param listener Listener function.
    */
  def on(event: String, listener: TrackEventListener): this.type = js.native
  /**
    * Adds a one time listener for the event. This listener is invoked only the
    * next time the event is fired, after which it is removed.
    * @param event Name of the event.
    * @param listener Listener function.
    * FIXME: tracking.js docs says method should return this, but code does not
    *        this should be updated when fixed in the repo.
    */
  def once(event: String, listener: TrackEventListener): Unit = js.native
  /**
    * Removes all listeners, or those of the specified event. It's not a good
    * idea to remove listeners that were added elsewhere in the code,
    * especially when it's on an emitter that you didn't create.
    * @param event Optional name of the evnet to remove listeners for.
    */
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  /**
    * Remove a listener from the listener array for the specified event.
    * Caution: changes array indices in the listener array behind the listener.
    * @param event Name of the event.
    * @param listener Listener function.
    */
  def removeListener(event: String, listener: TrackEventListener): this.type = js.native
}

