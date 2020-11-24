package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a numeric control for a given HID device. */
@js.native
trait HidNumericControlDescription extends js.Object {
  
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
  implicit class HidNumericControlDescriptionOps[Self <: HidNumericControlDescription] (val x: Self) extends AnyVal {
    
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
    def setHasNull(value: Boolean): Self = this.set("hasNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAbsolute(value: Boolean): Self = this.set("isAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalMaximum(value: Double): Self = this.set("logicalMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalMinimum(value: Double): Self = this.set("logicalMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCollections(value: IVectorView[HidCollection]): Self = this.set("parentCollections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalMaximum(value: Double): Self = this.set("physicalMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalMinimum(value: Double): Self = this.set("physicalMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCount(value: Double): Self = this.set("reportCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportId(value: Double): Self = this.set("reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportSize(value: Double): Self = this.set("reportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportType(value: HidReportType): Self = this.set("reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: Double): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitExponent(value: Double): Self = this.set("unitExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageId(value: Double): Self = this.set("usageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePage(value: Double): Self = this.set("usagePage", value.asInstanceOf[js.Any])
  }
}
