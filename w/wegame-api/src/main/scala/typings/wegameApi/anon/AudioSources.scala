package typings.wegameApi.anon

import typings.wegameApi.wx.types.AudioSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSources extends js.Object {
  /**
    * 音频输入源，每一项对应一种音频输入源
    */
  var audioSources: js.Array[AudioSourceType] = js.native
}

object AudioSources {
  @scala.inline
  def apply(audioSources: js.Array[AudioSourceType]): AudioSources = {
    val __obj = js.Dynamic.literal(audioSources = audioSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSources]
  }
  @scala.inline
  implicit class AudioSourcesOps[Self <: AudioSources] (val x: Self) extends AnyVal {
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
    def setAudioSourcesVarargs(value: AudioSourceType*): Self = this.set("audioSources", js.Array(value :_*))
    @scala.inline
    def setAudioSources(value: js.Array[AudioSourceType]): Self = this.set("audioSources", value.asInstanceOf[js.Any])
  }
  
}

