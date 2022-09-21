package typings.waterline

import typings.waterline.mod.CollectionClass
import typings.waterline.mod.CollectionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined waterline.waterline.DatastoreConfig & {  identity :undefined} */
  trait DatastoreConfigidentityun extends StObject {
    
    var adapter: String
    
    var identity: Unit
  }
  object DatastoreConfigidentityun {
    
    inline def apply(adapter: String, identity: Unit): DatastoreConfigidentityun = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatastoreConfigidentityun]
    }
    
    extension [Self <: DatastoreConfigidentityun](x: Self) {
      
      inline def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Unit): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extend extends StObject {
    
    def extend(params: CollectionDefinition): CollectionClass
  }
  object Extend {
    
    inline def apply(extend: CollectionDefinition => CollectionClass): Extend = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
      __obj.asInstanceOf[Extend]
    }
    
    extension [Self <: Extend](x: Self) {
      
      inline def setExtend(value: CollectionDefinition => CollectionClass): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    }
  }
  
  trait Limit extends StObject {
    
    var limit: Double
    
    var page: Double
  }
  object Limit {
    
    inline def apply(limit: Double, page: Double): Limit = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    extension [Self <: Limit](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
