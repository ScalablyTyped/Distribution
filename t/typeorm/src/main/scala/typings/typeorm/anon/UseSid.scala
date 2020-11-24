package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSid extends js.Object {
  
  var useSid: Boolean = js.native
}
object UseSid {
  
  @scala.inline
  def apply(useSid: Boolean): UseSid = {
    val __obj = js.Dynamic.literal(useSid = useSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSid]
  }
  
  @scala.inline
  implicit class UseSidOps[Self <: UseSid] (val x: Self) extends AnyVal {
    
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
    def setUseSid(value: Boolean): Self = this.set("useSid", value.asInstanceOf[js.Any])
  }
}
