package typings.vis.anon

import typings.vis.mod.TimelineAnimationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animation: TimelineAnimationOptions
  
  var focus: Boolean
}
object Animation {
  
  inline def apply(animation: TimelineAnimationOptions, focus: Boolean): Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setAnimation(value: TimelineAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
  }
}
