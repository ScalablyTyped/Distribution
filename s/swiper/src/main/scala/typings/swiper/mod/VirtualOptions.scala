package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualOptions extends StObject {
  
  var addSlidesAfter: js.UndefOr[Double] = js.native
  
  var addSlidesBefore: js.UndefOr[Double] = js.native
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var renderExternal: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  var renderSlide: js.UndefOr[js.Function2[/* slide */ js.Any, /* index */ js.Any, _]] = js.native
  
  var slides: js.UndefOr[js.Array[_]] = js.native
}
object VirtualOptions {
  
  @scala.inline
  def apply(): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualOptions]
  }
  
  @scala.inline
  implicit class VirtualOptionsMutableBuilder[Self <: VirtualOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSlidesAfter(value: Double): Self = StObject.set(x, "addSlidesAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSlidesAfterUndefined: Self = StObject.set(x, "addSlidesAfter", js.undefined)
    
    @scala.inline
    def setAddSlidesBefore(value: Double): Self = StObject.set(x, "addSlidesBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSlidesBeforeUndefined: Self = StObject.set(x, "addSlidesBefore", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setRenderExternal(value: /* data */ js.Any => _): Self = StObject.set(x, "renderExternal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderExternalUndefined: Self = StObject.set(x, "renderExternal", js.undefined)
    
    @scala.inline
    def setRenderSlide(value: (/* slide */ js.Any, /* index */ js.Any) => _): Self = StObject.set(x, "renderSlide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderSlideUndefined: Self = StObject.set(x, "renderSlide", js.undefined)
    
    @scala.inline
    def setSlides(value: js.Array[_]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
    
    @scala.inline
    def setSlidesVarargs(value: js.Any*): Self = StObject.set(x, "slides", js.Array(value :_*))
  }
}
