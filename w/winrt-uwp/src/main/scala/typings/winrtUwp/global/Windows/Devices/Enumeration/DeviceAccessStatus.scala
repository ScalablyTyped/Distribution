package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the status of the access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessStatus")
@js.native
object DeviceAccessStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus with Double] = js.native
  
  /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.allowed with Double = js.native
  
  /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.deniedBySystem with Double = js.native
  
  /* 2 */ val deniedByUser: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.deniedByUser with Double = js.native
  
  /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.unspecified with Double = js.native
}
