package typings.syncRequest.messagesMod

import typings.httpBasic.httpVerbMod.HttpVerb
import typings.syncRequest.optionsMod.MessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Req extends js.Object {
  
  var m: HttpVerb = js.native
  
  var o: js.UndefOr[MessageOptions] = js.native
  
  var u: String = js.native
}
object Req {
  
  @scala.inline
  def apply(m: HttpVerb, u: String): Req = {
    val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  
  @scala.inline
  implicit class ReqOps[Self <: Req] (val x: Self) extends AnyVal {
    
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
    def setM(value: HttpVerb): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU(value: String): Self = this.set("u", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: MessageOptions): Self = this.set("o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteO: Self = this.set("o", js.undefined)
  }
}
