package typings.winrtDashUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothMajorClass extends js.Object

/** Indicates the Major Class code of the device, which is the general family of device with which the device is associated. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothMajorClass")
@js.native
object BluetoothMajorClass extends js.Object {
  /** An audio or video device. Example devices are headset, speaker, stereo, video display and VCR. */
  @js.native
  sealed trait audioVideo extends BluetoothMajorClass
  
  /** A computer. Example devices are desktop, notebook, PDA and organizer. */
  @js.native
  sealed trait computer extends BluetoothMajorClass
  
  /** A health device. An example is a heart rate monitor. */
  @js.native
  sealed trait health extends BluetoothMajorClass
  
  /** An imaging device. Examples are printer, scanner, camera and display. */
  @js.native
  sealed trait imaging extends BluetoothMajorClass
  
  /** Used when a more specific Major Class code is not suitable. */
  @js.native
  sealed trait miscellaneous extends BluetoothMajorClass
  
  /** A LAN or network Access Point. */
  @js.native
  sealed trait networkAccessPoint extends BluetoothMajorClass
  
  /** A peripheral device. Examples are mouse, joystick and keyboard. */
  @js.native
  sealed trait peripheral extends BluetoothMajorClass
  
  /** A phone. Example devices are cellular, cordless, pay phone and modem. */
  @js.native
  sealed trait phone extends BluetoothMajorClass
  
  /** A toy. */
  @js.native
  sealed trait toy extends BluetoothMajorClass
  
  /** A wearable device. */
  @js.native
  sealed trait wearable extends BluetoothMajorClass
  
  /* 4 */ val audioVideo: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.audioVideo with Double = js.native
  /* 1 */ val computer: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.computer with Double = js.native
  /* 9 */ val health: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.health with Double = js.native
  /* 6 */ val imaging: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.imaging with Double = js.native
  /* 0 */ val miscellaneous: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.miscellaneous with Double = js.native
  /* 3 */ val networkAccessPoint: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.networkAccessPoint with Double = js.native
  /* 5 */ val peripheral: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.peripheral with Double = js.native
  /* 2 */ val phone: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.phone with Double = js.native
  /* 8 */ val toy: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.toy with Double = js.native
  /* 7 */ val wearable: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.wearable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothMajorClass with Double] = js.native
}

