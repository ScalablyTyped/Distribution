package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  val AT_TARGET: scala.Double
  val BUBBLING_PHASE: scala.Double
  val CAPTURING_PHASE: scala.Double
  val bubbles: scala.Boolean
  val cancelable: scala.Boolean
  val currentTarget: EventTarget
  val defaultPrevented: scala.Boolean
  val eventPhase: scala.Double
  val isTrusted: scala.Boolean
  val target: EventTarget
  val timeStamp: scala.Double
  val `type`: java.lang.String
  def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): scala.Unit
  def preventDefault(): scala.Unit
  def stopImmediatePropagation(): scala.Unit
  def stopPropagation(): scala.Unit
}

@JSGlobal("Event")
@js.native
class EventCls protected () extends Event {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: EventInit) = this()
  /* CompleteClass */
  override val AT_TARGET: scala.Double = js.native
  /* CompleteClass */
  override val BUBBLING_PHASE: scala.Double = js.native
  /* CompleteClass */
  override val CAPTURING_PHASE: scala.Double = js.native
  /* CompleteClass */
  override val bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override val cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override val currentTarget: EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val eventPhase: scala.Double = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val target: EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: scala.Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): scala.Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): scala.Unit = js.native
}

@JSGlobal("Event")
@js.native
object Event
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, Event]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ EventInit, Event] {
  val AT_TARGET: scala.Double = js.native
  val BUBBLING_PHASE: scala.Double = js.native
  val CAPTURING_PHASE: scala.Double = js.native
}

