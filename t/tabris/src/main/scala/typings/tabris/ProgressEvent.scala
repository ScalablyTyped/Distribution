package typings.tabris

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends Event {
  val lengthComputable: Boolean
  val loaded: Double
  val total: Double
  def initProgressEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    lengthComputableArg: Boolean,
    loadedArg: Double,
    totalArg: Double
  ): Unit
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends Instantiable1[/* type */ String, ProgressEvent]
     with Instantiable2[/* type */ String, /* eventInitDict */ ProgressEventInit, ProgressEvent]

