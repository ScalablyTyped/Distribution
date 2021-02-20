package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The pagination data for the returned objects. */
@js.native
trait LogPagination extends StObject {
  
  /** Reserved for future use. */
  var matched: js.UndefOr[Double] = js.native
  
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.native
  
  /** The URL that will return the next page of results, if any. */
  var next_url: js.UndefOr[String] = js.native
}
object LogPagination {
  
  @scala.inline
  def apply(): LogPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPagination]
  }
  
  @scala.inline
  implicit class LogPaginationMutableBuilder[Self <: LogPagination] (val x: Self) extends AnyVal {
    
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
  }
}
