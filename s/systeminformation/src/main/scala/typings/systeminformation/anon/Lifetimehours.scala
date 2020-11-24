package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lifetimehours extends js.Object {
  
  var lifetime_hours: Double = js.native
  
  var status: Value = js.native
  
  var `type`: String = js.native
}
object Lifetimehours {
  
  @scala.inline
  def apply(lifetime_hours: Double, status: Value, `type`: String): Lifetimehours = {
    val __obj = js.Dynamic.literal(lifetime_hours = lifetime_hours.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifetimehours]
  }
  
  @scala.inline
  implicit class LifetimehoursOps[Self <: Lifetimehours] (val x: Self) extends AnyVal {
    
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
    def setLifetime_hours(value: Double): Self = this.set("lifetime_hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Value): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
