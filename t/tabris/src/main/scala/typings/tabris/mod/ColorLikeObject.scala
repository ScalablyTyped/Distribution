package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorLikeObject
  extends StObject
     with _ColorValue {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var blue: Double
  
  var green: Double
  
  var red: Double
}
object ColorLikeObject {
  
  @scala.inline
  def apply(blue: Double, green: Double, red: Double): ColorLikeObject = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorLikeObject]
  }
  
  @scala.inline
  implicit class ColorLikeObjectMutableBuilder[Self <: ColorLikeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
