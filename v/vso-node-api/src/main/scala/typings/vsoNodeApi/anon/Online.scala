package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Online extends js.Object {
  
  var offline: scala.Double = js.native
  
  var online: scala.Double = js.native
}
object Online {
  
  @scala.inline
  def apply(offline: scala.Double, online: scala.Double): Online = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
  
  @scala.inline
  implicit class OnlineOps[Self <: Online] (val x: Self) extends AnyVal {
    
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
    def setOffline(value: scala.Double): Self = this.set("offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: scala.Double): Self = this.set("online", value.asInstanceOf[js.Any])
  }
}
