package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionEventMap extends js.Object {
  var audioend: Event
  var audiostart: Event
  var end: Event
  var error: SpeechRecognitionError
  var nomatch: SpeechRecognitionEvent
  var result: SpeechRecognitionEvent
  var soundend: Event
  var soundstart: Event
  var speechend: Event
  var speechstart: Event
  var start: Event
}

object SpeechRecognitionEventMap {
  @scala.inline
  def apply(
    audioend: Event,
    audiostart: Event,
    end: Event,
    error: SpeechRecognitionError,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: Event,
    soundstart: Event,
    speechend: Event,
    speechstart: Event,
    start: Event
  ): SpeechRecognitionEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audioend")(audioend)
    __obj.updateDynamic("audiostart")(audiostart)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("nomatch")(nomatch)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("soundend")(soundend)
    __obj.updateDynamic("soundstart")(soundstart)
    __obj.updateDynamic("speechend")(speechend)
    __obj.updateDynamic("speechstart")(speechstart)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SpeechRecognitionEventMap]
  }
}

