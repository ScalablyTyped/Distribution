package typings.titanium

import typings.titanium.Titanium.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object consisting of a color and an offset.
  */
@js.native
trait GradientColorRef extends StObject {
  
  /**
    * Color value at this point in the gradient, as a color name or hex triplet.
    */
  var color: js.UndefOr[String | Color] = js.native
  
  /**
    * The color's normalized position within the gradient, ranging from 0 (start) to 1 (end).
    */
  var offset: js.UndefOr[Double] = js.native
}
object GradientColorRef {
  
  @scala.inline
  def apply(): GradientColorRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientColorRef]
  }
  
  @scala.inline
  implicit class GradientColorRefMutableBuilder[Self <: GradientColorRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
