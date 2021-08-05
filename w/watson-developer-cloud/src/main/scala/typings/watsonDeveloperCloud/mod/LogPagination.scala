package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The pagination data for the returned objects. */
trait LogPagination extends StObject {
  
  /** Reserved for future use. */
  var matched: js.UndefOr[Double] = js.undefined
  
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.undefined
  
  /** The URL that will return the next page of results, if any. */
  var next_url: js.UndefOr[String] = js.undefined
}
object LogPagination {
  
  inline def apply(): LogPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPagination]
  }
  
  extension [Self <: LogPagination](x: Self) {
    
    inline def setMatched(value: Double): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def setMatchedUndefined: Self = StObject.set(x, "matched", js.undefined)
    
    inline def setNext_cursor(value: String): Self = StObject.set(x, "next_cursor", value.asInstanceOf[js.Any])
    
    inline def setNext_cursorUndefined: Self = StObject.set(x, "next_cursor", js.undefined)
    
    inline def setNext_url(value: String): Self = StObject.set(x, "next_url", value.asInstanceOf[js.Any])
    
    inline def setNext_urlUndefined: Self = StObject.set(x, "next_url", js.undefined)
  }
}
