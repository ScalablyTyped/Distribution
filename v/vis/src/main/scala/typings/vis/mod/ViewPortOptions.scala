package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewPortOptions extends StObject {
  
  /**
    * For animation you can either use a Boolean to use it with the default options or
    * disable it or you can define the duration (in milliseconds) and easing function manually.
    */
  var animation: js.UndefOr[AnimationOptions | Boolean] = js.native
  
  /**
    * The offset (in DOM units) is how many pixels from the center the view is focussed.
    * Default value is {x:0,y:0}
    */
  var offset: js.UndefOr[Position] = js.native
  
  /**
    * The scale is the target zoomlevel.
    * Default value is 1.0.
    */
  var scale: js.UndefOr[Double] = js.native
}
object ViewPortOptions {
  
  @scala.inline
  def apply(): ViewPortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPortOptions]
  }
  
  @scala.inline
  implicit class ViewPortOptionsMutableBuilder[Self <: ViewPortOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: AnimationOptions | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
