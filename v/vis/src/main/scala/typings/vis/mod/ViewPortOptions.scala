package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPortOptions extends StObject {
  
  /**
    * For animation you can either use a Boolean to use it with the default options or
    * disable it or you can define the duration (in milliseconds) and easing function manually.
    */
  var animation: js.UndefOr[AnimationOptions | Boolean] = js.undefined
  
  /**
    * The offset (in DOM units) is how many pixels from the center the view is focussed.
    * Default value is {x:0,y:0}
    */
  var offset: js.UndefOr[Position] = js.undefined
  
  /**
    * The scale is the target zoomlevel.
    * Default value is 1.0.
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object ViewPortOptions {
  
  inline def apply(): ViewPortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPortOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewPortOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: AnimationOptions | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
