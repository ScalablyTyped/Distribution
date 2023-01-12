package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenIdList extends StObject {
  
  /**
    * 错误码
    */
  var errCode: Double
  
  /**
    * 调用结果
    */
  var errMsg: String
  
  /**
    * 在此通话中的成员 openId 名单
    */
  var openIdList: js.Array[String]
}
object OpenIdList {
  
  inline def apply(errCode: Double, errMsg: String, openIdList: js.Array[String]): OpenIdList = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], openIdList = openIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIdList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenIdList] (val x: Self) extends AnyVal {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setOpenIdList(value: js.Array[String]): Self = StObject.set(x, "openIdList", value.asInstanceOf[js.Any])
    
    inline def setOpenIdListVarargs(value: String*): Self = StObject.set(x, "openIdList", js.Array(value*))
  }
}
