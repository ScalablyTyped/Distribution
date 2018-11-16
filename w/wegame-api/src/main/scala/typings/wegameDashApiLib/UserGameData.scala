package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UserGameData")
@js.native
class UserGameData () extends js.Object {
  /**
       * 用户的托管 KV 数据列表
       */
  var KVDataList: js.Array[KVData] = js.native
  /**
       * 用户的微信头像 url
       */
  var avatarUrl: java.lang.String = js.native
  /**
       * 用户的微信昵称
       */
  var nickname: java.lang.String = js.native
  /**
       * 用户的openid
       */
  var openid: java.lang.String = js.native
}

