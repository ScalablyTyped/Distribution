package typings.tablestore.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTotalCount extends StObject {
  
  var getTotalCount: js.UndefOr[Boolean] = js.undefined
  
  var limit: Double
  
  var offset: Double
  
  var query: Query
  
  var token: js.UndefOr[Buffer | Null] = js.undefined
}
object GetTotalCount {
  
  inline def apply(limit: Double, offset: Double, query: Query): GetTotalCount = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTotalCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTotalCount] (val x: Self) extends AnyVal {
    
    inline def setGetTotalCount(value: Boolean): Self = StObject.set(x, "getTotalCount", value.asInstanceOf[js.Any])
    
    inline def setGetTotalCountUndefined: Self = StObject.set(x, "getTotalCount", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setToken(value: Buffer): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
