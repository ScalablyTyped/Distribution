package typings.wegameDashApi

import typings.wegameDashApi.wegameDashApiNumbers.`11025`
import typings.wegameDashApi.wegameDashApiNumbers.`12000`
import typings.wegameDashApi.wegameDashApiNumbers.`16000`
import typings.wegameDashApi.wegameDashApiNumbers.`1`
import typings.wegameDashApi.wegameDashApiNumbers.`22050`
import typings.wegameDashApi.wegameDashApiNumbers.`24000`
import typings.wegameDashApi.wegameDashApiNumbers.`2`
import typings.wegameDashApi.wegameDashApiNumbers.`32000`
import typings.wegameDashApi.wegameDashApiNumbers.`44100`
import typings.wegameDashApi.wegameDashApiNumbers.`48000`
import typings.wegameDashApi.wegameDashApiNumbers.`8000`
import typings.wegameDashApi.wegameDashApiStrings.aac
import typings.wegameDashApi.wegameDashApiStrings.mp3
import typings.wegameDashApi.wx.types.AudioSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
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

object Anon_1 {
  @scala.inline
  def apply(
    encodeBitRate: Double,
    format: mp3 | aac,
    frameSize: Double,
    numberOfChannels: `1` | `2`,
    sampleRate: `8000` | `11025` | `12000` | `16000` | `22050` | `24000` | `32000` | `44100` | `48000`,
    audioSource: AudioSourceType = null,
    duration: Int | Double = null
  ): Anon_1 = {
    val __obj = js.Dynamic.literal(encodeBitRate = encodeBitRate, format = format.asInstanceOf[js.Any], frameSize = frameSize, numberOfChannels = numberOfChannels.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    if (audioSource != null) __obj.updateDynamic("audioSource")(audioSource)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_1]
  }
}

