package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanPreventDefaultData extends js.Object {
  
  var canPreventDefault: `true` = js.native
  
  var data: Action = js.native
}
object CanPreventDefaultData {
  
  @scala.inline
  def apply(canPreventDefault: `true`, data: Action): CanPreventDefaultData = {
    val __obj = js.Dynamic.literal(canPreventDefault = canPreventDefault.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanPreventDefaultData]
  }
  
  @scala.inline
  implicit class CanPreventDefaultDataOps[Self <: CanPreventDefaultData] (val x: Self) extends AnyVal {
    
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
    def setCanPreventDefault(value: `true`): Self = this.set("canPreventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Action): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
