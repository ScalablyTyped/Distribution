package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarAnimationOptions extends CommonCallbackOptions {
  
  //  是否需要动画效果
  var animation: Boolean = js.native
}
object TabBarAnimationOptions {
  
  @scala.inline
  def apply(animation: Boolean): TabBarAnimationOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarAnimationOptions]
  }
  
  @scala.inline
  implicit class TabBarAnimationOptionsMutableBuilder[Self <: TabBarAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
  }
}
