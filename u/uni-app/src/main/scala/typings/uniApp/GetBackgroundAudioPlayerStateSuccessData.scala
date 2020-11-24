package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackgroundAudioPlayerStateSuccessData extends js.Object {
  
  /**
    * 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回
    */
  var currentPosition: js.UndefOr[Double] = js.native
  
  /**
    * 歌曲数据链接，只有在当前有音乐播放时返回
    */
  var dataUrl: js.UndefOr[String] = js.native
  
  /**
    * 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回
    */
  var downloadPercent: js.UndefOr[Double] = js.native
  
  /**
    * 选定音频的长度（单位：s），只有在当前有音乐播放时返回
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * 播放状态（2：没有音乐在播放，1：播放中，0：暂停中）
    */
  var status: js.UndefOr[Double] = js.native
}
object GetBackgroundAudioPlayerStateSuccessData {
  
  @scala.inline
  def apply(): GetBackgroundAudioPlayerStateSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateSuccessData]
  }
  
  @scala.inline
  implicit class GetBackgroundAudioPlayerStateSuccessDataOps[Self <: GetBackgroundAudioPlayerStateSuccessData] (val x: Self) extends AnyVal {
    
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
    def deleteCurrentPosition: Self = this.set("currentPosition", js.undefined)
    
    @scala.inline
    def setDataUrl(value: String): Self = this.set("dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataUrl: Self = this.set("dataUrl", js.undefined)
    
    @scala.inline
    def setDownloadPercent(value: Double): Self = this.set("downloadPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadPercent: Self = this.set("downloadPercent", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
