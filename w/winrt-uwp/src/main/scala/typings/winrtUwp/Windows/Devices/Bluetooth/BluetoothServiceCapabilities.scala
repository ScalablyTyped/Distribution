package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothServiceCapabilities extends StObject
/** Indicates the service capabilities of a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothServiceCapabilities")
@js.native
object BluetoothServiceCapabilities extends StObject {
  
  /** Audio, for example, speaker, microphone, headset service. */
  @js.native
  sealed trait audioService
    extends StObject
       with BluetoothServiceCapabilities
  
  /** Capturing, for example, scanner, microphone. */
  @js.native
  sealed trait capturingService
    extends StObject
       with BluetoothServiceCapabilities
  
  /** Information, for example, web server, WAP server. */
  @js.native
  sealed trait informationService
    extends StObject
       with BluetoothServiceCapabilities
  
  /** Limited Discoverable Mode. */
  @js.native
  sealed trait limitedDiscoverableMode
    extends StObject
       with BluetoothServiceCapabilities
  
  /** Networking, for example, LAN, Ad hoc. */
  @js.native
  sealed trait networkingService
    extends StObject
       with BluetoothServiceCapabilities
  
  /** None. */
  @js.native
  sealed trait none
    extends StObject
       with BluetoothServiceCapabilities
  
  /** Object Transfer, for example, v-Inbox, v-folder. */
  @js.native
  sealed trait objectTransferService
    extends StObject
       with BluetoothServiceCapabilities
  
  /** Positioning or location identification. */
  @js.native
  sealed trait positioningService
    extends StObject
       with BluetoothServiceCapabilities
  
  /** Rendering, for example, printer, speakers. */
  @js.native
  sealed trait renderingService
    extends StObject
       with BluetoothServiceCapabilities
  
  /** Telephony, for example cordless, modem, headset service. */
  @js.native
  sealed trait telephoneService
    extends StObject
       with BluetoothServiceCapabilities
}
