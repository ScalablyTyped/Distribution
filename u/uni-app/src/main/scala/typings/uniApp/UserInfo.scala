package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInfo extends js.Object {
  
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
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvatarUrl(value: String): Self = this.set("avatarUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatarUrl: Self = this.set("avatarUrl", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    
    @scala.inline
    def setOpenid(value: String): Self = this.set("openid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenid: Self = this.set("openid", js.undefined)
  }
}
