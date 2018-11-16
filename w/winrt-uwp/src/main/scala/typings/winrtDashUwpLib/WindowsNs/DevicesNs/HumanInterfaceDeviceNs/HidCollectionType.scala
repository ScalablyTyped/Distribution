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
  
  val application: application with java.lang.String = js.native
  val logical: logical with java.lang.String = js.native
  val namedArray: namedArray with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val physical: physical with java.lang.String = js.native
  val report: report with java.lang.String = js.native
  val usageModifier: usageModifier with java.lang.String = js.native
  val usageSwitch: usageSwitch with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType with java.lang.String
  ] = js.native
}

