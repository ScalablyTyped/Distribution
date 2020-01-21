package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonList extends js.Object {
  /**
    * 可能对游戏感兴趣的未注册好友名单
    */
  var list: js.Array[AnonAvatarUrl]
}

object AnonList {
  @scala.inline
  def apply(list: js.Array[AnonAvatarUrl]): AnonList = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonList]
  }
}

