package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`0`
import typings.tablestore.tablestoreInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUMASYNCINDEX extends StObject {
  
  var IUM_ASYNC_INDEX: `0`
  
  var IUM_SYNC_INDEX: `1`
}
object IUMASYNCINDEX {
  
  inline def apply(): IUMASYNCINDEX = {
    val __obj = js.Dynamic.literal(IUM_ASYNC_INDEX = 0, IUM_SYNC_INDEX = 1)
    __obj.asInstanceOf[IUMASYNCINDEX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUMASYNCINDEX] (val x: Self) extends AnyVal {
    
    inline def setIUM_ASYNC_INDEX(value: `0`): Self = StObject.set(x, "IUM_ASYNC_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIUM_SYNC_INDEX(value: `1`): Self = StObject.set(x, "IUM_SYNC_INDEX", value.asInstanceOf[js.Any])
  }
}
