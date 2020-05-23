package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a Boolean control for a given HID device. */
trait HidBooleanControlDescription extends js.Object {
  /** Retrieves the identifier for a given Boolean control. */
  var id: Double
  /** Retrieves the parent collection for a given Boolean control. */
  var parentCollections: IVectorView[HidCollection]
  /** Retrieves the identifier for the report associated with the given Boolean control. */
  var reportId: Double
  /** Retrieves the report type for the report associated with the given Boolean control. */
  var reportType: HidReportType
  /** Retrieves the usage identifier associated with the given Boolean control. */
  var usageId: Double
  /** Retrieves the usage page associated with the given Boolean control. */
  var usagePage: Double
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
}

