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
  
  inline def apply(): LazyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyOptions]
  }
  
  extension [Self <: LazyOptions](x: Self) {
    
    inline def setElementClass(value: String): Self = StObject.set(x, "elementClass", value.asInstanceOf[js.Any])
    
    inline def setElementClassUndefined: Self = StObject.set(x, "elementClass", js.undefined)
    
    inline def setLoadOnTransitionStart(value: Boolean): Self = StObject.set(x, "loadOnTransitionStart", value.asInstanceOf[js.Any])
    
    inline def setLoadOnTransitionStartUndefined: Self = StObject.set(x, "loadOnTransitionStart", js.undefined)
    
    inline def setLoadPrevNext(value: Boolean): Self = StObject.set(x, "loadPrevNext", value.asInstanceOf[js.Any])
    
    inline def setLoadPrevNextAmount(value: Double): Self = StObject.set(x, "loadPrevNextAmount", value.asInstanceOf[js.Any])
    
    inline def setLoadPrevNextAmountUndefined: Self = StObject.set(x, "loadPrevNextAmount", js.undefined)
    
    inline def setLoadPrevNextUndefined: Self = StObject.set(x, "loadPrevNext", js.undefined)
    
    inline def setLoadedClass(value: String): Self = StObject.set(x, "loadedClass", value.asInstanceOf[js.Any])
    
    inline def setLoadedClassUndefined: Self = StObject.set(x, "loadedClass", js.undefined)
    
    inline def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
    
    inline def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
    
    inline def setPreloaderClass(value: String): Self = StObject.set(x, "preloaderClass", value.asInstanceOf[js.Any])
    
    inline def setPreloaderClassUndefined: Self = StObject.set(x, "preloaderClass", js.undefined)
  }
}
