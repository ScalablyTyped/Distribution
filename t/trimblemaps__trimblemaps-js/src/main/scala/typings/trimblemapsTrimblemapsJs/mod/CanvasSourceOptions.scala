package typings.trimblemapsTrimblemapsJs.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasSourceOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var canvas: String | HTMLCanvasElement
  
  var coordinates: js.Array[js.Array[Double]]
}
object CanvasSourceOptions {
  
  inline def apply(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]]): CanvasSourceOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasSourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasSourceOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setCanvas(value: String | HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value*))
  }
}
