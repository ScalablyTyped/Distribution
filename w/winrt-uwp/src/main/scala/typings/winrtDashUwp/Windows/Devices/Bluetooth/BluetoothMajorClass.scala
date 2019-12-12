package typings.winrtDashUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.audioVideo
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.computer
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.health
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.imaging
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.miscellaneous
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.networkAccessPoint
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.peripheral
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.phone
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.toy
import typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothMajorClass.wearable
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothMajorClass with Double] = js.native
  /* 4 */ @js.native
  object audioVideo extends TopLevel[audioVideo with Double]
  
  /* 1 */ @js.native
  object computer extends TopLevel[computer with Double]
  
  /* 9 */ @js.native
  object health extends TopLevel[health with Double]
  
  /* 6 */ @js.native
  object imaging extends TopLevel[imaging with Double]
  
  /* 0 */ @js.native
  object miscellaneous extends TopLevel[miscellaneous with Double]
  
  /* 3 */ @js.native
  object networkAccessPoint extends TopLevel[networkAccessPoint with Double]
  
  /* 5 */ @js.native
  object peripheral extends TopLevel[peripheral with Double]
  
  /* 2 */ @js.native
  object phone extends TopLevel[phone with Double]
  
  /* 8 */ @js.native
  object toy extends TopLevel[toy with Double]
  
  /* 7 */ @js.native
  object wearable extends TopLevel[wearable with Double]
  
}

