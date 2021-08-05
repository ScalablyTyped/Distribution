package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 本地临时文件列表 */
trait MediaFile extends StObject {
  
  /** 视频的时间长度 */
  var duration: Double
  
  /** 视频的高度 */
  var height: Double
  
  /** 本地临时文件大小，单位 B */
  var size: Double
  
  /** 本地临时文件路径 (本地路径) */
  var tempFilePath: String
  
  /** 视频缩略图临时文件路径 */
  var thumbTempFilePath: String
  
  /** 视频的宽度 */
  var width: Double
}
object MediaFile {
  
  inline def apply(
    duration: Double,
    height: Double,
    size: Double,
    tempFilePath: String,
    thumbTempFilePath: String,
    width: Double
  ): MediaFile = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any], thumbTempFilePath = thumbTempFilePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFile]
  }
  
  extension [Self <: MediaFile](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    inline def setThumbTempFilePath(value: String): Self = StObject.set(x, "thumbTempFilePath", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
