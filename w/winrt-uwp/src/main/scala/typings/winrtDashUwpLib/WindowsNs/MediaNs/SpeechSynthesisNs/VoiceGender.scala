package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechSynthesisNs

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
  sealed trait female
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechSynthesisNs.VoiceGender
  
  /** Male */
  @js.native
  sealed trait male
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechSynthesisNs.VoiceGender
  
  /* 1 */ val female: female with scala.Double = js.native
  /* 0 */ val male: male with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechSynthesisNs.VoiceGender with scala.Double
  ] = js.native
}

