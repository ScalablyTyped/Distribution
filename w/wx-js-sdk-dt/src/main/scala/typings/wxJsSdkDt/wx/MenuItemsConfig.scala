package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemsConfig extends WxBaseRequestConfig {
  
  /**
    * 要隐藏/显示的菜单项，只能隐藏“传播类”和“保护类”按钮
    */
  var menuList: js.Array[String] = js.native
}
object MenuItemsConfig {
  
  @scala.inline
  def apply(menuList: js.Array[String]): MenuItemsConfig = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemsConfig]
  }
  
  @scala.inline
  implicit class MenuItemsConfigOps[Self <: MenuItemsConfig] (val x: Self) extends AnyVal {
    
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
    def setMenuListVarargs(value: String*): Self = this.set("menuList", js.Array(value :_*))
    
    @scala.inline
    def setMenuList(value: js.Array[String]): Self = this.set("menuList", value.asInstanceOf[js.Any])
  }
}
