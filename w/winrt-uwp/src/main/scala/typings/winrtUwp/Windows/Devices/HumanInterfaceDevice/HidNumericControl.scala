package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a numeric control on a HID device that returns a range of values. An example would be the volume control on a speaker. */
trait HidNumericControl extends StObject {
  
  /** Retrieves a control description for the given numeric control. */
  var controlDescription: HidNumericControlDescription
  
  /** Retrieves the identifier for the given numeric control. */
  var id: Double
  
  /** Retrieves a Boolean value that indicates whether the given numeric control is grouped with other, related controls. */
  var isGrouped: Boolean
  
  /** Retrieves, or sets, a scaled numeric-value for the given control. */
  var scaledValue: Double
  
  /** Retrieves the usage identifier for the given numeric control. */
  var usageId: Double
  
  /** Retrieves the usage page for the given numeric control. */
  var usagePage: Double
  
  /** Retrieves, or sets, the numeric value for a given control. */
  var value: Double
}
object HidNumericControl {
  
  @scala.inline
  def apply(
    controlDescription: HidNumericControlDescription,
    id: Double,
    isGrouped: Boolean,
    scaledValue: Double,
    usageId: Double,
    usagePage: Double,
    value: Double
  ): HidNumericControl = {
    val __obj = js.Dynamic.literal(controlDescription = controlDescription.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], scaledValue = scaledValue.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidNumericControl]
  }
  
  @scala.inline
  implicit class HidNumericControlMutableBuilder[Self <: HidNumericControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlDescription(value: HidNumericControlDescription): Self = StObject.set(x, "controlDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaledValue(value: Double): Self = StObject.set(x, "scaledValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageId(value: Double): Self = StObject.set(x, "usageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
