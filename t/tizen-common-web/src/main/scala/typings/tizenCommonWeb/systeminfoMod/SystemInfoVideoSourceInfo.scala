package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.AV
import typings.tizenCommonWeb.tizenCommonWebStrings.COMP
import typings.tizenCommonWeb.tizenCommonWebStrings.DVI
import typings.tizenCommonWeb.tizenCommonWebStrings.HDMI
import typings.tizenCommonWeb.tizenCommonWebStrings.MEDIA
import typings.tizenCommonWeb.tizenCommonWebStrings.PC
import typings.tizenCommonWeb.tizenCommonWebStrings.SCART
import typings.tizenCommonWeb.tizenCommonWebStrings.SVIDEO
import typings.tizenCommonWeb.tizenCommonWebStrings.TV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoVideoSourceInfo extends js.Object {
  
  /**
    * Represents the input number of the input source.
    *
    * If the source is "HDMI 2", the `number` is 2.
    */
  val number: Double = js.native
  
  /**
    * Represents if there is a signal provided on the source.
    *
    * The `signal` attribute can be ***null***. The ***null*** value means that information about signal could not be retrieved at the time of returning this object.
    * If the value is ***true***, it means that there is signal provided. The value set to ***false*** means, that there is no signal.
    * By default getPropertyValue functions does not support this member, and will return object with `signal` value set to ***null***, it is supported only by TVWindow module. To get data about signal use `tizen.tvwindow.getSource()` or `tizen.tvwindow.setSource()`.
    */
  val signal: js.UndefOr[Boolean] = js.native
  
  /**
    * Represents the type of the video input source.
    */
  val `type`: SystemInfoVideoSourceType | TV | AV | SVIDEO | COMP | PC | HDMI | SCART | DVI | MEDIA = js.native
}
object SystemInfoVideoSourceInfo {
  
  @scala.inline
  def apply(
    number: Double,
    `type`: SystemInfoVideoSourceType | TV | AV | SVIDEO | COMP | PC | HDMI | SCART | DVI | MEDIA
  ): SystemInfoVideoSourceInfo = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoVideoSourceInfo]
  }
  
  @scala.inline
  implicit class SystemInfoVideoSourceInfoOps[Self <: SystemInfoVideoSourceInfo] (val x: Self) extends AnyVal {
    
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
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SystemInfoVideoSourceType | TV | AV | SVIDEO | COMP | PC | HDMI | SCART | DVI | MEDIA): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: Boolean): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
}
