package typings.winrtUwp.Windows.Media.SpeechSynthesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about an installed speech synthesis engine (voice). */
trait VoiceInformation extends js.Object {
  /** Gets the description of the speech synthesis engine (voice). */
  var description: String
  /** Gets the display name associated with the speech synthesis engine (voice). */
  var displayName: String
  /** Gets the gender setting of the speech synthesis engine (voice). */
  var gender: VoiceGender
  /** Gets the unique ID of the speech synthesis engine (voice). */
  var id: String
  /** Gets the normalized BCP-47 language tag of the speech synthesis engine (voice). */
  var language: String
}

object VoiceInformation {
  @scala.inline
  def apply(description: String, displayName: String, gender: VoiceGender, id: String, language: String): VoiceInformation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceInformation]
  }
}

