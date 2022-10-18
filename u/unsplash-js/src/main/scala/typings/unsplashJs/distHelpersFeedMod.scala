package typings.unsplashJs

import typings.unsplashJs.distHelpersResponseMod.HandleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersFeedMod {
  
  @JSImport("unsplash-js/dist/helpers/feed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleFeedResponse[T](): HandleResponse[FeedResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFeedResponse")().asInstanceOf[HandleResponse[FeedResponse[T]]]
  
  trait FeedResponse[T] extends StObject {
    
    var results: js.Array[T]
    
    var total: Double
  }
  object FeedResponse {
    
    inline def apply[T](results: js.Array[T], total: Double): FeedResponse[T] = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedResponse[T]]
    }
    
    extension [Self <: FeedResponse[?], T](x: Self & FeedResponse[T]) {
      
      inline def setResults(value: js.Array[T]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: T*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
