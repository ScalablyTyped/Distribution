package typings.trtcCallingJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 远端用户开启/关闭了麦克风返回参数类型 */
trait UserAudioInfo
  extends StObject
     with UserInfo {
  
  var isAudioAvailable: Boolean
}
object UserAudioInfo {
  
  inline def apply(isAudioAvailable: Boolean, userID: String): UserAudioInfo = {
    val __obj = js.Dynamic.literal(isAudioAvailable = isAudioAvailable.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAudioInfo]
  }
  
  extension [Self <: UserAudioInfo](x: Self) {
    
    inline def setIsAudioAvailable(value: Boolean): Self = StObject.set(x, "isAudioAvailable", value.asInstanceOf[js.Any])
  }
}
