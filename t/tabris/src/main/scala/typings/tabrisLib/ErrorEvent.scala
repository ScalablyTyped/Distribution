package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent extends Event {
  val colno: scala.Double
  val error: js.Any
  val filename: java.lang.String
  val lineno: scala.Double
  val message: java.lang.String
  def initErrorEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    messageArg: java.lang.String,
    filenameArg: java.lang.String,
    linenoArg: scala.Double
  ): scala.Unit
}

@JSGlobal("ErrorEvent")
@js.native
class ErrorEventCls protected () extends ErrorEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, errorEventInitDict: ErrorEventInit) = this()
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
  override val colno: scala.Double = js.native
  /* CompleteClass */
  override val currentTarget: EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val error: js.Any = js.native
  /* CompleteClass */
  override val eventPhase: scala.Double = js.native
  /* CompleteClass */
  override val filename: java.lang.String = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val lineno: scala.Double = js.native
  /* CompleteClass */
  override val message: java.lang.String = js.native
  /* CompleteClass */
  override val target: EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: scala.Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def initErrorEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    messageArg: java.lang.String,
    filenameArg: java.lang.String,
    linenoArg: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): scala.Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): scala.Unit = js.native
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ErrorEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* errorEventInitDict */ ErrorEventInit, ErrorEvent]

