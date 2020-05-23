package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserGameData extends js.Object {
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
  @scala.inline
  def apply(KVDataList: js.Array[KVData], avatarUrl: String, nickname: String, openid: String): UserGameData = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any], avatarUrl = avatarUrl.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], openid = openid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGameData]
  }
}

