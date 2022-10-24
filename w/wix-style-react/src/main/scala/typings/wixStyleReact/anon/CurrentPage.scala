package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPage extends StObject {
  
  var currentPage: Double
  
  var maxPagesToShow: Double
  
  var totalPages: Double
}
object CurrentPage {
  
  inline def apply(currentPage: Double, maxPagesToShow: Double, totalPages: Double): CurrentPage = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], maxPagesToShow = maxPagesToShow.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPage]
  }
  
  extension [Self <: CurrentPage](x: Self) {
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setMaxPagesToShow(value: Double): Self = StObject.set(x, "maxPagesToShow", value.asInstanceOf[js.Any])
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
  }
}
