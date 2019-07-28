package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechSynthesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VoiceGender extends js.Object

/** Specifies the gender settings for an installed speech synthesis engine (voice). */
@JSGlobal("Windows.Media.SpeechSynthesis.VoiceGender")
@js.native
object VoiceGender extends js.Object {
  /** Female */
  @js.native
  sealed trait female extends VoiceGender
  
  /** Male */
  @js.native
  sealed trait male extends VoiceGender
  
  /* 1 */ val female: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechSynthesisNs.VoiceGender.female with Double = js.native
  /* 0 */ val male: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechSynthesisNs.VoiceGender.male with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VoiceGender with Double] = js.native
}

