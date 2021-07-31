package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxPagesToShow extends StObject {
  
  var currentPage: Double
  
  var maxPagesToShow: Double
  
  var totalPages: Double
}
object MaxPagesToShow {
  
  @scala.inline
  def apply(currentPage: Double, maxPagesToShow: Double, totalPages: Double): MaxPagesToShow = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], maxPagesToShow = maxPagesToShow.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPagesToShow]
  }
  
  @scala.inline
  implicit class MaxPagesToShowMutableBuilder[Self <: MaxPagesToShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPagesToShow(value: Double): Self = StObject.set(x, "maxPagesToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
  }
}
