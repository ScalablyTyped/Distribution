package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBarTitleOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  动态设置当前页面的标题
  var title: String
}
object NavigationBarTitleOptions {
  
  @scala.inline
  def apply(title: String): NavigationBarTitleOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarTitleOptions]
  }
  
  @scala.inline
  implicit class NavigationBarTitleOptionsMutableBuilder[Self <: NavigationBarTitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
