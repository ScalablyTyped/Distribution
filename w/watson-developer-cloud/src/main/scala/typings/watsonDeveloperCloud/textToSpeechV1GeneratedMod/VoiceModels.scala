package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** VoiceModels. */
@js.native
trait VoiceModels extends js.Object {
  /** An array of `VoiceModel` objects that provides information about each available custom voice model. The array is empty if the requesting service credentials own no custom voice models (if no language is specified) or own no custom voice models for the specified language. */
  var customizations: js.Array[VoiceModel] = js.native
}

object VoiceModels {
  @scala.inline
  def apply(customizations: js.Array[VoiceModel]): VoiceModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceModels]
  }
  @scala.inline
  implicit class VoiceModelsOps[Self <: VoiceModels] (val x: Self) extends AnyVal {
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
    def setCustomizationsVarargs(value: VoiceModel*): Self = this.set("customizations", js.Array(value :_*))
    @scala.inline
    def setCustomizations(value: js.Array[VoiceModel]): Self = this.set("customizations", value.asInstanceOf[js.Any])
  }
  
}

