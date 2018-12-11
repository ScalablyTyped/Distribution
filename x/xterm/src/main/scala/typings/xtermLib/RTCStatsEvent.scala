package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsEvent extends Event {
  val report: RTCStatsReport = js.native
}

@JSGlobal("RTCStatsEvent")
@js.native
object RTCStatsEvent
  extends ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ RTCStatsEventInit, RTCStatsEvent]

