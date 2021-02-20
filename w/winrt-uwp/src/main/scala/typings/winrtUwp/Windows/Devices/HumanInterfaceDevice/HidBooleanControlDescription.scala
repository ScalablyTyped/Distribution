package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a Boolean control for a given HID device. */
@js.native
trait HidBooleanControlDescription extends StObject {
  
  /** Retrieves the identifier for a given Boolean control. */
  var id: Double = js.native
  
  /** Retrieves the parent collection for a given Boolean control. */
  var parentCollections: IVectorView[HidCollection] = js.native
  
  /** Retrieves the identifier for the report associated with the given Boolean control. */
  var reportId: Double = js.native
  
  /** Retrieves the report type for the report associated with the given Boolean control. */
  var reportType: HidReportType = js.native
  
  /** Retrieves the usage identifier associated with the given Boolean control. */
  var usageId: Double = js.native
  
  /** Retrieves the usage page associated with the given Boolean control. */
  var usagePage: Double = js.native
}
object HidBooleanControlDescription {
  
  @scala.inline
  def apply(
    id: Double,
    parentCollections: IVectorView[HidCollection],
    reportId: Double,
    reportType: HidReportType,
    usageId: Double,
    usagePage: Double
  ): HidBooleanControlDescription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parentCollections = parentCollections.asInstanceOf[js.Any], reportId = reportId.asInstanceOf[js.Any], reportType = reportType.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidBooleanControlDescription]
  }
  
  @scala.inline
  implicit class HidBooleanControlDescriptionMutableBuilder[Self <: HidBooleanControlDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCollections(value: IVectorView[HidCollection]): Self = StObject.set(x, "parentCollections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportId(value: Double): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportType(value: HidReportType): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageId(value: Double): Self = StObject.set(x, "usageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
  }
}
