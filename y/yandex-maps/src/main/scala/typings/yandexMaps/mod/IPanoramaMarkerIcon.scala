package typings.yandexMaps.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaMarkerIcon extends StObject {
  
  var image: HTMLCanvasElement | HTMLImageElement
  
  var offset: js.Array[Double]
}
object IPanoramaMarkerIcon {
  
  inline def apply(image: HTMLCanvasElement | HTMLImageElement, offset: js.Array[Double]): IPanoramaMarkerIcon = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaMarkerIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPanoramaMarkerIcon] (val x: Self) extends AnyVal {
    
    inline def setImage(value: HTMLCanvasElement | HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
  }
}
