package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothMajorClass extends StObject
/** Indicates the Major Class code of the device, which is the general family of device with which the device is associated. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothMajorClass")
@js.native
object BluetoothMajorClass extends StObject {
  
  /** An audio or video device. Example devices are headset, speaker, stereo, video display and VCR. */
  @js.native
  sealed trait audioVideo
    extends StObject
       with BluetoothMajorClass
  
  /** A computer. Example devices are desktop, notebook, PDA and organizer. */
  @js.native
  sealed trait computer
    extends StObject
       with BluetoothMajorClass
  
  /** A health device. An example is a heart rate monitor. */
  @js.native
  sealed trait health
    extends StObject
       with BluetoothMajorClass
  
  /** An imaging device. Examples are printer, scanner, camera and display. */
  @js.native
  sealed trait imaging
    extends StObject
       with BluetoothMajorClass
  
  /** Used when a more specific Major Class code is not suitable. */
  @js.native
  sealed trait miscellaneous
    extends StObject
       with BluetoothMajorClass
  
  /** A LAN or network Access Point. */
  @js.native
  sealed trait networkAccessPoint
    extends StObject
       with BluetoothMajorClass
  
  /** A peripheral device. Examples are mouse, joystick and keyboard. */
  @js.native
  sealed trait peripheral
    extends StObject
       with BluetoothMajorClass
  
  /** A phone. Example devices are cellular, cordless, pay phone and modem. */
  @js.native
  sealed trait phone
    extends StObject
       with BluetoothMajorClass
  
  /** A toy. */
  @js.native
  sealed trait toy
    extends StObject
       with BluetoothMajorClass
  
  /** A wearable device. */
  @js.native
  sealed trait wearable
    extends StObject
       with BluetoothMajorClass
}
