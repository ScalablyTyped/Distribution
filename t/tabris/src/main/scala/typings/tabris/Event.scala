package typings.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  val AT_TARGET: Double
  val BUBBLING_PHASE: Double
  val CAPTURING_PHASE: Double
  val bubbles: Boolean
  val cancelable: Boolean
  val currentTarget: EventTarget
  val defaultPrevented: Boolean
  val eventPhase: Double
  val isTrusted: Boolean
  val target: EventTarget
  val timeStamp: Double
  val `type`: String
  def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

@JSGlobal("Event")
@js.native
object Event
  extends Instantiable1[/* typeArg */ String, Event]
     with Instantiable2[/* typeArg */ String, /* eventInitDict */ EventInit, Event] {
  val AT_TARGET: Double = js.native
  val BUBBLING_PHASE: Double = js.native
  val CAPTURING_PHASE: Double = js.native
}

