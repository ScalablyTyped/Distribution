package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoCpu
  extends StObject
     with SystemInfoProperty {
  
  /**
    *  An attribute to indicate the current CPU load, as a number between ***0.0 ***and ***1.0***, representing the minimum and maximum values allowed on this system.
    *
    * Any threshold parameter used in a watch function to monitor this property applies to this attribute.
    */
  val load: Double
}
object SystemInfoCpu {
  
  inline def apply(load: Double): SystemInfoCpu = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoCpu]
  }
  
  extension [Self <: SystemInfoCpu](x: Self) {
    
    inline def setLoad(value: Double): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
  }
}
