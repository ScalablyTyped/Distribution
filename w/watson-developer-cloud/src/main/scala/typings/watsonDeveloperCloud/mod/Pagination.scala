package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The pagination data for the returned objects. */
@js.native
trait Pagination extends StObject {
  
  /** Reserved for future use. */
  var matched: js.UndefOr[Double] = js.native
  
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.native
  
  /** The URL that will return the next page of results. */
  var next_url: js.UndefOr[String] = js.native
  
  /** A token identifying the current page of results. */
  var refresh_cursor: js.UndefOr[String] = js.native
  
  /** The URL that will return the same page of results. */
  var refresh_url: String = js.native
  
  /** Reserved for future use. */
  var total: js.UndefOr[Double] = js.native
}
object Pagination {
  
  @scala.inline
  def apply(refresh_url: String): Pagination = {
    val __obj = js.Dynamic.literal(refresh_url = refresh_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  
  @scala.inline
  implicit class PaginationMutableBuilder[Self <: Pagination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatched(value: Double): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedUndefined: Self = StObject.set(x, "matched", js.undefined)
    
    @scala.inline
    def setNext_cursor(value: String): Self = StObject.set(x, "next_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_cursorUndefined: Self = StObject.set(x, "next_cursor", js.undefined)
    
    @scala.inline
    def setNext_url(value: String): Self = StObject.set(x, "next_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_urlUndefined: Self = StObject.set(x, "next_url", js.undefined)
    
    @scala.inline
    def setRefresh_cursor(value: String): Self = StObject.set(x, "refresh_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_cursorUndefined: Self = StObject.set(x, "refresh_cursor", js.undefined)
    
    @scala.inline
    def setRefresh_url(value: String): Self = StObject.set(x, "refresh_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
