package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomOptions extends StObject {
  
  var containerClass: js.UndefOr[String] = js.undefined
  
  var maxRatio: js.UndefOr[Double] = js.undefined
  
  var minRatio: js.UndefOr[Double] = js.undefined
  
  var toggle: js.UndefOr[Boolean] = js.undefined
  
  var zoomedSlideClass: js.UndefOr[String] = js.undefined
}
object ZoomOptions {
  
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  
  @scala.inline
  implicit class ZoomOptionsMutableBuilder[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
    
    @scala.inline
    def setMaxRatio(value: Double): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRatioUndefined: Self = StObject.set(x, "maxRatio", js.undefined)
    
    @scala.inline
    def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRatioUndefined: Self = StObject.set(x, "minRatio", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    @scala.inline
    def setZoomedSlideClass(value: String): Self = StObject.set(x, "zoomedSlideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomedSlideClassUndefined: Self = StObject.set(x, "zoomedSlideClass", js.undefined)
  }
}
