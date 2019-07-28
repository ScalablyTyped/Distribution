package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechSynthesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about an installed speech synthesis engine (voice). */
@JSGlobal("Windows.Media.SpeechSynthesis.VoiceInformation")
@js.native
abstract class VoiceInformation () extends js.Object {
  /** Gets the description of the speech synthesis engine (voice). */
  var description: String = js.native
  /** Gets the display name associated with the speech synthesis engine (voice). */
  var displayName: String = js.native
  /** Gets the gender setting of the speech synthesis engine (voice). */
  var gender: VoiceGender = js.native
  /** Gets the unique ID of the speech synthesis engine (voice). */
  var id: String = js.native
  /** Gets the normalized BCP-47 language tag of the speech synthesis engine (voice). */
  var language: String = js.native
}

