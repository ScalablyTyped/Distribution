package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  var full: String
  
  var raw: String
  
  var regular: String
  
  var small: String
  
  var thumb: String
}
object Full {
  
  inline def apply(full: String, raw: String, regular: String, small: String, thumb: String): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
    
    inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
  }
}
