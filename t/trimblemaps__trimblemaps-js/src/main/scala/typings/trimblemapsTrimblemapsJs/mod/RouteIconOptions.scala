package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteIconOptions extends StObject {
  
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var opacity: Double
  
  var size: js.UndefOr[Double] = js.undefined
  
  var textOpacity: Double
  
  var url: js.UndefOr[String] = js.undefined
}
object RouteIconOptions {
  
  inline def apply(opacity: Double, textOpacity: Double): RouteIconOptions = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], textOpacity = textOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteIconOptions] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTextOpacity(value: Double): Self = StObject.set(x, "textOpacity", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
