package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_List extends js.Object {
  /**
    * 可能对游戏感兴趣的未注册好友名单
    */
  var list: js.Array[Anon_AvatarUrl]
}

object Anon_List {
  @scala.inline
  def apply(list: js.Array[Anon_AvatarUrl]): Anon_List = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_List]
  }
}

