package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rx extends js.Object {
  
  var rx: Double = js.native
  
  var wx: Double = js.native
}
object Rx {
  
  @scala.inline
  def apply(rx: Double, wx: Double): Rx = {
    val __obj = js.Dynamic.literal(rx = rx.asInstanceOf[js.Any], wx = wx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rx]
  }
  
  @scala.inline
  implicit class RxOps[Self <: Rx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWx(value: Double): Self = this.set("wx", value.asInstanceOf[js.Any])
  }
}
