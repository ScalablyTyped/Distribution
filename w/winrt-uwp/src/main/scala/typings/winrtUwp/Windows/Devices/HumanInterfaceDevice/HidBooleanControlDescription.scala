package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a Boolean control for a given HID device. */
@js.native
trait HidBooleanControlDescription extends js.Object {
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
  implicit class HidBooleanControlDescriptionOps[Self <: HidBooleanControlDescription] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentCollections(value: IVectorView[HidCollection]): Self = this.set("parentCollections", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportId(value: Double): Self = this.set("reportId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportType(value: HidReportType): Self = this.set("reportType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsageId(value: Double): Self = this.set("usageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsagePage(value: Double): Self = this.set("usagePage", value.asInstanceOf[js.Any])
  }
  
}

