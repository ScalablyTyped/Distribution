package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackgroundAudioPlayerStateSuccessData extends js.Object {
  /**
    * 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回
    */
  var currentPosition: js.UndefOr[Double] = js.undefined
  /**
    * 歌曲数据链接，只有在当前有音乐播放时返回
    */
  var dataUrl: js.UndefOr[String] = js.undefined
  /**
    * 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回
    */
  var downloadPercent: js.UndefOr[Double] = js.undefined
  /**
    * 选定音频的长度（单位：s），只有在当前有音乐播放时返回
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 播放状态（2：没有音乐在播放，1：播放中，0：暂停中）
    */
  var status: js.UndefOr[Double] = js.undefined
}

object GetBackgroundAudioPlayerStateSuccessData {
  @scala.inline
  def apply(
    currentPosition: js.UndefOr[Double] = js.undefined,
    dataUrl: String = null,
    downloadPercent: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    status: js.UndefOr[Double] = js.undefined
  ): GetBackgroundAudioPlayerStateSuccessData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentPosition)) __obj.updateDynamic("currentPosition")(currentPosition.get.asInstanceOf[js.Any])
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(downloadPercent)) __obj.updateDynamic("downloadPercent")(downloadPercent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateSuccessData]
  }
}

