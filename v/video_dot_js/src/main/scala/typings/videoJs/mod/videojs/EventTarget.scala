package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StringDictionary
import typings.std.CustomEvent
import typings.std.Event
import typings.videoJs.mod.videojs.EventTarget.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `EventTarget` is a class that can have the same API as the DOM `EventTarget`. It
  * adds shorthand functions that wrap around lengthy functions. For example:
  * the `on` function is a wrapper around `addEventListener`.
  *
  * @see [EventTarget Spec]{@link https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget}
  */
@js.native
trait EventTarget extends js.Object {
  /**
    * An alias of {@link EventTarget#on}. Allows `EventTarget` to mimic
    * the standard DOM API.
    *
    * @param type
    *        An event name or an array of event names.
    *
    * @param fn
    *        The function to call with `EventTarget`s
    *
    * @see {@link EventTarget#on}
    */
  def addEventListener(`type`: String, fn: EventListener): Unit = js.native
  def addEventListener(`type`: js.Array[String], fn: EventListener): Unit = js.native
  /**
    * An alias of {@link EventTarget#trigger}. Allows `EventTarget` to mimic
    * the standard DOM API.
    *
    * @param event
    *        The name of the event, an `Event`, or an object with a key of type set to
    *        an event name.
    *
    * @see {@link EventTarget#trigger}
    */
  def dispatchEvent(event: String): Unit = js.native
  def dispatchEvent(event: Event): Unit = js.native
  /**
    * Removes an `event listener` for a specific event from an instance of `EventTarget`.
    * This makes it so that the `event listener` will no longer get called when the
    * named event happens.
    *
    * @param type
    *        An event name or an array of event names.
    *
    * @param fn
    *        The function to remove.
    */
  def off(`type`: String, fn: EventListener): Unit = js.native
  def off(`type`: js.Array[String], fn: EventListener): Unit = js.native
  /**
    * Adds an `event listener` to an instance of an `EventTarget`. An `event listener` is a
    * function that will get called when an event with a certain name gets triggered.
    *
    * @param type
    *        An event name or an array of event names.
    *
    * @param fn
    *        The function to call with `EventTarget`s
    */
  def on(`type`: String, fn: EventListener): Unit = js.native
  def on(`type`: js.Array[String], fn: EventListener): Unit = js.native
  /**
    * This function will add an `event listener` that gets triggered only once. After the
    * first trigger it will get removed. This is like adding an `event listener`
    * with {@link EventTarget#on} that calls {@link EventTarget#off} on itself.
    *
    * @param type
    *        An event name or an array of event names.
    *
    * @param fn
    *        The function to be called once for each event name.
    */
  def one(`type`: String, fn: EventListener): Unit = js.native
  def one(`type`: js.Array[String], fn: EventListener): Unit = js.native
  /**
    * An alias of {@link EventTarget#off}. Allows `EventTarget` to mimic
    * the standard DOM API.
    *
    * @param type
    *        An event name or an array of event names.
    *
    * @param fn
    *        The function to remove.
    *
    * @see {@link EventTarget#off}
    */
  def removeEventListener(`type`: String, fn: EventListener): Unit = js.native
  def removeEventListener(`type`: js.Array[String], fn: EventListener): Unit = js.native
  /**
    * This function causes an event to happen. This will then cause any `event listeners`
    * that are waiting for that event, to get called. If there are no `event listeners`
    * for an event then nothing will happen.
    *
    * If the name of the `Event` that is being triggered is in `EventTarget.allowedEvents_`.
    * Trigger will also call the `on` + `uppercaseEventName` function.
    *
    * Example:
    * 'click' is in `EventTarget.allowedEvents_`, so, trigger will attempt to call
    * `onClick` if it exists.
    *
    * @param event
    *        The name of the event, an `Event`, or an object with a key of type set to
    *        an event name.
    */
  def trigger(event: String): Unit = js.native
  def trigger(event: typings.videoJs.mod.videojs.EventTarget.Event): Unit = js.native
}

@JSImport("video.js", "videojs.EventTarget")
@js.native
object EventTarget extends js.Object {
  /**
    * A Custom DOM event.
    * @see [Properties]{@link https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent}
    */
  @js.native
  trait Event
    extends CustomEvent[js.Any]
       with /* key */ StringDictionary[js.Any]
  
  /**
    * All event listeners should follow the following format.
    *
    * @param event
    *        the event that triggered this function
    *
    * @param [hash]
    *        hash of data sent during the event
    */
  type EventListener = js.Function2[
    /* e */ typings.videoJs.mod.videojs.EventTarget.Event, 
    /* data */ js.UndefOr[js.Any], 
    Unit
  ]
}

