package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a Boolean control for a given HID device. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription")
@js.native
abstract class HidBooleanControlDescription () extends js.Object {
  /** Retrieves the identifier for a given Boolean control. */
  var id: scala.Double = js.native
  /** Retrieves the parent collection for a given Boolean control. */
  var parentCollections: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HidCollection] = js.native
  /** Retrieves the identifier for the report associated with the given Boolean control. */
  var reportId: scala.Double = js.native
  /** Retrieves the report type for the report associated with the given Boolean control. */
  var reportType: HidReportType = js.native
  /** Retrieves the usage identifier associated with the given Boolean control. */
  var usageId: scala.Double = js.native
  /** Retrieves the usage page associated with the given Boolean control. */
  var usagePage: scala.Double = js.native
}

