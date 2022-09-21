package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogsOptions extends StObject {
  
  var address: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var fromBlock: js.UndefOr[BlockNumber] = js.undefined
  
  var topics: js.UndefOr[js.Array[String | js.Array[String] | Null]] = js.undefined
}
object LogsOptions {
  
  inline def apply(): LogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsOptions]
  }
  
  extension [Self <: LogsOptions](x: Self) {
    
    inline def setAddress(value: String | js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setFromBlock(value: BlockNumber): Self = StObject.set(x, "fromBlock", value.asInstanceOf[js.Any])
    
    inline def setFromBlockUndefined: Self = StObject.set(x, "fromBlock", js.undefined)
    
    inline def setTopics(value: js.Array[String | js.Array[String] | Null]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: (String | js.Array[String] | Null)*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
