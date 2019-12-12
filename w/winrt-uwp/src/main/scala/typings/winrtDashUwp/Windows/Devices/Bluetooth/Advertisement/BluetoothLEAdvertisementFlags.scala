package typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.classicNotSupported
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.dualModeControllerCapable
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.dualModeHostCapable
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.generalDiscoverableMode
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.limitedDiscoverableMode
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothLEAdvertisementFlags extends js.Object

/** Specifies flags used to match flags contained inside a Bluetooth LE advertisement payload. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags")
@js.native
object BluetoothLEAdvertisementFlags extends js.Object {
  /** Bluetooth BR/EDR not supported. */
  @js.native
  sealed trait classicNotSupported extends BluetoothLEAdvertisementFlags
  
  /** Simultaneous Bluetooth LE and BR/EDR to same device capable (controller). */
  @js.native
  sealed trait dualModeControllerCapable extends BluetoothLEAdvertisementFlags
  
  /** Simultaneous Bluetooth LE and BR/EDR to same device capable (host) */
  @js.native
  sealed trait dualModeHostCapable extends BluetoothLEAdvertisementFlags
  
  /** Bluetooth LE General Discoverable Mode. */
  @js.native
  sealed trait generalDiscoverableMode extends BluetoothLEAdvertisementFlags
  
  /** Bluetooth LE Limited Discoverable Mode. */
  @js.native
  sealed trait limitedDiscoverableMode extends BluetoothLEAdvertisementFlags
  
  /** None */
  @js.native
  sealed trait none extends BluetoothLEAdvertisementFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothLEAdvertisementFlags with Double] = js.native
  /* 3 */ @js.native
  object classicNotSupported extends TopLevel[classicNotSupported with Double]
  
  /* 4 */ @js.native
  object dualModeControllerCapable extends TopLevel[dualModeControllerCapable with Double]
  
  /* 5 */ @js.native
  object dualModeHostCapable extends TopLevel[dualModeHostCapable with Double]
  
  /* 2 */ @js.native
  object generalDiscoverableMode extends TopLevel[generalDiscoverableMode with Double]
  
  /* 1 */ @js.native
  object limitedDiscoverableMode extends TopLevel[limitedDiscoverableMode with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

