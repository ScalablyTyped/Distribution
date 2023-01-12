package typings.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: Double
  
  var offset: Double
  
  var slides: js.Array[Any]
  
  var slidesGrid: js.Array[Double]
  
  var to: Double
}
object From {
  
  inline def apply(from: Double, offset: Double, slides: js.Array[Any], slidesGrid: js.Array[Double], to: Double): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], slides = slides.asInstanceOf[js.Any], slidesGrid = slidesGrid.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSlides(value: js.Array[Any]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    
    inline def setSlidesGrid(value: js.Array[Double]): Self = StObject.set(x, "slidesGrid", value.asInstanceOf[js.Any])
    
    inline def setSlidesGridVarargs(value: Double*): Self = StObject.set(x, "slidesGrid", js.Array(value*))
    
    inline def setSlidesVarargs(value: Any*): Self = StObject.set(x, "slides", js.Array(value*))
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
