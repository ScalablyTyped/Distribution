package typings.uinput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetupOptions extends js.Object {
  
  var EV_KEY: js.Array[_] = js.native
}
object SetupOptions {
  
  @scala.inline
  def apply(EV_KEY: js.Array[_]): SetupOptions = {
    val __obj = js.Dynamic.literal(EV_KEY = EV_KEY.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupOptions]
  }
  
  @scala.inline
  implicit class SetupOptionsOps[Self <: SetupOptions] (val x: Self) extends AnyVal {
    
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
    def setEV_KEYVarargs(value: js.Any*): Self = this.set("EV_KEY", js.Array(value :_*))
    
    @scala.inline
    def setEV_KEY(value: js.Array[_]): Self = this.set("EV_KEY", value.asInstanceOf[js.Any])
  }
}
