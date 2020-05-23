package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a numeric control for a given HID device. */
trait HidNumericControlDescription extends js.Object {
  /** Retrieves a Boolean value which indicates whether the control supports a null, or out-of-range, value. */
  var hasNull: Boolean
  /** Retrieves the identifier for a given numeric control. */
  var id: Double
  /** Retrieves a Boolean value indicating whether the given control values are absolute or relative. */
  var isAbsolute: Boolean
  /** Retrieves the logical maximum value for the given control. */
  var logicalMaximum: Double
  /** Retrieves the logical minimum value for the control. */
  var logicalMinimum: Double
  /** Retrieves the parent collections for a given numeric control. */
  var parentCollections: IVectorView[HidCollection]
  /** Retrieves the physical maximum-value for the given control. */
  var physicalMaximum: Double
  /** Retrieves the physical minimum-value for the given control. */
  var physicalMinimum: Double
  /** Retrieves the number of reports associated with the given control. */
  var reportCount: Double
  /** Retrieves the identifier for the report associated with the given numeric control. */
  var reportId: Double
  /** Retrieves the size, in bytes, of the given numeric control. */
  var reportSize: Double
  /** Retrieves the type of report associated with the given numeric control. */
  var reportType: HidReportType
  /** Retrieves the unit associated with the given numeric control. */
  var unit: Double
  /** Retrieves the unit exponent for the given numeric control. */
  var unitExponent: Double
  /** Retrieves the usage identifier associated with the given numeric control. */
  var usageId: Double
  /** Retrieves the usage page associated with the given numeric control. */
  var usagePage: Double
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
}

