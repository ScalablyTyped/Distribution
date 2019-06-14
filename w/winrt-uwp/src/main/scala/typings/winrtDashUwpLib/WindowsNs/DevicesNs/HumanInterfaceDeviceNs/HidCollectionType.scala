package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HidCollectionType extends js.Object

/** Identifies the relationship that defines a grouping of controls on the device. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidCollectionType")
@js.native
object HidCollectionType extends js.Object {
  /** The controls are related by intended application. */
  @js.native
  sealed trait application
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType
  
  /** The controls are logically related. */
  @js.native
  sealed trait logical
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType
  
  /** The controls are related by a named array. */
  @js.native
  sealed trait namedArray
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType
  
  /** The control relationship is not described by a defined category. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType
  
  /** The controls are related by physical source. */
  @js.native
  sealed trait physical
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType
  
  /** The controls are related by report type. */
  @js.native
  sealed trait report
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType
  
  /** The controls are related by a usage modifier. */
  @js.native
  sealed trait usageModifier
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType
  
  /** The controls are related by a usage switch. */
  @js.native
  sealed trait usageSwitch
    extends winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType
  
  /* 1 */ val application: application with scala.Double = js.native
  /* 2 */ val logical: logical with scala.Double = js.native
  /* 4 */ val namedArray: namedArray with scala.Double = js.native
  /* 7 */ val other: other with scala.Double = js.native
  /* 0 */ val physical: physical with scala.Double = js.native
  /* 3 */ val report: report with scala.Double = js.native
  /* 6 */ val usageModifier: usageModifier with scala.Double = js.native
  /* 5 */ val usageSwitch: usageSwitch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType with scala.Double
  ] = js.native
}

