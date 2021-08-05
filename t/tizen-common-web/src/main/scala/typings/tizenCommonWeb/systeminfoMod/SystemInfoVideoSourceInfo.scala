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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoVideoSourceInfo extends StObject {
  
  /**
    * Represents the input number of the input source.
    *
    * If the source is "HDMI 2", the `number` is 2.
    */
  val number: Double
  
  /**
    * Represents if there is a signal provided on the source.
    *
    * The `signal` attribute can be ***null***. The ***null*** value means that information about signal could not be retrieved at the time of returning this object.
    * If the value is ***true***, it means that there is signal provided. The value set to ***false*** means, that there is no signal.
    * By default getPropertyValue functions does not support this member, and will return object with `signal` value set to ***null***, it is supported only by TVWindow module. To get data about signal use `tizen.tvwindow.getSource()` or `tizen.tvwindow.setSource()`.
    */
  val signal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the type of the video input source.
    */
  val `type`: SystemInfoVideoSourceType | TV | AV | SVIDEO | COMP | PC | HDMI | SCART | DVI | MEDIA
}
object SystemInfoVideoSourceInfo {
  
  inline def apply(
    number: Double,
    `type`: SystemInfoVideoSourceType | TV | AV | SVIDEO | COMP | PC | HDMI | SCART | DVI | MEDIA
  ): SystemInfoVideoSourceInfo = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoVideoSourceInfo]
  }
  
  extension [Self <: SystemInfoVideoSourceInfo](x: Self) {
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: Boolean): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setType(value: SystemInfoVideoSourceType | TV | AV | SVIDEO | COMP | PC | HDMI | SCART | DVI | MEDIA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
