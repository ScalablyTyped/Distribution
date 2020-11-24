package typings.xdate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait formattersInfo extends js.Object {
  
  var i: js.UndefOr[String] = js.native
  
  var u: js.UndefOr[String] = js.native
  
  var vvv: js.UndefOr[js.Function2[/* xdate */ XDate, /* useutc */ Boolean, String]] = js.native
  
  var xxx: js.UndefOr[String] = js.native
}
object formattersInfo {
  
  @scala.inline
  def apply(): formattersInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[formattersInfo]
  }
  
  @scala.inline
  implicit class formattersInfoOps[Self <: formattersInfo] (val x: Self) extends AnyVal {
    
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
    def setI(value: String): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    
    @scala.inline
    def setU(value: String): Self = this.set("u", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU: Self = this.set("u", js.undefined)
    
    @scala.inline
    def setVvv(value: (/* xdate */ XDate, /* useutc */ Boolean) => String): Self = this.set("vvv", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVvv: Self = this.set("vvv", js.undefined)
    
    @scala.inline
    def setXxx(value: String): Self = this.set("xxx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXxx: Self = this.set("xxx", js.undefined)
  }
}
