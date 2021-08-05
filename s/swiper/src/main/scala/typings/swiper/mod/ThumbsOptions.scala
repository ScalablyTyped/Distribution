package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbsOptions extends StObject {
  
  var autoScrollOffset: js.UndefOr[Double] = js.undefined
  
  var multipleActiveThumbs: js.UndefOr[Boolean] = js.undefined
  
  var slideThumbActiveClass: js.UndefOr[String] = js.undefined
  
  var swiper: js.UndefOr[Swiper] = js.undefined
  
  var thumbsContainerClass: js.UndefOr[String] = js.undefined
}
object ThumbsOptions {
  
  inline def apply(): ThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbsOptions]
  }
  
  extension [Self <: ThumbsOptions](x: Self) {
    
    inline def setAutoScrollOffset(value: Double): Self = StObject.set(x, "autoScrollOffset", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollOffsetUndefined: Self = StObject.set(x, "autoScrollOffset", js.undefined)
    
    inline def setMultipleActiveThumbs(value: Boolean): Self = StObject.set(x, "multipleActiveThumbs", value.asInstanceOf[js.Any])
    
    inline def setMultipleActiveThumbsUndefined: Self = StObject.set(x, "multipleActiveThumbs", js.undefined)
    
    inline def setSlideThumbActiveClass(value: String): Self = StObject.set(x, "slideThumbActiveClass", value.asInstanceOf[js.Any])
    
    inline def setSlideThumbActiveClassUndefined: Self = StObject.set(x, "slideThumbActiveClass", js.undefined)
    
    inline def setSwiper(value: Swiper): Self = StObject.set(x, "swiper", value.asInstanceOf[js.Any])
    
    inline def setSwiperUndefined: Self = StObject.set(x, "swiper", js.undefined)
    
    inline def setThumbsContainerClass(value: String): Self = StObject.set(x, "thumbsContainerClass", value.asInstanceOf[js.Any])
    
    inline def setThumbsContainerClassUndefined: Self = StObject.set(x, "thumbsContainerClass", js.undefined)
  }
}
