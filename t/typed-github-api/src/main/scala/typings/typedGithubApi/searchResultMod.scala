package typings.typedGithubApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchResultMod {
  
  trait SearchResult extends StObject {
    
    var score: Double
  }
  object SearchResult {
    
    inline def apply(score: Double): SearchResult = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult]
    }
    
    extension [Self <: SearchResult](x: Self) {
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchResults[T] extends StObject {
    
    var incomplete_results: Boolean
    
    var items: js.Array[T & SearchResult]
    
    var total_count: Double
  }
  object SearchResults {
    
    inline def apply[T](incomplete_results: Boolean, items: js.Array[T & SearchResult], total_count: Double): SearchResults[T] = {
      val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResults[T]]
    }
    
    extension [Self <: SearchResults[?], T](x: Self & SearchResults[T]) {
      
      inline def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[T & SearchResult]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: (T & SearchResult)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    }
  }
}
