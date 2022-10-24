package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: typings.std.Element
  
  var currentPage: Double
  
  var maxPagesToShow: Double
  
  var showFirstPage: Boolean
  
  var showLastPage: Boolean
  
  var totalPages: Double
}
object Container {
  
  inline def apply(
    container: typings.std.Element,
    currentPage: Double,
    maxPagesToShow: Double,
    showFirstPage: Boolean,
    showLastPage: Boolean,
    totalPages: Double
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], maxPagesToShow = maxPagesToShow.asInstanceOf[js.Any], showFirstPage = showFirstPage.asInstanceOf[js.Any], showLastPage = showLastPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: typings.std.Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setMaxPagesToShow(value: Double): Self = StObject.set(x, "maxPagesToShow", value.asInstanceOf[js.Any])
    
    inline def setShowFirstPage(value: Boolean): Self = StObject.set(x, "showFirstPage", value.asInstanceOf[js.Any])
    
    inline def setShowLastPage(value: Boolean): Self = StObject.set(x, "showLastPage", value.asInstanceOf[js.Any])
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
  }
}
