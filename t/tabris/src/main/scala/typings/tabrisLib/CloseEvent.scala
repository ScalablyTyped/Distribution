package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEvent extends Event {
  val code: scala.Double
  val reason: java.lang.String
  val wasClean: scala.Boolean
  def initCloseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    wasCleanArg: scala.Boolean,
    codeArg: scala.Double,
    reasonArg: java.lang.String
  ): scala.Unit
}

@JSGlobal("CloseEvent")
@js.native
class CloseEventCls protected () extends CloseEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: CloseEventInit) = this()
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
  override val code: scala.Double = js.native
  /* CompleteClass */
  override val currentTarget: EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val eventPhase: scala.Double = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val reason: java.lang.String = js.native
  /* CompleteClass */
  override val target: EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: scala.Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override val wasClean: scala.Boolean = js.native
  /* CompleteClass */
  override def initCloseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    wasCleanArg: scala.Boolean,
    codeArg: scala.Double,
    reasonArg: java.lang.String
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

@JSGlobal("CloseEvent")
@js.native
object CloseEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, CloseEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ CloseEventInit, CloseEvent]

