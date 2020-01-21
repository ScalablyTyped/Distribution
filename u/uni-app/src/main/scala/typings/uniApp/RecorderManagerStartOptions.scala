package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderManagerStartOptions extends js.Object {
  /**
    * 指定录音的时长，单位 ms ，如果传入了合法的 duration ，在到达指定的 duration 后会自动停止录音，最大值 600000（10 分钟）,默认值 60000（1 分钟）
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 编码码率，有效值见下表格
    */
  var encodeBitRate: js.UndefOr[Double] = js.undefined
  /**
    * 音频格式，有效值 aac/mp3
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * 指定帧大小，单位 KB。传入 frameSize 后，每录制指定帧大小的内容后，会回调录制的文件内容，不指定则不会回调。暂仅支持 mp3 格式。
    */
  var frameSize: js.UndefOr[Double] = js.undefined
  /**
    * 录音通道数，有效值 1/2
    */
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  /**
    * 采样率，有效值 8000/16000/44100
    */
  var sampleRate: js.UndefOr[Double] = js.undefined
}

object RecorderManagerStartOptions {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    encodeBitRate: Int | Double = null,
    format: String = null,
    frameSize: Int | Double = null,
    numberOfChannels: Int | Double = null,
    sampleRate: Int | Double = null
  ): RecorderManagerStartOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (encodeBitRate != null) __obj.updateDynamic("encodeBitRate")(encodeBitRate.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (frameSize != null) __obj.updateDynamic("frameSize")(frameSize.asInstanceOf[js.Any])
    if (numberOfChannels != null) __obj.updateDynamic("numberOfChannels")(numberOfChannels.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderManagerStartOptions]
  }
}

