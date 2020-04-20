package typings.wegameApi

import typings.wegameApi.wx.types.AudioSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudioSources extends js.Object {
  /**
    * 音频输入源，每一项对应一种音频输入源
    */
  var audioSources: js.Array[AudioSourceType]
}

object AnonAudioSources {
  @scala.inline
  def apply(audioSources: js.Array[AudioSourceType]): AnonAudioSources = {
    val __obj = js.Dynamic.literal(audioSources = audioSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudioSources]
  }
}

