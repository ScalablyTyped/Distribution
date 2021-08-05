package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`down-mirrored`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`left-mirrored`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`right-mirrored`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`up-mirrored`
import typings.wechatMiniprogram.wechatMiniprogramStrings.down
import typings.wechatMiniprogram.wechatMiniprogramStrings.left
import typings.wechatMiniprogram.wechatMiniprogramStrings.right
import typings.wechatMiniprogram.wechatMiniprogramStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVideoInfoSuccessCallbackResult extends StObject {
  
  /** 视频码率，单位 kbps */
  var bitrate: Double
  
  /** 视频长度 */
  var duration: Double
  
  var errMsg: String
  
  /** 视频帧率 */
  var fps: Double
  
  /** 视频的长，单位 px */
  var height: Double
  
  /** 画面方向
    *
    * 可选值：
    * - 'up': 默认;
    * - 'down': 180度旋转;
    * - 'left': 逆时针旋转90度;
    * - 'right': 顺时针旋转90度;
    * - 'up-mirrored': 同up，但水平翻转;
    * - 'down-mirrored': 同down，但水平翻转;
    * - 'left-mirrored': 同left，但垂直翻转;
    * - 'right-mirrored': 同right，但垂直翻转; */
  var orientation: up | down | left | right | `up-mirrored` | `down-mirrored` | `left-mirrored` | `right-mirrored`
  
  /** 视频大小，单位 kB */
  var size: Double
  
  /** 视频格式 */
  var `type`: String
  
  /** 视频的宽，单位 px */
  var width: Double
}
object GetVideoInfoSuccessCallbackResult {
  
  inline def apply(
    bitrate: Double,
    duration: Double,
    errMsg: String,
    fps: Double,
    height: Double,
    orientation: up | down | left | right | `up-mirrored` | `down-mirrored` | `left-mirrored` | `right-mirrored`,
    size: Double,
    `type`: String,
    width: Double
  ): GetVideoInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVideoInfoSuccessCallbackResult]
  }
  
  extension [Self <: GetVideoInfoSuccessCallbackResult](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOrientation(
      value: up | down | left | right | `up-mirrored` | `down-mirrored` | `left-mirrored` | `right-mirrored`
    ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
