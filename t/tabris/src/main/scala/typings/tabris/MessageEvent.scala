package typings.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends Event {
  val data: js.Any
  val origin: String
  val ports: js.Any
  val source: js.Any
  def initMessageEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    dataArg: js.Any,
    originArg: String,
    lastEventIdArg: String,
    sourceArg: js.Any
  ): Unit
}

@JSGlobal("MessageEvent")
@js.native
object MessageEvent
  extends Instantiable1[/* type */ String, MessageEvent]
     with Instantiable2[/* type */ String, /* eventInitDict */ MessageEventInit, MessageEvent]

