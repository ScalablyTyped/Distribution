package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationSize extends StObject {
  
  var animationSize: Unit
}
object AnimationSize {
  
  inline def apply(animationSize: Unit): AnimationSize = {
    val __obj = js.Dynamic.literal(animationSize = animationSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSize]
  }
  
  extension [Self <: AnimationSize](x: Self) {
    
    inline def setAnimationSize(value: Unit): Self = StObject.set(x, "animationSize", value.asInstanceOf[js.Any])
  }
}
