package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

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
  sealed trait audioService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** Capturing, for example, scanner, microphone. */
  @js.native
  sealed trait capturingService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** Information, for example, web server, WAP server. */
  @js.native
  sealed trait informationService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** Limited Discoverable Mode. */
  @js.native
  sealed trait limitedDiscoverableMode
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** Networking, for example, LAN, Ad hoc. */
  @js.native
  sealed trait networkingService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** None. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** Object Transfer, for example, v-Inbox, v-folder. */
  @js.native
  sealed trait objectTransferService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** Positioning or location identification. */
  @js.native
  sealed trait positioningService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** Rendering, for example, printer, speakers. */
  @js.native
  sealed trait renderingService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /** Telephony, for example cordless, modem, headset service. */
  @js.native
  sealed trait telephoneService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  
  /* 7 */ val audioService: audioService with scala.Double = js.native
  /* 5 */ val capturingService: capturingService with scala.Double = js.native
  /* 9 */ val informationService: informationService with scala.Double = js.native
  /* 1 */ val limitedDiscoverableMode: limitedDiscoverableMode with scala.Double = js.native
  /* 3 */ val networkingService: networkingService with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 6 */ val objectTransferService: objectTransferService with scala.Double = js.native
  /* 2 */ val positioningService: positioningService with scala.Double = js.native
  /* 4 */ val renderingService: renderingService with scala.Double = js.native
  /* 8 */ val telephoneService: telephoneService with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities with scala.Double
  ] = js.native
}

