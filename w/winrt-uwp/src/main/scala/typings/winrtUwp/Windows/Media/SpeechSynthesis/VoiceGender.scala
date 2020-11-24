package typings.winrtUwp.Windows.Media.SpeechSynthesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
