package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFileInfoData extends StObject {
  
  /**
    * 文件的保存是的时间戳，从1970/01/01 08:00:00 到当前时间的秒数
    */
  var createTime: Double
  
  /**
    * 接口调用结果
    */
  var errMsg: String
  
  /**
    * 文件大小，单位B
    */
  var size: Double
}
object SavedFileInfoData {
  
  @scala.inline
  def apply(createTime: Double, errMsg: String, size: Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFileInfoData]
  }
  
  @scala.inline
  implicit class SavedFileInfoDataMutableBuilder[Self <: SavedFileInfoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
