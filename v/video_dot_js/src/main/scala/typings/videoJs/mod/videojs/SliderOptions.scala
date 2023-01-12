package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderOptions
  extends StObject
     with ComponentOptions {
  
  /**
    * Set property names to bar to match with the child Slider class is looking for
    */
  var barName: js.UndefOr[String] = js.undefined
  
  /**
    * Set a horizontal or vertical class on the slider depending on the slider type
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object SliderOptions {
  
  inline def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
    inline def setBarName(value: String): Self = StObject.set(x, "barName", value.asInstanceOf[js.Any])
    
    inline def setBarNameUndefined: Self = StObject.set(x, "barName", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
