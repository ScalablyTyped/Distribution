package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGameData extends js.Object {
  /**
    * 用户的托管 KV 数据列表
    */
  var KVDataList: js.Array[KVData] = js.native
  /**
    * 用户的微信头像 url
    */
  var avatarUrl: String = js.native
  /**
    * 用户的微信昵称
    */
  var nickname: String = js.native
  /**
    * 用户的openid
    */
  var openid: String = js.native
}

object UserGameData {
  @scala.inline
  def apply(KVDataList: js.Array[KVData], avatarUrl: String, nickname: String, openid: String): UserGameData = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any], avatarUrl = avatarUrl.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], openid = openid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGameData]
  }
  @scala.inline
  implicit class UserGameDataOps[Self <: UserGameData] (val x: Self) extends AnyVal {
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
    def setKVDataListVarargs(value: KVData*): Self = this.set("KVDataList", js.Array(value :_*))
    @scala.inline
    def setKVDataList(value: js.Array[KVData]): Self = this.set("KVDataList", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatarUrl(value: String): Self = this.set("avatarUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenid(value: String): Self = this.set("openid", value.asInstanceOf[js.Any])
  }
  
}

