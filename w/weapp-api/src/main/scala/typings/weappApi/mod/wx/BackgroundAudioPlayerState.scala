package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundAudioPlayerState extends StObject {
  
  /** 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回 */
  var currentPosition: js.UndefOr[Double] = js.undefined
  
  /** 歌曲数据链接，只有在当前有音乐播放时返回 */
  var dataUrl: js.UndefOr[String] = js.undefined
  
  /** 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回 */
  var downloadPercent: js.UndefOr[Double] = js.undefined
  
  /** 选定音频的长度（单位：s），只有在当前有音乐播放时返回 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 播放状态（2：没有音乐在播放，1：播放中，0：暂停中） */
  var status: Double
}
object BackgroundAudioPlayerState {
  
  inline def apply(status: Double): BackgroundAudioPlayerState = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioPlayerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundAudioPlayerState] (val x: Self) extends AnyVal {
    
    inline def setCurrentPosition(value: Double): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
    
    inline def setCurrentPositionUndefined: Self = StObject.set(x, "currentPosition", js.undefined)
    
    inline def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    inline def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
    
    inline def setDownloadPercent(value: Double): Self = StObject.set(x, "downloadPercent", value.asInstanceOf[js.Any])
    
    inline def setDownloadPercentUndefined: Self = StObject.set(x, "downloadPercent", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
