package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PastLogsOptions
  extends StObject
     with LogsOptions {
  
  var toBlock: js.UndefOr[BlockNumber] = js.undefined
}
object PastLogsOptions {
  
  @scala.inline
  def apply(): PastLogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PastLogsOptions]
  }
  
  @scala.inline
  implicit class PastLogsOptionsMutableBuilder[Self <: PastLogsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToBlock(value: BlockNumber): Self = StObject.set(x, "toBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBlockUndefined: Self = StObject.set(x, "toBlock", js.undefined)
  }
}
