package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemsConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 要隐藏/显示的菜单项，只能隐藏“传播类”和“保护类”按钮
    */
  var menuList: js.Array[String]
}
object MenuItemsConfig {
  
  @scala.inline
  def apply(menuList: js.Array[String]): MenuItemsConfig = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemsConfig]
  }
  
  @scala.inline
  implicit class MenuItemsConfigMutableBuilder[Self <: MenuItemsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenuList(value: js.Array[String]): Self = StObject.set(x, "menuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuListVarargs(value: String*): Self = StObject.set(x, "menuList", js.Array(value :_*))
  }
}
