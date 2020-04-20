package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Voices. */
trait Voices extends js.Object {
  /** A list of available voices. */
  var voices: js.Array[Voice]
}

object Voices {
  @scala.inline
  def apply(voices: js.Array[Voice]): Voices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voices]
  }
}

