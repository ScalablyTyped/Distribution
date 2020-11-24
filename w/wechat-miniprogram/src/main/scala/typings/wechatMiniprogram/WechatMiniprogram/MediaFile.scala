package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 本地临时文件列表 */
@js.native
trait MediaFile extends js.Object {
  
  /** 视频的时间长度 */
  var duration: Double = js.native
  
  /** 视频的高度 */
  var height: Double = js.native
  
  /** 本地临时文件大小，单位 B */
  var size: Double = js.native
  
  /** 本地临时文件路径 (本地路径) */
  var tempFilePath: String = js.native
  
  /** 视频缩略图临时文件路径 */
  var thumbTempFilePath: String = js.native
  
  /** 视频的宽度 */
  var width: Double = js.native
}
object MediaFile {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class MediaFileOps[Self <: MediaFile] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTempFilePath(value: String): Self = this.set("thumbTempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
