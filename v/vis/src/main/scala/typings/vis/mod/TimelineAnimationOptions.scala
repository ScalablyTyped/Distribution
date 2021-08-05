package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineAnimationOptions extends StObject {
  
  var animation: js.UndefOr[TimelineAnimationType] = js.undefined
}
object TimelineAnimationOptions {
  
  inline def apply(): TimelineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineAnimationOptions]
  }
  
  extension [Self <: TimelineAnimationOptions](x: Self) {
    
    inline def setAnimation(value: TimelineAnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
