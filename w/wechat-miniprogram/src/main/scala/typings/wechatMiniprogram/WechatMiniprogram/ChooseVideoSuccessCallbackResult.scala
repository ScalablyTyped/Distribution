package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseVideoSuccessCallbackResult extends StObject {
  
  /** 选定视频的时间长度 */
  var duration: Double
  
  var errMsg: String
  
  /** 返回选定视频的高度 */
  var height: Double
  
  /** 选定视频的数据量大小 */
  var size: Double
  
  /** 选定视频的临时文件路径 (本地路径) */
  var tempFilePath: String
  
  /** 返回选定视频的宽度 */
  var width: Double
}
object ChooseVideoSuccessCallbackResult {
  
  @scala.inline
  def apply(
    duration: Double,
    errMsg: String,
    height: Double,
    size: Double,
    tempFilePath: String,
    width: Double
  ): ChooseVideoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseVideoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseVideoSuccessCallbackResultMutableBuilder[Self <: ChooseVideoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
