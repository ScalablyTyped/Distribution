package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a numeric control for a given HID device. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription")
@js.native
abstract class HidNumericControlDescription () extends js.Object {
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

