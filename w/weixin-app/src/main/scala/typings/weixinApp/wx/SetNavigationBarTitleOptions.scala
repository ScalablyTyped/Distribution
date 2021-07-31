package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 界面-----设置导航条
trait SetNavigationBarTitleOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 页面标题 */
  var title: String
}
object SetNavigationBarTitleOptions {
  
  @scala.inline
  def apply(title: String): SetNavigationBarTitleOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarTitleOptions]
  }
  
  @scala.inline
  implicit class SetNavigationBarTitleOptionsMutableBuilder[Self <: SetNavigationBarTitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
