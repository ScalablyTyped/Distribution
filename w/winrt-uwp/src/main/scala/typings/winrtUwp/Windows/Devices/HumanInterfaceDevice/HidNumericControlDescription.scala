package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a numeric control for a given HID device. */
@js.native
trait HidNumericControlDescription extends StObject {
  
  /** Retrieves a Boolean value which indicates whether the control supports a null, or out-of-range, value. */
  var hasNull: Boolean = js.native
  
  /** Retrieves the identifier for a given numeric control. */
  var id: Double = js.native
  
  /** Retrieves a Boolean value indicating whether the given control values are absolute or relative. */
  var isAbsolute: Boolean = js.native
  
  /** Retrieves the logical maximum value for the given control. */
  var logicalMaximum: Double = js.native
  
  /** Retrieves the logical minimum value for the control. */
  var logicalMinimum: Double = js.native
  
  /** Retrieves the parent collections for a given numeric control. */
  var parentCollections: IVectorView[HidCollection] = js.native
  
  /** Retrieves the physical maximum-value for the given control. */
  var physicalMaximum: Double = js.native
  
  /** Retrieves the physical minimum-value for the given control. */
  var physicalMinimum: Double = js.native
  
  /** Retrieves the number of reports associated with the given control. */
  var reportCount: Double = js.native
  
  /** Retrieves the identifier for the report associated with the given numeric control. */
  var reportId: Double = js.native
  
  /** Retrieves the size, in bytes, of the given numeric control. */
  var reportSize: Double = js.native
  
  /** Retrieves the type of report associated with the given numeric control. */
  var reportType: HidReportType = js.native
  
  /** Retrieves the unit associated with the given numeric control. */
  var unit: Double = js.native
  
  /** Retrieves the unit exponent for the given numeric control. */
  var unitExponent: Double = js.native
  
  /** Retrieves the usage identifier associated with the given numeric control. */
  var usageId: Double = js.native
  
  /** Retrieves the usage page associated with the given numeric control. */
  var usagePage: Double = js.native
}
object HidNumericControlDescription {
  
  @scala.inline
  def apply(
    hasNull: Boolean,
    id: Double,
    isAbsolute: Boolean,
    logicalMaximum: Double,
    logicalMinimum: Double,
    parentCollections: IVectorView[HidCollection],
    physicalMaximum: Double,
    physicalMinimum: Double,
    reportCount: Double,
    reportId: Double,
    reportSize: Double,
    reportType: HidReportType,
    unit: Double,
    unitExponent: Double,
    usageId: Double,
    usagePage: Double
  ): HidNumericControlDescription = {
    val __obj = js.Dynamic.literal(hasNull = hasNull.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAbsolute = isAbsolute.asInstanceOf[js.Any], logicalMaximum = logicalMaximum.asInstanceOf[js.Any], logicalMinimum = logicalMinimum.asInstanceOf[js.Any], parentCollections = parentCollections.asInstanceOf[js.Any], physicalMaximum = physicalMaximum.asInstanceOf[js.Any], physicalMinimum = physicalMinimum.asInstanceOf[js.Any], reportCount = reportCount.asInstanceOf[js.Any], reportId = reportId.asInstanceOf[js.Any], reportSize = reportSize.asInstanceOf[js.Any], reportType = reportType.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitExponent = unitExponent.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidNumericControlDescription]
  }
  
  @scala.inline
  implicit class HidNumericControlDescriptionMutableBuilder[Self <: HidNumericControlDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasNull(value: Boolean): Self = StObject.set(x, "hasNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAbsolute(value: Boolean): Self = StObject.set(x, "isAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalMaximum(value: Double): Self = StObject.set(x, "logicalMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalMinimum(value: Double): Self = StObject.set(x, "logicalMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCollections(value: IVectorView[HidCollection]): Self = StObject.set(x, "parentCollections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalMaximum(value: Double): Self = StObject.set(x, "physicalMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalMinimum(value: Double): Self = StObject.set(x, "physicalMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCount(value: Double): Self = StObject.set(x, "reportCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportId(value: Double): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportSize(value: Double): Self = StObject.set(x, "reportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportType(value: HidReportType): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitExponent(value: Double): Self = StObject.set(x, "unitExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageId(value: Double): Self = StObject.set(x, "usageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
  }
}
