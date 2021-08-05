package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 开放接口-----用户信息
trait UserInfo extends StObject {
  
  var avatarUrl: String
  
  var city: String
  
  var country: String
  
  var gender: Double
  
  var nickName: String
  
  var province: String
}
object UserInfo {
  
  inline def apply(
    avatarUrl: String,
    city: String,
    country: String,
    gender: Double,
    nickName: String,
    province: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  
  extension [Self <: UserInfo](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setGender(value: Double): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
  }
}
