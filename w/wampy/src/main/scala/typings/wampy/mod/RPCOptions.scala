package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RPCOptions extends js.Object {
  
  var process: js.UndefOr[Boolean] = js.native
}
object RPCOptions {
  
  @scala.inline
  def apply(): RPCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RPCOptions]
  }
  
  @scala.inline
  implicit class RPCOptionsOps[Self <: RPCOptions] (val x: Self) extends AnyVal {
    
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
    def setProcess(value: Boolean): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
  }
}
