package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends Event {
  val data: js.Any
  val origin: java.lang.String
  val ports: js.Any
  val source: js.Any
  def initMessageEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    dataArg: js.Any,
    originArg: java.lang.String,
    lastEventIdArg: java.lang.String,
    sourceArg: js.Any
  ): scala.Unit
}

@JSGlobal("MessageEvent")
@js.native
class MessageEventCls protected () extends MessageEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MessageEventInit) = this()
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
  override val data: js.Any = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val eventPhase: scala.Double = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  /* CompleteClass */
  override val ports: js.Any = js.native
  /* CompleteClass */
  override val source: js.Any = js.native
  /* CompleteClass */
  override val target: EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: scala.Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def initMessageEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    dataArg: js.Any,
    originArg: java.lang.String,
    lastEventIdArg: java.lang.String,
    sourceArg: js.Any
  ): scala.Unit = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): scala.Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): scala.Unit = js.native
}

@JSGlobal("MessageEvent")
@js.native
object MessageEvent
  extends org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ MessageEventInit, MessageEvent]
     with org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, MessageEvent]

