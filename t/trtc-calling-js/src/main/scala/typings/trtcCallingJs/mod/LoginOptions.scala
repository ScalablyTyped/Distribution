package typings.trtcCallingJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 登录参数类型 */
trait LoginOptions
  extends StObject
     with UserInfo {
  
  var userSig: String
}
object LoginOptions {
  
  inline def apply(userID: String, userSig: String): LoginOptions = {
    val __obj = js.Dynamic.literal(userID = userID.asInstanceOf[js.Any], userSig = userSig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginOptions]
  }
  
  extension [Self <: LoginOptions](x: Self) {
    
    inline def setUserSig(value: String): Self = StObject.set(x, "userSig", value.asInstanceOf[js.Any])
  }
}
