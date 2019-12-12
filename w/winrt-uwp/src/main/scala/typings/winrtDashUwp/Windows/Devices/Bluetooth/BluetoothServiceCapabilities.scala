package typings.winrtDashUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.audioService
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.capturingService
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.informationService
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.limitedDiscoverableMode
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.networkingService
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.none
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.objectTransferService
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.positioningService
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.renderingService
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities.telephoneService
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothServiceCapabilities with Double] = js.native
  /* 7 */ @js.native
  object audioService extends TopLevel[audioService with Double]
  
  /* 5 */ @js.native
  object capturingService extends TopLevel[capturingService with Double]
  
  /* 9 */ @js.native
  object informationService extends TopLevel[informationService with Double]
  
  /* 1 */ @js.native
  object limitedDiscoverableMode extends TopLevel[limitedDiscoverableMode with Double]
  
  /* 3 */ @js.native
  object networkingService extends TopLevel[networkingService with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 6 */ @js.native
  object objectTransferService extends TopLevel[objectTransferService with Double]
  
  /* 2 */ @js.native
  object positioningService extends TopLevel[positioningService with Double]
  
  /* 4 */ @js.native
  object renderingService extends TopLevel[renderingService with Double]
  
  /* 8 */ @js.native
  object telephoneService extends TopLevel[telephoneService with Double]
  
}

