package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPage extends StObject {
  
  var currentPage: Double
  
  var maxPagesToShow: Double
  
  var showFirstPage: Boolean
  
  var showLastPage: Boolean
  
  var totalPages: Double
}
object CurrentPage {
  
  @scala.inline
  def apply(
    currentPage: Double,
    maxPagesToShow: Double,
    showFirstPage: Boolean,
    showLastPage: Boolean,
    totalPages: Double
  ): CurrentPage = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], maxPagesToShow = maxPagesToShow.asInstanceOf[js.Any], showFirstPage = showFirstPage.asInstanceOf[js.Any], showLastPage = showLastPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPage]
  }
  
  @scala.inline
  implicit class CurrentPageMutableBuilder[Self <: CurrentPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPagesToShow(value: Double): Self = StObject.set(x, "maxPagesToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFirstPage(value: Boolean): Self = StObject.set(x, "showFirstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLastPage(value: Boolean): Self = StObject.set(x, "showLastPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
  }
}
