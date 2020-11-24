package typings.twit.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseResponse extends js.Object {
  
  var data: Response = js.native
  
  var resp: IncomingMessage = js.native
}
object PromiseResponse {
  
  @scala.inline
  def apply(data: Response, resp: IncomingMessage): PromiseResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resp = resp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResponse]
  }
  
  @scala.inline
  implicit class PromiseResponseOps[Self <: PromiseResponse] (val x: Self) extends AnyVal {
    
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
    def setData(value: Response): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResp(value: IncomingMessage): Self = this.set("resp", value.asInstanceOf[js.Any])
  }
}
