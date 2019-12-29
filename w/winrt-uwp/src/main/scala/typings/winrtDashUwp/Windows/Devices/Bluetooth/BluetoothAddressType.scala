package typings.winrtDashUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothAddressType extends js.Object

/** Describes the Bluetooth address type. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothAddressType")
@js.native
object BluetoothAddressType extends js.Object {
  /** Public address. */
  @js.native
  sealed trait public extends BluetoothAddressType
  
  /** Random address. */
  @js.native
  sealed trait random extends BluetoothAddressType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothAddressType with Double] = js.native
  /* 0 */ @js.native
  object public extends TopLevel[public with Double]
  
  /* 1 */ @js.native
  object random extends TopLevel[random with Double]
  
}

