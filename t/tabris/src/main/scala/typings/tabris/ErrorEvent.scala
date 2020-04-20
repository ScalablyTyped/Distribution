package typings.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent extends Event {
  val colno: Double
  val error: js.Any
  val filename: String
  val lineno: Double
  val message: String
  def initErrorEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    messageArg: String,
    filenameArg: String,
    linenoArg: Double
  ): Unit
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends Instantiable1[/* type */ String, ErrorEvent]
     with Instantiable2[/* type */ String, /* errorEventInitDict */ ErrorEventInit, ErrorEvent]

