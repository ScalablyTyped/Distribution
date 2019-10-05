package typings.winrtDashUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothServiceCapabilities extends js.Object

/** Indicates the service capabilities of a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothServiceCapabilities")
@js.native
object BluetoothServiceCapabilities extends js.Object {
  /** Audio, for example, speaker, microphone, headset service. */
  @js.native
  sealed trait audioService extends BluetoothServiceCapabilities
  
  /** Capturing, for example, scanner, microphone. */
  @js.native
  sealed trait capturingService extends BluetoothServiceCapabilities
  
  /** Information, for example, web server, WAP server. */
  @js.native
  sealed trait informationService extends BluetoothServiceCapabilities
  
  /** Limited Discoverable Mode. */
  @js.native
  sealed trait limitedDiscoverableMode extends BluetoothServiceCapabilities
  
  /** Networking, for example, LAN, Ad hoc. */
  @js.native
  sealed trait networkingService extends BluetoothServiceCapabilities
  
  /** None. */
  @js.native
  sealed trait none extends BluetoothServiceCapabilities
  
  /** Object Transfer, for example, v-Inbox, v-folder. */
  @js.native
  sealed trait objectTransferService extends BluetoothServiceCapabilities
  
  /** Positioning or location identification. */
  @js.native
  sealed trait positioningService extends BluetoothServiceCapabilities
  
  /** Rendering, for example, printer, speakers. */
  @js.native
  sealed trait renderingService extends BluetoothServiceCapabilities
  
  /** Telephony, for example cordless, modem, headset service. */
  @js.native
  sealed trait telephoneService extends BluetoothServiceCapabilities
  
  /* 7 */ val audioService: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.audioService with Double = js.native
  /* 5 */ val capturingService: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.capturingService with Double = js.native
  /* 9 */ val informationService: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.informationService with Double = js.native
  /* 1 */ val limitedDiscoverableMode: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.limitedDiscoverableMode with Double = js.native
  /* 3 */ val networkingService: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.networkingService with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.none with Double = js.native
  /* 6 */ val objectTransferService: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.objectTransferService with Double = js.native
  /* 2 */ val positioningService: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.positioningService with Double = js.native
  /* 4 */ val renderingService: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.renderingService with Double = js.native
  /* 8 */ val telephoneService: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.telephoneService with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothServiceCapabilities with Double] = js.native
}

