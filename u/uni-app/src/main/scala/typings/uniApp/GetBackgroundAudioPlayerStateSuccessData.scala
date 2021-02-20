package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackgroundAudioPlayerStateSuccessData extends StObject {
  
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
  implicit class GetBackgroundAudioPlayerStateSuccessDataMutableBuilder[Self <: GetBackgroundAudioPlayerStateSuccessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPosition(value: Double): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPositionUndefined: Self = StObject.set(x, "currentPosition", js.undefined)
    
    @scala.inline
    def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
    
    @scala.inline
    def setDownloadPercent(value: Double): Self = StObject.set(x, "downloadPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPercentUndefined: Self = StObject.set(x, "downloadPercent", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
