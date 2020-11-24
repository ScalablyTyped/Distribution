package typings.winrtUwp.Windows.Media.SpeechSynthesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about an installed speech synthesis engine (voice). */
@js.native
trait VoiceInformation extends js.Object {
  
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
object VoiceInformation {
  
  @scala.inline
  def apply(description: String, displayName: String, gender: VoiceGender, id: String, language: String): VoiceInformation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceInformation]
  }
  
  @scala.inline
  implicit class VoiceInformationOps[Self <: VoiceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender(value: VoiceGender): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
  }
}
