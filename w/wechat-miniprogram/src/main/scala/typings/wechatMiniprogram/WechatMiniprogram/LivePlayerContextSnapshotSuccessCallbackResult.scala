package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivePlayerContextSnapshotSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 图片的高度 */
  var height: String
  
  /** 图片文件的临时路径 (本地路径) */
  var tempImagePath: String
  
  /** 图片的宽度 */
  var width: String
}
object LivePlayerContextSnapshotSuccessCallbackResult {
  
  inline def apply(errMsg: String, height: String, tempImagePath: String, width: String): LivePlayerContextSnapshotSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], tempImagePath = tempImagePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePlayerContextSnapshotSuccessCallbackResult]
  }
  
  extension [Self <: LivePlayerContextSnapshotSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
