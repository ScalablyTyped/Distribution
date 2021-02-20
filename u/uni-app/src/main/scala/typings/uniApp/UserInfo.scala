package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInfo extends StObject {
  
  /**
    * 用户头像
    */
  var avatarUrl: js.UndefOr[String] = js.native
  
  /**
    * 用户昵称
    */
  var nickname: js.UndefOr[String] = js.native
  
  /**
    * 该服务商唯一用户标识
    */
  var openid: js.UndefOr[String] = js.native
}
object UserInfo {
  
  @scala.inline
  def apply(): UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInfo]
  }
  
  @scala.inline
  implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenidUndefined: Self = StObject.set(x, "openid", js.undefined)
  }
}
