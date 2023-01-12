package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a simple Boolean control on a HID device that returns on/off values. An example would be the LED light on a keyboard. */
trait HidBooleanControl extends StObject {
  
  /** Retrieves a description of the given Boolean control. */
  var controlDescription: HidBooleanControlDescription
  
  /** Retrieves the identifier for a given Boolean control. */
  var id: Double
  
  /** Retrieves a Boolean value indicating whether the given Boolean control is active. */
  var isActive: Boolean
  
  /** Retrieves the usage identifier associated with the given Boolean control. */
  var usageId: Double
  
  /** Retrieves the usage page for a given Boolean control. */
  var usagePage: Double
}
object HidBooleanControl {
  
  inline def apply(
    controlDescription: HidBooleanControlDescription,
    id: Double,
    isActive: Boolean,
    usageId: Double,
    usagePage: Double
  ): HidBooleanControl = {
    val __obj = js.Dynamic.literal(controlDescription = controlDescription.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidBooleanControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HidBooleanControl] (val x: Self) extends AnyVal {
    
    inline def setControlDescription(value: HidBooleanControlDescription): Self = StObject.set(x, "controlDescription", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setUsageId(value: Double): Self = StObject.set(x, "usageId", value.asInstanceOf[js.Any])
    
    inline def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
  }
}
