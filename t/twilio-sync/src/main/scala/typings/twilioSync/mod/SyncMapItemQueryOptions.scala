package typings.twilioSync.mod

import typings.twilioSync.twilioSyncStrings.asc
import typings.twilioSync.twilioSyncStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map item query options.
  */
trait SyncMapItemQueryOptions extends StObject {
  
  /**
    * SyncMapItem key, which should be used as the offset. If undefined, starts from the beginning or end depending
    * on queryOptions.order.
    */
  var from: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Lexicographical order of results.
    */
  var order: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * Result page size.
    */
  var pageSize: js.UndefOr[Double | String] = js.undefined
}
object SyncMapItemQueryOptions {
  
  inline def apply(): SyncMapItemQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncMapItemQueryOptions]
  }
  
  extension [Self <: SyncMapItemQueryOptions](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPageSize(value: Double | String): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
