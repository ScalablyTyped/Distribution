package typings.waterline

import typings.waterline.mod.CollectionClass
import typings.waterline.mod.CollectionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Extend extends StObject {
    
    def extend(params: CollectionDefinition): CollectionClass = js.native
  }
  object Extend {
    
    @scala.inline
    def apply(extend: CollectionDefinition => CollectionClass): Extend = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
      __obj.asInstanceOf[Extend]
    }
    
    @scala.inline
    implicit class ExtendMutableBuilder[Self <: Extend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: CollectionDefinition => CollectionClass): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Limit extends StObject {
    
    var limit: Double = js.native
    
    var page: Double = js.native
  }
  object Limit {
    
    @scala.inline
    def apply(limit: Double, page: Double): Limit = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
