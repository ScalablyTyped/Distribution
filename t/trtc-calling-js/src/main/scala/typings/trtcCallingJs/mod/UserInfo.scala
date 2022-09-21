package typings.trtcCallingJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 共有参数类型 */
trait UserInfo extends StObject {
  
  var userID: String
}
object UserInfo {
  
  inline def apply(userID: String): UserInfo = {
    val __obj = js.Dynamic.literal(userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  
  extension [Self <: UserInfo](x: Self) {
    
    inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
  }
}
