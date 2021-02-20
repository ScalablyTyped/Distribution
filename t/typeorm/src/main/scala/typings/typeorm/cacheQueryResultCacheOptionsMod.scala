package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheQueryResultCacheOptionsMod {
  
  @js.native
  trait QueryResultCacheOptions extends StObject {
    
    /**
      * Duration in milliseconds during which results will be returned from cache.
      */
    var duration: Double = js.native
    
    /**
      * Cache identifier set by user.
      * Can be empty.
      */
    var identifier: String = js.native
    
    /**
      * Cached query.
      */
    var query: String = js.native
    
    /**
      * Query result that will be cached.
      */
    var result: js.UndefOr[js.Any] = js.native
    
    /**
      * Time, when cache was created.
      */
    var time: js.UndefOr[Double] = js.native
  }
  object QueryResultCacheOptions {
    
    @scala.inline
    def apply(duration: Double, identifier: String, query: String): QueryResultCacheOptions = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResultCacheOptions]
    }
    
    @scala.inline
    implicit class QueryResultCacheOptionsMutableBuilder[Self <: QueryResultCacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
