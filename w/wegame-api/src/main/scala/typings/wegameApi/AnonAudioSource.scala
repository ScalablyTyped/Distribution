package typings.wegameApi

import typings.wegameApi.wegameApiNumbers.`11025`
import typings.wegameApi.wegameApiNumbers.`12000`
import typings.wegameApi.wegameApiNumbers.`16000`
import typings.wegameApi.wegameApiNumbers.`1`
import typings.wegameApi.wegameApiNumbers.`22050`
import typings.wegameApi.wegameApiNumbers.`24000`
import typings.wegameApi.wegameApiNumbers.`2`
import typings.wegameApi.wegameApiNumbers.`32000`
import typings.wegameApi.wegameApiNumbers.`44100`
import typings.wegameApi.wegameApiNumbers.`48000`
import typings.wegameApi.wegameApiNumbers.`8000`
import typings.wegameApi.wegameApiStrings.aac
import typings.wegameApi.wegameApiStrings.mp3
import typings.wegameApi.wx.types.AudioSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudioSource extends js.Object {
  /**
    * 指定录音的音频源，可通过 wx.getAvailableAudioSources() 获取当前可用的音频源，默认值auto
    */
  var audioSource: js.UndefOr[AudioSourceType] = js.undefined
  /**
    * 录音的时长，单位 ms，最大值 600000（10 分钟），默认值60000（1 分钟）
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 编码码率
    */
  var encodeBitRate: Double
  /**
    * 音频格式
    */
  var format: mp3 | aac
  /**
    * 指定帧大小，单位 KB。传入 frameSize 后，每录制指定帧大小的内容后，会回调录制的文件内容，不指定则不会回调
    */
  var frameSize: Double
  /**
    * 录音通道数
    */
  var numberOfChannels: `1` | `2`
  /**
    * 采样率
    */
  var sampleRate: `8000` | `11025` | `12000` | `16000` | `22050` | `24000` | `32000` | `44100` | `48000`
}

object AnonAudioSource {
  @scala.inline
  def apply(
    encodeBitRate: Double,
    format: mp3 | aac,
    frameSize: Double,
    numberOfChannels: `1` | `2`,
    sampleRate: `8000` | `11025` | `12000` | `16000` | `22050` | `24000` | `32000` | `44100` | `48000`,
    audioSource: AudioSourceType = null,
    duration: Int | Double = null
  ): AnonAudioSource = {
    val __obj = js.Dynamic.literal(encodeBitRate = encodeBitRate.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], frameSize = frameSize.asInstanceOf[js.Any], numberOfChannels = numberOfChannels.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    if (audioSource != null) __obj.updateDynamic("audioSource")(audioSource.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudioSource]
  }
}

