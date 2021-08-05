package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualOptions extends StObject {
  
  var addSlidesAfter: js.UndefOr[Double] = js.undefined
  
  var addSlidesBefore: js.UndefOr[Double] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var renderExternal: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
  
  var renderSlide: js.UndefOr[js.Function2[/* slide */ js.Any, /* index */ js.Any, js.Any]] = js.undefined
  
  var slides: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object VirtualOptions {
  
  inline def apply(): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualOptions]
  }
  
  extension [Self <: VirtualOptions](x: Self) {
    
    inline def setAddSlidesAfter(value: Double): Self = StObject.set(x, "addSlidesAfter", value.asInstanceOf[js.Any])
    
    inline def setAddSlidesAfterUndefined: Self = StObject.set(x, "addSlidesAfter", js.undefined)
    
    inline def setAddSlidesBefore(value: Double): Self = StObject.set(x, "addSlidesBefore", value.asInstanceOf[js.Any])
    
    inline def setAddSlidesBeforeUndefined: Self = StObject.set(x, "addSlidesBefore", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setRenderExternal(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "renderExternal", js.Any.fromFunction1(value))
    
    inline def setRenderExternalUndefined: Self = StObject.set(x, "renderExternal", js.undefined)
    
    inline def setRenderSlide(value: (/* slide */ js.Any, /* index */ js.Any) => js.Any): Self = StObject.set(x, "renderSlide", js.Any.fromFunction2(value))
    
    inline def setRenderSlideUndefined: Self = StObject.set(x, "renderSlide", js.undefined)
    
    inline def setSlides(value: js.Array[js.Any]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    
    inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
    
    inline def setSlidesVarargs(value: js.Any*): Self = StObject.set(x, "slides", js.Array(value :_*))
  }
}
