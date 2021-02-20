package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavedFileInfoSuccess extends StObject {
  
  /**
    * 文件保存时的时间戳，从1970/01/01 08:00:00 到该时刻的秒数
    */
  var createTime: js.UndefOr[Double] = js.native
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 文件大小，单位B
    */
  var size: js.UndefOr[Double] = js.native
}
object GetSavedFileInfoSuccess {
  
  @scala.inline
  def apply(): GetSavedFileInfoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileInfoSuccess]
  }
  
  @scala.inline
  implicit class GetSavedFileInfoSuccessMutableBuilder[Self <: GetSavedFileInfoSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
