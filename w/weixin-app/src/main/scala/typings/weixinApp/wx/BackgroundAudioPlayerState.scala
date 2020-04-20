package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音乐播放控制
trait BackgroundAudioPlayerState extends js.Object {
  /** 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回 */
  var currentPosition: Double
  /** 歌曲数据链接，只有在当前有音乐播放时返回 */
  var dataUrl: String
  /** 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回 */
  var downloadPercent: Double
  /** 选定音频的长度（单位：s），只有在当前有音乐播放时返回 */
  var duration: Double
  /** 播放状态（2：没有音乐在播放，1：播放中，0：暂停中） */
  var status: Double
}

object BackgroundAudioPlayerState {
  @scala.inline
  def apply(
    currentPosition: Double,
    dataUrl: String,
    downloadPercent: Double,
    duration: Double,
    status: Double
  ): BackgroundAudioPlayerState = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any], downloadPercent = downloadPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioPlayerState]
  }
}

