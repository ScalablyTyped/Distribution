package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialLoad extends StObject {
  
  var hasMore: Boolean
  
  var initialLoad: Boolean
  
  var isReverse: Boolean
  
  var pageStart: Double
  
  var scrollElement: Null
  
  var threshold: Double
  
  var useWindow: Boolean
}
object InitialLoad {
  
  inline def apply(
    hasMore: Boolean,
    initialLoad: Boolean,
    isReverse: Boolean,
    pageStart: Double,
    scrollElement: Null,
    threshold: Double,
    useWindow: Boolean
  ): InitialLoad = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], initialLoad = initialLoad.asInstanceOf[js.Any], isReverse = isReverse.asInstanceOf[js.Any], pageStart = pageStart.asInstanceOf[js.Any], scrollElement = scrollElement.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], useWindow = useWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialLoad]
  }
  
  extension [Self <: InitialLoad](x: Self) {
    
    inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    
    inline def setInitialLoad(value: Boolean): Self = StObject.set(x, "initialLoad", value.asInstanceOf[js.Any])
    
    inline def setIsReverse(value: Boolean): Self = StObject.set(x, "isReverse", value.asInstanceOf[js.Any])
    
    inline def setPageStart(value: Double): Self = StObject.set(x, "pageStart", value.asInstanceOf[js.Any])
    
    inline def setScrollElement(value: Null): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setUseWindow(value: Boolean): Self = StObject.set(x, "useWindow", value.asInstanceOf[js.Any])
  }
}
