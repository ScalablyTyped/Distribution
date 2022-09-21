package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserGameData extends StObject {
  
  /**
    * 用户的托管 KV 数据列表
    */
  var KVDataList: js.Array[KVData]
  
  /**
    * 用户的微信头像 url
    */
  var avatarUrl: String
  
  /**
    * 用户的微信昵称
    */
  var nickname: String
  
  /**
    * 用户的openid
    */
  var openid: String
}
object UserGameData {
  
  inline def apply(KVDataList: js.Array[KVData], avatarUrl: String, nickname: String, openid: String): UserGameData = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any], avatarUrl = avatarUrl.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], openid = openid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGameData]
  }
  
  extension [Self <: UserGameData](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setKVDataList(value: js.Array[KVData]): Self = StObject.set(x, "KVDataList", value.asInstanceOf[js.Any])
    
    inline def setKVDataListVarargs(value: KVData*): Self = StObject.set(x, "KVDataList", js.Array(value*))
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
  }
}
