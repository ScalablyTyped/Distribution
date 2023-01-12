package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Pagination details, if required by the length of the output. */
trait Pagination extends StObject {
  
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.undefined
  
  /** The URL that returns the next page of results. */
  var next_url: js.UndefOr[String] = js.undefined
  
  /** A token identifying the current page of results. */
  var refresh_cursor: js.UndefOr[String] = js.undefined
  
  /** The URL that returns the current page of results. */
  var refresh_url: js.UndefOr[String] = js.undefined
  
  /** Reserved for future use. */
  var total: js.UndefOr[Double] = js.undefined
}
object Pagination {
  
  inline def apply(): Pagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pagination] (val x: Self) extends AnyVal {
    
    inline def setNext_cursor(value: String): Self = StObject.set(x, "next_cursor", value.asInstanceOf[js.Any])
    
    inline def setNext_cursorUndefined: Self = StObject.set(x, "next_cursor", js.undefined)
    
    inline def setNext_url(value: String): Self = StObject.set(x, "next_url", value.asInstanceOf[js.Any])
    
    inline def setNext_urlUndefined: Self = StObject.set(x, "next_url", js.undefined)
    
    inline def setRefresh_cursor(value: String): Self = StObject.set(x, "refresh_cursor", value.asInstanceOf[js.Any])
    
    inline def setRefresh_cursorUndefined: Self = StObject.set(x, "refresh_cursor", js.undefined)
    
    inline def setRefresh_url(value: String): Self = StObject.set(x, "refresh_url", value.asInstanceOf[js.Any])
    
    inline def setRefresh_urlUndefined: Self = StObject.set(x, "refresh_url", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
