package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowTabBarOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 是否需要动画效果，默认无 */
  var aniamtion: js.UndefOr[Boolean] = js.undefined
}
object ShowTabBarOptions {
  
  @scala.inline
  def apply(): ShowTabBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowTabBarOptions]
  }
  
  @scala.inline
  implicit class ShowTabBarOptionsMutableBuilder[Self <: ShowTabBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAniamtion(value: Boolean): Self = StObject.set(x, "aniamtion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAniamtionUndefined: Self = StObject.set(x, "aniamtion", js.undefined)
  }
}
