package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends js.Object {
  
  /**
    * 可能对游戏感兴趣的未注册好友名单
    */
  var list: js.Array[AvatarUrl] = js.native
}
object List {
  
  @scala.inline
  def apply(list: js.Array[AvatarUrl]): List = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
    
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
    def setListVarargs(value: AvatarUrl*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[AvatarUrl]): Self = this.set("list", value.asInstanceOf[js.Any])
  }
}
