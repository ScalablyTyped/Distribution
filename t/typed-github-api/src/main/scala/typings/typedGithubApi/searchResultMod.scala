package typings.typedGithubApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchResultMod {
  
  @js.native
  trait SearchResult extends StObject {
    
    var score: Double = js.native
  }
  object SearchResult {
    
    @scala.inline
    def apply(score: Double): SearchResult = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult]
    }
    
    @scala.inline
    implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchResults[T] extends StObject {
    
    var incomplete_results: Boolean = js.native
    
    var items: js.Array[T with SearchResult] = js.native
    
    var total_count: Double = js.native
  }
  object SearchResults {
    
    @scala.inline
    def apply[T](incomplete_results: Boolean, items: js.Array[T with SearchResult], total_count: Double): SearchResults[T] = {
      val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResults[T]]
    }
    
    @scala.inline
    implicit class SearchResultsMutableBuilder[Self <: SearchResults[_], T] (val x: Self with SearchResults[T]) extends AnyVal {
      
      @scala.inline
      def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[T with SearchResult]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: (T with SearchResult)*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    }
  }
}
