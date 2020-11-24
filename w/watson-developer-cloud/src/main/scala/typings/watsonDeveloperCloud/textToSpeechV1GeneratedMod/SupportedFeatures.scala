package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the additional service features that are supported with the voice. */
@js.native
trait SupportedFeatures extends js.Object {
  
  /** If `true`, the voice can be customized; if `false`, the voice cannot be customized. (Same as `customizable`.). */
  var custom_pronunciation: Boolean = js.native
  
  /** If `true`, the voice can be transformed by using the SSML &lt;voice-transformation&gt; element; if `false`, the voice cannot be transformed. */
  var voice_transformation: Boolean = js.native
}
object SupportedFeatures {
  
  @scala.inline
  def apply(custom_pronunciation: Boolean, voice_transformation: Boolean): SupportedFeatures = {
    val __obj = js.Dynamic.literal(custom_pronunciation = custom_pronunciation.asInstanceOf[js.Any], voice_transformation = voice_transformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFeatures]
  }
  
  @scala.inline
  implicit class SupportedFeaturesOps[Self <: SupportedFeatures] (val x: Self) extends AnyVal {
    
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
    def setCustom_pronunciation(value: Boolean): Self = this.set("custom_pronunciation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoice_transformation(value: Boolean): Self = this.set("voice_transformation", value.asInstanceOf[js.Any])
  }
}
