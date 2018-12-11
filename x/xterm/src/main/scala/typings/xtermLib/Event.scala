package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  val AT_TARGET: scala.Double = js.native
  val BUBBLING_PHASE: scala.Double = js.native
  val CAPTURING_PHASE: scala.Double = js.native
  val NONE: scala.Double = js.native
  /**
       * Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise.
       */
  val bubbles: scala.Boolean = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  /**
       * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
       */
  val composed: scala.Boolean = js.native
  /**
       * Returns the object whose event listener's callback is currently being
       * invoked.
       */
  val currentTarget: EventTarget | scala.Null = js.native
  val defaultPrevented: scala.Boolean = js.native
  val eventPhase: scala.Double = js.native
  /**
       * Returns true if event was dispatched by the user agent, and
       * false otherwise.
       */
  val isTrusted: scala.Boolean = js.native
  var returnValue: scala.Boolean = js.native
  /** @deprecated */
  val srcElement: Element | scala.Null = js.native
  /**
       * Returns the object to which event is dispatched (its target).
       */
  val target: EventTarget | scala.Null = js.native
  /**
       * Returns the event's timestamp as the number of milliseconds measured relative to
       * the time origin.
       */
  val timeStamp: scala.Double = js.native
  /**
       * Returns the type of event, e.g.
       * "click", "hashchange", or
       * "submit".
       */
  val `type`: java.lang.String = js.native
  def composedPath(): js.Array[EventTarget] = js.native
  def initEvent(`type`: java.lang.String): scala.Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean): scala.Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def preventDefault(): scala.Unit = js.native
  /**
       * Invoking this method prevents event from reaching
       * any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any
       * other objects.
       */
  def stopImmediatePropagation(): scala.Unit = js.native
  /**
       * When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.
       */
  def stopPropagation(): scala.Unit = js.native
}

@JSGlobal("Event")
@js.native
object Event
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, Event]
     with ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ EventInit, Event] {
  val AT_TARGET: scala.Double = js.native
  val BUBBLING_PHASE: scala.Double = js.native
  val CAPTURING_PHASE: scala.Double = js.native
  val NONE: scala.Double = js.native
}

