package typings.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEvent extends Event {
  val code: Double
  val reason: String
  val wasClean: Boolean
  def initCloseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    wasCleanArg: Boolean,
    codeArg: Double,
    reasonArg: String
  ): Unit
}

@JSGlobal("CloseEvent")
@js.native
object CloseEvent
  extends Instantiable1[/* typeArg */ String, CloseEvent]
     with Instantiable2[/* typeArg */ String, /* eventInitDict */ CloseEventInit, CloseEvent]

