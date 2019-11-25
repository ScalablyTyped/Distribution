package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioResources. */
trait AudioResources extends js.Object {
  /** An array of `AudioResource` objects that provides information about the audio resources of the custom acoustic model. The array is empty if the custom model has no audio resources. */
  var audio: js.Array[AudioResource]
  /** The total minutes of accumulated audio summed over all of the valid audio resources for the custom acoustic model. You can use this value to determine whether the custom model has too little or too much audio to begin training. */
  var total_minutes_of_audio: Double
}

object AudioResources {
  @scala.inline
  def apply(audio: js.Array[AudioResource], total_minutes_of_audio: Double): AudioResources = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], total_minutes_of_audio = total_minutes_of_audio.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AudioResources]
  }
}

