package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamTrackEvent extends Event {
  val track: MediaStreamTrack = js.native
}

@JSGlobal("MediaStreamTrackEvent")
@js.native
object MediaStreamTrackEvent
  extends ScalablyTyped.runtime.Instantiable1[/* typeArg */ java.lang.String, MediaStreamTrackEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ MediaStreamTrackEventInit, 
      MediaStreamTrackEvent
    ]

