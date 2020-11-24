package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the physical location of a device in its enclosure. */
@js.native
trait EnclosureLocation extends js.Object {
  
  /** Indicates whether the device is physically located in the docking station of the portable computer. */
  var inDock: Boolean = js.native
  
  /** Indicates whether the device is physically located in the lid of the portable computer. */
  var inLid: Boolean = js.native
  
  /** Indicates which panel of the computer the device is physically located on. */
  var panel: Panel = js.native
}
object EnclosureLocation {
  
  @scala.inline
  def apply(inDock: Boolean, inLid: Boolean, panel: Panel): EnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock.asInstanceOf[js.Any], inLid = inLid.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosureLocation]
  }
  
  @scala.inline
  implicit class EnclosureLocationOps[Self <: EnclosureLocation] (val x: Self) extends AnyVal {
    
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
