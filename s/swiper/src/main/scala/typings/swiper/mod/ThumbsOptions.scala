package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThumbsOptions extends StObject {
  
  var autoScrollOffset: js.UndefOr[Double] = js.native
  
  var multipleActiveThumbs: js.UndefOr[Boolean] = js.native
  
  var slideThumbActiveClass: js.UndefOr[String] = js.native
  
  var swiper: js.UndefOr[Swiper] = js.native
  
  var thumbsContainerClass: js.UndefOr[String] = js.native
}
object ThumbsOptions {
  
  @scala.inline
  def apply(): ThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbsOptions]
  }
  
  @scala.inline
  implicit class ThumbsOptionsMutableBuilder[Self <: ThumbsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScrollOffset(value: Double): Self = StObject.set(x, "autoScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollOffsetUndefined: Self = StObject.set(x, "autoScrollOffset", js.undefined)
    
    @scala.inline
    def setMultipleActiveThumbs(value: Boolean): Self = StObject.set(x, "multipleActiveThumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleActiveThumbsUndefined: Self = StObject.set(x, "multipleActiveThumbs", js.undefined)
    
    @scala.inline
    def setSlideThumbActiveClass(value: String): Self = StObject.set(x, "slideThumbActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideThumbActiveClassUndefined: Self = StObject.set(x, "slideThumbActiveClass", js.undefined)
    
    @scala.inline
    def setSwiper(value: Swiper): Self = StObject.set(x, "swiper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwiperUndefined: Self = StObject.set(x, "swiper", js.undefined)
    
    @scala.inline
    def setThumbsContainerClass(value: String): Self = StObject.set(x, "thumbsContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbsContainerClassUndefined: Self = StObject.set(x, "thumbsContainerClass", js.undefined)
  }
}
