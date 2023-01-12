package typings.swellJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.swellJs.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResult[T] extends StObject {
  
  var count: Double
  
  var page: Double
  
  var pages: js.UndefOr[StringDictionary[End]] = js.undefined
  
  var results: js.Array[T]
}
object ListResult {
  
  inline def apply[T](count: Double, page: Double, results: js.Array[T]): ListResult[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResult[?], T] (val x: Self & ListResult[T]) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPages(value: StringDictionary[End]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setResults(value: js.Array[T]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: T*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
