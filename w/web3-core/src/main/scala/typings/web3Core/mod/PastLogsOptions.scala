package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PastLogsOptions extends LogsOptions {
  
  var toBlock: js.UndefOr[BlockNumber] = js.native
}
object PastLogsOptions {
  
  @scala.inline
  def apply(): PastLogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PastLogsOptions]
  }
  
  @scala.inline
  implicit class PastLogsOptionsOps[Self <: PastLogsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setToBlock(value: BlockNumber): Self = this.set("toBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToBlock: Self = this.set("toBlock", js.undefined)
  }
}
