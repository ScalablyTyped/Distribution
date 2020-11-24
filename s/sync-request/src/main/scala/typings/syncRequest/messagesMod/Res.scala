package typings.syncRequest.messagesMod

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Res extends js.Object {
  
  var b: Buffer | String = js.native
  
  var h: IncomingHttpHeaders = js.native
  
  var s: Double = js.native
  
  var u: String = js.native
}
object Res {
  
  @scala.inline
  def apply(b: Buffer | String, h: IncomingHttpHeaders, s: Double, u: String): Res = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.asInstanceOf[Res]
  }
  
  @scala.inline
  implicit class ResOps[Self <: Res] (val x: Self) extends AnyVal {
    
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
    def setB(value: Buffer | String): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: IncomingHttpHeaders): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU(value: String): Self = this.set("u", value.asInstanceOf[js.Any])
  }
}
