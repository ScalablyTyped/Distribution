package typings.workboxPrecaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanupResultMod {
  
  trait CleanupResult extends StObject {
    
    var deletedCacheRequests: js.Array[String]
  }
  object CleanupResult {
    
    @scala.inline
    def apply(deletedCacheRequests: js.Array[String]): CleanupResult = {
      val __obj = js.Dynamic.literal(deletedCacheRequests = deletedCacheRequests.asInstanceOf[js.Any])
      __obj.asInstanceOf[CleanupResult]
    }
    
    @scala.inline
    implicit class CleanupResultMutableBuilder[Self <: CleanupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeletedCacheRequests(value: js.Array[String]): Self = StObject.set(x, "deletedCacheRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedCacheRequestsVarargs(value: String*): Self = StObject.set(x, "deletedCacheRequests", js.Array(value :_*))
    }
  }
}
