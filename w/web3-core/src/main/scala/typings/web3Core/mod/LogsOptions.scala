package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogsOptions extends StObject {
  
  var address: js.UndefOr[String | js.Array[String]] = js.native
  
  var fromBlock: js.UndefOr[BlockNumber] = js.native
  
  var topics: js.UndefOr[js.Array[String | js.Array[String] | Null]] = js.native
}
object LogsOptions {
  
  @scala.inline
  def apply(): LogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsOptions]
  }
  
  @scala.inline
  implicit class LogsOptionsMutableBuilder[Self <: LogsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String | js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    @scala.inline
    def setFromBlock(value: BlockNumber): Self = StObject.set(x, "fromBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromBlockUndefined: Self = StObject.set(x, "fromBlock", js.undefined)
    
    @scala.inline
    def setTopics(value: js.Array[String | js.Array[String] | Null]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: (String | js.Array[String] | Null)*): Self = StObject.set(x, "topics", js.Array(value :_*))
  }
}
