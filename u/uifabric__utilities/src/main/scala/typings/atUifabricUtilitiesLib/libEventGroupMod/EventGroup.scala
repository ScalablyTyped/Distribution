package typings
package atUifabricUtilitiesLib.libEventGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/EventGroup", "EventGroup")
@js.native
class EventGroup protected () extends js.Object {
  /** parent: the context in which events attached to non-HTMLElements are called */
  def this(parent: js.Any) = this()
  var _eventRecords: js.Any = js.native
  var _id: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _parent: js.Any = js.native
  /** Declare an event as being supported by this instance of EventGroup. */
  def declare(event: java.lang.String): scala.Unit = js.native
  def declare(event: js.Array[java.lang.String]): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def off(target: js.Any): scala.Unit = js.native
  def off(target: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def off(
    target: js.Any,
    eventName: java.lang.String,
    callback: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def off(
    target: js.Any,
    eventName: java.lang.String,
    callback: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /** On the target, attach an event whose handler will be called in the context of the parent
    * of this instance of EventGroup.
    */
  def on(
    target: js.Any,
    eventName: java.lang.String,
    callback: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def on(
    target: js.Any,
    eventName: java.lang.String,
    callback: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /** On the target, attach a set of events, where the events object is a name to function mapping. */
  def onAll(
    target: js.Any,
    events: org.scalablytyped.runtime.StringDictionary[js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]]
  ): scala.Unit = js.native
  def onAll(
    target: js.Any,
    events: org.scalablytyped.runtime.StringDictionary[js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /** Trigger the given event in the context of this instance of EventGroup. */
  def raise(eventName: java.lang.String): js.UndefOr[scala.Boolean] = js.native
  def raise(eventName: java.lang.String, eventArgs: js.Any): js.UndefOr[scala.Boolean] = js.native
  def raise(eventName: java.lang.String, eventArgs: js.Any, bubbleEvent: scala.Boolean): js.UndefOr[scala.Boolean] = js.native
}

@JSImport("@uifabric/utilities/lib/EventGroup", "EventGroup")
@js.native
object EventGroup extends js.Object {
  var _uniqueId: js.Any = js.native
  /* private */ def _isElement(target: js.Any): js.Any = js.native
  /** Check to see if the target has declared support of the given event. */
  def isDeclared(target: js.Any, eventName: java.lang.String): scala.Boolean = js.native
  def isObserved(target: js.Any, eventName: java.lang.String): scala.Boolean = js.native
  /** For IE8, bubbleEvent is ignored here and must be dealt with by the handler.
    *  Events raised here by default have bubbling set to false and cancelable set to true.
    *  This applies also to built-in events being raised manually here on HTMLElements,
    *  which may lead to unexpected behavior if it differs from the defaults.
    *
    */
  def raise(target: js.Any, eventName: java.lang.String): js.UndefOr[scala.Boolean] = js.native
  def raise(target: js.Any, eventName: java.lang.String, eventArgs: js.Any): js.UndefOr[scala.Boolean] = js.native
  def raise(target: js.Any, eventName: java.lang.String, eventArgs: js.Any, bubbleEvent: scala.Boolean): js.UndefOr[scala.Boolean] = js.native
  def stopPropagation(event: js.Any): scala.Unit = js.native
}

