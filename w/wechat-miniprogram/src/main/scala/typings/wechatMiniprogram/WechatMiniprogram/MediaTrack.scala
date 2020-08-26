package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.audio
import typings.wechatMiniprogram.wechatMiniprogramStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 可通过 [MediaContainer.extractDataSource](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.extractDataSource.html) 返回。
  *
  * [MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html) 音频或视频轨道，可以对轨道进行一些操作
  *
  * 最低基础库： `2.9.0` */
@js.native
trait MediaTrack extends js.Object {
  /** 轨道长度，只读 */
  var duration: Double = js.native
  /** 轨道类型，只读
    *
    * 可选值：
    * - 'audio': 音频轨道;
    * - 'video': 视频轨道; */
  var kind: audio | video = js.native
  /** 音量，音频轨道下有效，可写 */
  var volume: Double = js.native
}

object MediaTrack {
  @scala.inline
  def apply(duration: Double, kind: audio | video, volume: Double): MediaTrack = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrack]
  }
  @scala.inline
  implicit class MediaTrackOps[Self <: MediaTrack] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: audio | video): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

