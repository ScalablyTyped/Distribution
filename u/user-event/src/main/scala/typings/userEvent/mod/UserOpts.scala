package typings.userEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserOpts extends js.Object {
  
  var allAtOnce: js.UndefOr[Boolean] = js.native
  
  var delay: js.UndefOr[Double] = js.native
}
object UserOpts {
  
  @scala.inline
  def apply(): UserOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserOpts]
  }
  
  @scala.inline
  implicit class UserOptsOps[Self <: UserOpts] (val x: Self) extends AnyVal {
    
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
    def setAllAtOnce(value: Boolean): Self = this.set("allAtOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllAtOnce: Self = this.set("allAtOnce", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
  }
}
