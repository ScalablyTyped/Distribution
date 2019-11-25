package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the additional service features that are supported with the voice. */
trait SupportedFeatures extends js.Object {
  /** If `true`, the voice can be customized; if `false`, the voice cannot be customized. (Same as `customizable`.). */
  var custom_pronunciation: Boolean
  /** If `true`, the voice can be transformed by using the SSML &lt;voice-transformation&gt; element; if `false`, the voice cannot be transformed. */
  var voice_transformation: Boolean
}

object SupportedFeatures {
  @scala.inline
  def apply(custom_pronunciation: Boolean, voice_transformation: Boolean): SupportedFeatures = {
    val __obj = js.Dynamic.literal(custom_pronunciation = custom_pronunciation.asInstanceOf[js.Any], voice_transformation = voice_transformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SupportedFeatures]
  }
}

