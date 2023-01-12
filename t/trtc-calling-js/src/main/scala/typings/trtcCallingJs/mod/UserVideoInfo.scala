package typings.trtcCallingJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 远端用户开启/关闭了摄像头返回参数类型 */
trait UserVideoInfo
  extends StObject
     with UserInfo {
  
  var isVideoAvailable: Boolean
}
object UserVideoInfo {
  
  inline def apply(isVideoAvailable: Boolean, userID: String): UserVideoInfo = {
    val __obj = js.Dynamic.literal(isVideoAvailable = isVideoAvailable.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserVideoInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserVideoInfo] (val x: Self) extends AnyVal {
    
    inline def setIsVideoAvailable(value: Boolean): Self = StObject.set(x, "isVideoAvailable", value.asInstanceOf[js.Any])
  }
}
