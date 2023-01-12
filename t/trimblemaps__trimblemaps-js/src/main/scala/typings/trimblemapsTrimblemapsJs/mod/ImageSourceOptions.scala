package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSourceOptions extends StObject {
  
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ImageSourceOptions {
  
  inline def apply(): ImageSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageSourceOptions] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
