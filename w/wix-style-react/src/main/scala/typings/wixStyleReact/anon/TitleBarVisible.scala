package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleBarVisible extends StObject {
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var titleBarVisible: js.UndefOr[Boolean] = js.undefined
}
object TitleBarVisible {
  
  @scala.inline
  def apply(): TitleBarVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleBarVisible]
  }
  
  @scala.inline
  implicit class TitleBarVisibleMutableBuilder[Self <: TitleBarVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    @scala.inline
    def setTitleBarVisible(value: Boolean): Self = StObject.set(x, "titleBarVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBarVisibleUndefined: Self = StObject.set(x, "titleBarVisible", js.undefined)
  }
}
