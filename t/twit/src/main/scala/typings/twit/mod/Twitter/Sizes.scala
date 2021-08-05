package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sizes extends StObject {
  
  var large: Size
  
  var medium: Size
  
  var small: Size
  
  var thumb: Size
}
object Sizes {
  
  inline def apply(large: Size, medium: Size, small: Size, thumb: Size): Sizes = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizes]
  }
  
  extension [Self <: Sizes](x: Self) {
    
    inline def setLarge(value: Size): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: Size): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: Size): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setThumb(value: Size): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
  }
}
