package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramNumbers.`0`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackgroundAudioPlayerStateSuccessCallbackResult extends js.Object {
  
  /** 选定音频的播放位置（单位：s），只有在音乐播放中时返回 */
  var currentPosition: Double = js.native
  
  /** 歌曲数据链接，只有在音乐播放中时返回 */
  var dataUrl: String = js.native
  
  /** 音频的下载进度百分比，只有在音乐播放中时返回 */
  var downloadPercent: Double = js.native
  
  /** 选定音频的长度（单位：s），只有在音乐播放中时返回 */
  var duration: Double = js.native
  
  var errMsg: String = js.native
  
  /** 播放状态
    *
    * 可选值：
    * - 0: 暂停中;
    * - 1: 播放中;
    * - 2: 没有音乐播放; */
  var status: `0` | `1` | `2` = js.native
}
object GetBackgroundAudioPlayerStateSuccessCallbackResult {
  
  @scala.inline
  def apply(
    currentPosition: Double,
    dataUrl: String,
    downloadPercent: Double,
    duration: Double,
    errMsg: String,
    status: `0` | `1` | `2`
  ): GetBackgroundAudioPlayerStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any], downloadPercent = downloadPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBackgroundAudioPlayerStateSuccessCallbackResultOps[Self <: GetBackgroundAudioPlayerStateSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `0` | `1` | `2`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
