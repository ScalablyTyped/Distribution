package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasMore extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var data: Requireable[js.Array[Any]]
  
  var hasMore: Requireable[Boolean]
  
  var initialLoad: Requireable[Boolean]
  
  var isReverse: Requireable[Boolean]
  
  var loadMore: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var loader: Requireable[ReactNodeLike]
  
  var pageStart: Requireable[Double]
  
  var scrollElement: Requireable[js.Object]
  
  var threshold: Requireable[Double]
  
  var useWindow: Requireable[Boolean]
}
object HasMore {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    data: Requireable[js.Array[Any]],
    hasMore: Requireable[Boolean],
    initialLoad: Requireable[Boolean],
    isReverse: Requireable[Boolean],
    loadMore: Validator[js.Function1[/* repeated */ Any, Any]],
    loader: Requireable[ReactNodeLike],
    pageStart: Requireable[Double],
    scrollElement: Requireable[js.Object],
    threshold: Requireable[Double],
    useWindow: Requireable[Boolean]
  ): HasMore = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], initialLoad = initialLoad.asInstanceOf[js.Any], isReverse = isReverse.asInstanceOf[js.Any], loadMore = loadMore.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], pageStart = pageStart.asInstanceOf[js.Any], scrollElement = scrollElement.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], useWindow = useWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasMore]
  }
  
  extension [Self <: HasMore](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setData(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHasMore(value: Requireable[Boolean]): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    
    inline def setInitialLoad(value: Requireable[Boolean]): Self = StObject.set(x, "initialLoad", value.asInstanceOf[js.Any])
    
    inline def setIsReverse(value: Requireable[Boolean]): Self = StObject.set(x, "isReverse", value.asInstanceOf[js.Any])
    
    inline def setLoadMore(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "loadMore", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setPageStart(value: Requireable[Double]): Self = StObject.set(x, "pageStart", value.asInstanceOf[js.Any])
    
    inline def setScrollElement(value: Requireable[js.Object]): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Requireable[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setUseWindow(value: Requireable[Boolean]): Self = StObject.set(x, "useWindow", value.asInstanceOf[js.Any])
  }
}
