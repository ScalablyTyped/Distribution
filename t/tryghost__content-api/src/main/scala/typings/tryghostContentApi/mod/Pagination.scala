package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagination extends StObject {
  
  var limit: Double
  
  var next: Nullable[Double]
  
  var page: Double
  
  var pages: Double
  
  var prev: Nullable[Double]
  
  var total: Double
}
object Pagination {
  
  inline def apply(limit: Double, page: Double, pages: Double, total: Double): Pagination = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], next = null, prev = null)
    __obj.asInstanceOf[Pagination]
  }
  
  extension [Self <: Pagination](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Nullable[Double]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: Nullable[Double]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevNull: Self = StObject.set(x, "prev", null)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
