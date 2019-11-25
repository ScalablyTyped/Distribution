package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** VoiceModels. */
trait VoiceModels extends js.Object {
  /** An array of `VoiceModel` objects that provides information about each available custom voice model. The array is empty if the requesting service credentials own no custom voice models (if no language is specified) or own no custom voice models for the specified language. */
  var customizations: js.Array[VoiceModel]
}

object VoiceModels {
  @scala.inline
  def apply(customizations: js.Array[VoiceModel]): VoiceModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoiceModels]
  }
}

