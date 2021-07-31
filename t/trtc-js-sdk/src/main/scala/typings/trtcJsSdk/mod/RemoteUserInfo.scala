package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteUserInfo extends StObject {
  
  var userId: String
}
object RemoteUserInfo {
  
  @scala.inline
  def apply(userId: String): RemoteUserInfo = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteUserInfo]
  }
  
  @scala.inline
  implicit class RemoteUserInfoMutableBuilder[Self <: RemoteUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
