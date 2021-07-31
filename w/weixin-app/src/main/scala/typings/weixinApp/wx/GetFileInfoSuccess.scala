package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileInfoSuccess extends StObject {
  
  /** 按照传入的 digestAlgorithm 计算得出的的文件摘要 */
  var digest: String
  
  /** 调用结果 */
  var errMsg: String
  
  /** 文件大小，单位：B */
  var size: Double
}
object GetFileInfoSuccess {
  
  @scala.inline
  def apply(digest: String, errMsg: String, size: Double): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
  
  @scala.inline
  implicit class GetFileInfoSuccessMutableBuilder[Self <: GetFileInfoSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
