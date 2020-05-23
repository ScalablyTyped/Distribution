package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  /**
    * 可能对游戏感兴趣的未注册好友名单
    */
  var list: js.Array[AvatarUrl]
}

object List {
  @scala.inline
  def apply(list: js.Array[AvatarUrl]): List = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

