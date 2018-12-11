package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineAudioCompletionEvent extends Event {
  val renderedBuffer: AudioBuffer = js.native
}

@JSGlobal("OfflineAudioCompletionEvent")
@js.native
object OfflineAudioCompletionEvent
  extends ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ OfflineAudioCompletionEventInit, 
      OfflineAudioCompletionEvent
    ]

