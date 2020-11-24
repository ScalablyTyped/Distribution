package typings.titanium.Titanium.App.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefaultsEventMap extends ProxyEventMap {
  
  var change: UserDefaultsChangeEvent = js.native
}
object UserDefaultsEventMap {
  
  @scala.inline
  def apply(change: UserDefaultsChangeEvent): UserDefaultsEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefaultsEventMap]
  }
  
  @scala.inline
  implicit class UserDefaultsEventMapOps[Self <: UserDefaultsEventMap] (val x: Self) extends AnyVal {
    
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
    def setChange(value: UserDefaultsChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
  }
}
