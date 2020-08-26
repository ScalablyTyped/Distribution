package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音乐播放控制
@js.native
trait BackgroundAudioPlayerState extends js.Object {
  /** 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回 */
  var currentPosition: Double = js.native
  /** 歌曲数据链接，只有在当前有音乐播放时返回 */
  var dataUrl: String = js.native
  /** 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回 */
  var downloadPercent: Double = js.native
  /** 选定音频的长度（单位：s），只有在当前有音乐播放时返回 */
  var duration: Double = js.native
  /** 播放状态（2：没有音乐在播放，1：播放中，0：暂停中） */
  var status: Double = js.native
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
  @scala.inline
  implicit class BackgroundAudioPlayerStateOps[Self <: BackgroundAudioPlayerState] (val x: Self) extends AnyVal {
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
    def setCurrentPosition(value: Double): Self = this.set("currentPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataUrl(value: String): Self = this.set("dataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadPercent(value: Double): Self = this.set("downloadPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

