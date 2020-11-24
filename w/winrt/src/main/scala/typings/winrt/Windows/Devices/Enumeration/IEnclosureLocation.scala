package typings.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnclosureLocation extends js.Object {
  
  var inDock: Boolean = js.native
  
  var inLid: Boolean = js.native
  
  var panel: Panel = js.native
}
object IEnclosureLocation {
  
  @scala.inline
  def apply(inDock: Boolean, inLid: Boolean, panel: Panel): IEnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock.asInstanceOf[js.Any], inLid = inLid.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnclosureLocation]
  }
  
  @scala.inline
  implicit class IEnclosureLocationOps[Self <: IEnclosureLocation] (val x: Self) extends AnyVal {
    
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
    def setInDock(value: Boolean): Self = this.set("inDock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInLid(value: Boolean): Self = this.set("inLid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: Panel): Self = this.set("panel", value.asInstanceOf[js.Any])
  }
}
