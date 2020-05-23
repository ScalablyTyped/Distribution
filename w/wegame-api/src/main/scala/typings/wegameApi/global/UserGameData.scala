package typings.wegameApi.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UserGameData")
@js.native
class UserGameData ()
  extends typings.wegameApi.UserGameData {
  /**
    * 用户的托管 KV 数据列表
    */
  /* CompleteClass */
  override var KVDataList: js.Array[typings.wegameApi.KVData] = js.native
  /**
    * 用户的微信头像 url
    */
  /* CompleteClass */
  override var avatarUrl: String = js.native
  /**
    * 用户的微信昵称
    */
  /* CompleteClass */
  override var nickname: String = js.native
  /**
    * 用户的openid
    */
  /* CompleteClass */
  override var openid: String = js.native
}

