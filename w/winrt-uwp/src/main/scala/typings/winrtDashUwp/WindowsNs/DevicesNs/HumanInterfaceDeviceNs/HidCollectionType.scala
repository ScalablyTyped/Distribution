package typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

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
  sealed trait application extends HidCollectionType
  
  /** The controls are logically related. */
  @js.native
  sealed trait logical extends HidCollectionType
  
  /** The controls are related by a named array. */
  @js.native
  sealed trait namedArray extends HidCollectionType
  
  /** The control relationship is not described by a defined category. */
  @js.native
  sealed trait other extends HidCollectionType
  
  /** The controls are related by physical source. */
  @js.native
  sealed trait physical extends HidCollectionType
  
  /** The controls are related by report type. */
  @js.native
  sealed trait report extends HidCollectionType
  
  /** The controls are related by a usage modifier. */
  @js.native
  sealed trait usageModifier extends HidCollectionType
  
  /** The controls are related by a usage switch. */
  @js.native
  sealed trait usageSwitch extends HidCollectionType
  
  /* 1 */ val application: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType.application with Double = js.native
  /* 2 */ val logical: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType.logical with Double = js.native
  /* 4 */ val namedArray: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType.namedArray with Double = js.native
  /* 7 */ val other: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType.other with Double = js.native
  /* 0 */ val physical: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType.physical with Double = js.native
  /* 3 */ val report: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType.report with Double = js.native
  /* 6 */ val usageModifier: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType.usageModifier with Double = js.native
  /* 5 */ val usageSwitch: typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs.HidCollectionType.usageSwitch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HidCollectionType with Double] = js.native
}

