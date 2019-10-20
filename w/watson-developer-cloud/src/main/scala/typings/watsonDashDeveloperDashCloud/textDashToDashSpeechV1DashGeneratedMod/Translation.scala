package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Translation. */
trait Translation extends js.Object {
  /** **Japanese only.** The part of speech for the word. The service uses the value to produce the correct intonation for the word. You can create only a single entry, with or without a single part of speech, for any word; you cannot create multiple entries with different parts of speech for the same word. For more information, see [Working with Japanese entries](https://cloud.ibm.com/docs/services/text-to-speech/custom-rules.html#jaNotes). */
  var part_of_speech: js.UndefOr[String] = js.undefined
  /** The phonetic or sounds-like translation for the word. A phonetic translation is based on the SSML format for representing the phonetic string of a word either as an IPA translation or as an IBM SPR translation. A sounds-like is one or more words that, when combined, sound like the word. */
  var translation: String
}

object Translation {
  @scala.inline
  def apply(translation: String, part_of_speech: String = null): Translation = {
    val __obj = js.Dynamic.literal(translation = translation)
    if (part_of_speech != null) __obj.updateDynamic("part_of_speech")(part_of_speech)
    __obj.asInstanceOf[Translation]
  }
}

