package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LazyOptions extends StObject {
  
  var elementClass: js.UndefOr[String] = js.undefined
  
  var loadOnTransitionStart: js.UndefOr[Boolean] = js.undefined
  
  var loadPrevNext: js.UndefOr[Boolean] = js.undefined
  
  var loadPrevNextAmount: js.UndefOr[Double] = js.undefined
  
  var loadedClass: js.UndefOr[String] = js.undefined
  
  var loadingClass: js.UndefOr[String] = js.undefined
  
  var preloaderClass: js.UndefOr[String] = js.undefined
}
object LazyOptions {
  
  @scala.inline
  def apply(): LazyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyOptions]
  }
  
  @scala.inline
  implicit class LazyOptionsMutableBuilder[Self <: LazyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementClass(value: String): Self = StObject.set(x, "elementClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementClassUndefined: Self = StObject.set(x, "elementClass", js.undefined)
    
    @scala.inline
    def setLoadOnTransitionStart(value: Boolean): Self = StObject.set(x, "loadOnTransitionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadOnTransitionStartUndefined: Self = StObject.set(x, "loadOnTransitionStart", js.undefined)
    
    @scala.inline
    def setLoadPrevNext(value: Boolean): Self = StObject.set(x, "loadPrevNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadPrevNextAmount(value: Double): Self = StObject.set(x, "loadPrevNextAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadPrevNextAmountUndefined: Self = StObject.set(x, "loadPrevNextAmount", js.undefined)
    
    @scala.inline
    def setLoadPrevNextUndefined: Self = StObject.set(x, "loadPrevNext", js.undefined)
    
    @scala.inline
    def setLoadedClass(value: String): Self = StObject.set(x, "loadedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedClassUndefined: Self = StObject.set(x, "loadedClass", js.undefined)
    
    @scala.inline
    def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
    
    @scala.inline
    def setPreloaderClass(value: String): Self = StObject.set(x, "preloaderClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloaderClassUndefined: Self = StObject.set(x, "preloaderClass", js.undefined)
  }
}
