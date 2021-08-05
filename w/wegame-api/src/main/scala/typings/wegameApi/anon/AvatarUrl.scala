package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvatarUrl extends StObject {
  
  /**
    * 用户的微信头像 url
    */
  var avatarUrl: String
  
  /**
    * 用户的微信昵称
    */
  var nickname: String
  
  /**
    * 用户 openid
    */
  var openid: String
}
object AvatarUrl {
  
  inline def apply(avatarUrl: String, nickname: String, openid: String): AvatarUrl = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], openid = openid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarUrl]
  }
  
  extension [Self <: AvatarUrl](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
  }
}
