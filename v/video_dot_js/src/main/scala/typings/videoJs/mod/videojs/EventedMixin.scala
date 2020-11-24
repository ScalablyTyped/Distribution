package typings.videoJs.mod.videojs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains methods that provide event capabilities to an object which is passed
  * to {@link module:evented|evented}.
  */
@js.native
trait EventedMixin extends js.Object {
  
  /**
    * Removes listener(s) from event(s) on an evented object.
    *
    * @param [targetOrType]
    *         If this is a string or array, it represents the event type(s).
    *
    *         Another evented object can be passed here instead, in which case
    *         ALL 3 arguments are _required_.
    *
    * @param [typeOrListener]
    *         If the first argument was a string or array, this may be the
    *         listener function. Otherwise, this is a string or array of event
    *         type(s).
    *
    * @param [listener]
    *         If the first argument was another evented object, this will be
    *         the listener function; otherwise, _all_ listeners bound to the
    *         event type(s) will be removed.
    */
  def off(): Unit = js.native
  def off(
    target: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def off(target: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  def off(
    target: js.UndefOr[scala.Nothing],
    `type`: String,
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def off(target: js.UndefOr[scala.Nothing], `type`: js.Array[String]): Unit = js.native
  def off(
    target: js.UndefOr[scala.Nothing],
    `type`: js.Array[String],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def off(target: Element): Unit = js.native
  def off(
    target: Element,
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def off(target: Element, `type`: String): Unit = js.native
  def off(target: Element, `type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def off(target: Element, `type`: js.Array[String]): Unit = js.native
  def off(target: Element, `type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def off(target: Component): Unit = js.native
  def off(
    target: Component,
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def off(target: Component, `type`: String): Unit = js.native
  def off(target: Component, `type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def off(target: Component, `type`: js.Array[String]): Unit = js.native
  def off(target: Component, `type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def off(`type`: js.UndefOr[scala.Nothing], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def off(`type`: String): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def off(`type`: js.Array[String]): Unit = js.native
  def off(`type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  /**
    * Add a listener to an event (or events) on this object or another evented
    * object.
    *
    * @param targetOrType
    *         If this is a string or array, it represents the event type(s)
    *         that will trigger the listener.
    *
    *         Another evented object can be passed here instead, which will
    *         cause the listener to listen for events on _that_ object.
    *
    *         In either case, the listener's `this` value will be bound to
    *         this object.
    *
    * @param typeOrListener
    *         If the first argument was a string or array, this should be the
    *         listener function. Otherwise, this is a string or array of event
    *         type(s).
    *
    * @param [listener]
    *         If the first argument was another evented object, this will be
    *         the listener function.
    */
  def on(): Unit = js.native
  def on(
    target: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def on(target: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  def on(
    target: js.UndefOr[scala.Nothing],
    `type`: String,
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def on(target: js.UndefOr[scala.Nothing], `type`: js.Array[String]): Unit = js.native
  def on(
    target: js.UndefOr[scala.Nothing],
    `type`: js.Array[String],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def on(target: Element): Unit = js.native
  def on(
    target: Element,
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def on(target: Element, `type`: String): Unit = js.native
  def on(target: Element, `type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(target: Element, `type`: js.Array[String]): Unit = js.native
  def on(target: Element, `type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(target: Component): Unit = js.native
  def on(
    target: Component,
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def on(target: Component, `type`: String): Unit = js.native
  def on(target: Component, `type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(target: Component, `type`: js.Array[String]): Unit = js.native
  def on(target: Component, `type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(`type`: js.UndefOr[scala.Nothing], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(`type`: String): Unit = js.native
  def on(`type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(`type`: js.Array[String]): Unit = js.native
  def on(`type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  /**
    * Add a listener to an event (or events) on this object or another evented
    * object. The listener will only be called once and then removed.
    *
    * @param targetOrType
    *         If this is a string or array, it represents the event type(s)
    *         that will trigger the listener.
    *
    *         Another evented object can be passed here instead, which will
    *         cause the listener to listen for events on _that_ object.
    *
    *         In either case, the listener's `this` value will be bound to
    *         this object.
    *
    * @param typeOrListener
    *         If the first argument was a string or array, this should be the
    *         listener function. Otherwise, this is a string or array of event
    *         type(s).
    *
    * @param [listener]
    *         If the first argument was another evented object, this will be
    *         the listener function.
    */
  def one(): Unit = js.native
  def one(
    target: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def one(target: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  def one(
    target: js.UndefOr[scala.Nothing],
    `type`: String,
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def one(target: js.UndefOr[scala.Nothing], `type`: js.Array[String]): Unit = js.native
  def one(
    target: js.UndefOr[scala.Nothing],
    `type`: js.Array[String],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def one(target: Element): Unit = js.native
  def one(
    target: Element,
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def one(target: Element, `type`: String): Unit = js.native
  def one(target: Element, `type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def one(target: Element, `type`: js.Array[String]): Unit = js.native
  def one(target: Element, `type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def one(target: Component): Unit = js.native
  def one(
    target: Component,
    `type`: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def one(target: Component, `type`: String): Unit = js.native
  def one(target: Component, `type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def one(target: Component, `type`: js.Array[String]): Unit = js.native
  def one(target: Component, `type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def one(`type`: js.UndefOr[scala.Nothing], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def one(`type`: String): Unit = js.native
  def one(`type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def one(`type`: js.Array[String]): Unit = js.native
  def one(`type`: js.Array[String], listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  /**
    * Fire an event on this evented object, causing its listeners to be called.
    *
    * @param event
    *          An event type or an object with a type property.
    *
    * @param [hash]
    *          An additional object to pass along to listeners.
    *
    * @return Whether or not the default behavior was prevented.
    */
  def trigger(event: js.Any): Boolean = js.native
  def trigger(event: js.Any, hash: js.Any): Boolean = js.native
}
