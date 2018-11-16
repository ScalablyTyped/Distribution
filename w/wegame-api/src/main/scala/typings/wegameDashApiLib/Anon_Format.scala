package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Format extends js.Object {
  /**
           * 指定录音的音频源，可通过 wx.getAvailableAudioSources() 获取当前可用的音频源，默认值auto
           */
  var audioSource: js.UndefOr[wegameDashApiLib.wxNs.typesNs.AudioSourceType] = js.undefined
  /**
           * 录音的时长，单位 ms，最大值 600000（10 分钟），默认值60000（1 分钟）
           */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
           * 编码码率
           */
  var encodeBitRate: scala.Double
  /**
           * 音频格式
           */
  var format: wegameDashApiLib.wegameDashApiLibStrings.mp3 | wegameDashApiLib.wegameDashApiLibStrings.aac
  /**
           * 指定帧大小，单位 KB。传入 frameSize 后，每录制指定帧大小的内容后，会回调录制的文件内容，不指定则不会回调
           */
  var frameSize: scala.Double
  /**
           * 录音通道数
           */
  var numberOfChannels: wegameDashApiLib.wegameDashApiLibNumbers.`1` | wegameDashApiLib.wegameDashApiLibNumbers.`2`
  /**
           * 采样率
           */
  var sampleRate: wegameDashApiLib.wegameDashApiLibNumbers.`8000` | wegameDashApiLib.wegameDashApiLibNumbers.`11025` | wegameDashApiLib.wegameDashApiLibNumbers.`12000` | wegameDashApiLib.wegameDashApiLibNumbers.`16000` | wegameDashApiLib.wegameDashApiLibNumbers.`22050` | wegameDashApiLib.wegameDashApiLibNumbers.`24000` | wegameDashApiLib.wegameDashApiLibNumbers.`32000` | wegameDashApiLib.wegameDashApiLibNumbers.`44100` | wegameDashApiLib.wegameDashApiLibNumbers.`48000`
}

