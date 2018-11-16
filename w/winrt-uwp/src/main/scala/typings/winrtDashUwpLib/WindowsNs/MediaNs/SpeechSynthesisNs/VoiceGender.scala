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
  
  val female: female with java.lang.String = js.native
  val male: male with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechSynthesisNs.VoiceGender with java.lang.String
  ] = js.native
}

