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
  
  val audioService: audioService with java.lang.String = js.native
  val capturingService: capturingService with java.lang.String = js.native
  val informationService: informationService with java.lang.String = js.native
  val limitedDiscoverableMode: limitedDiscoverableMode with java.lang.String = js.native
  val networkingService: networkingService with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val objectTransferService: objectTransferService with java.lang.String = js.native
  val positioningService: positioningService with java.lang.String = js.native
  val renderingService: renderingService with java.lang.String = js.native
  val telephoneService: telephoneService with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities with java.lang.String
  ] = js.native
}

