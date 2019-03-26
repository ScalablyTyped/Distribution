package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends Event {
  val lengthComputable: scala.Boolean
  val loaded: scala.Double
  val total: scala.Double
  def initProgressEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    lengthComputableArg: scala.Boolean,
    loadedArg: scala.Double,
    totalArg: scala.Double
  ): scala.Unit
}

@JSGlobal("ProgressEvent")
@js.native
class ProgressEventCls protected () extends ProgressEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ProgressEventInit) = this()
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
  override val lengthComputable: scala.Boolean = js.native
  /* CompleteClass */
  override val loaded: scala.Double = js.native
  /* CompleteClass */
  override val target: EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: scala.Double = js.native
  /* CompleteClass */
  override val total: scala.Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def initProgressEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    lengthComputableArg: scala.Boolean,
    loadedArg: scala.Double,
    totalArg: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): scala.Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): scala.Unit = js.native
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ProgressEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ProgressEventInit, ProgressEvent]

