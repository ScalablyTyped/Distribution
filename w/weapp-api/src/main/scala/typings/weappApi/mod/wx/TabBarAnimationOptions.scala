package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBarAnimationOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  是否需要动画效果
  var animation: Boolean
}
object TabBarAnimationOptions {
  
  inline def apply(animation: Boolean): TabBarAnimationOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabBarAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
  }
}
