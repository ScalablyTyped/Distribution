package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

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
  sealed trait audioVideo
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** A computer. Example devices are desktop, notebook, PDA and organizer. */
  @js.native
  sealed trait computer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** A health device. An example is a heart rate monitor. */
  @js.native
  sealed trait health
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** An imaging device. Examples are printer, scanner, camera and display. */
  @js.native
  sealed trait imaging
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** Used when a more specific Major Class code is not suitable. */
  @js.native
  sealed trait miscellaneous
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** A LAN or network Access Point. */
  @js.native
  sealed trait networkAccessPoint
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** A peripheral device. Examples are mouse, joystick and keyboard. */
  @js.native
  sealed trait peripheral
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** A phone. Example devices are cellular, cordless, pay phone and modem. */
  @js.native
  sealed trait phone
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** A toy. */
  @js.native
  sealed trait toy
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  /** A wearable device. */
  @js.native
  sealed trait wearable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass
  
  val audioVideo: audioVideo with java.lang.String = js.native
  val computer: computer with java.lang.String = js.native
  val health: health with java.lang.String = js.native
  val imaging: imaging with java.lang.String = js.native
  val miscellaneous: miscellaneous with java.lang.String = js.native
  val networkAccessPoint: networkAccessPoint with java.lang.String = js.native
  val peripheral: peripheral with java.lang.String = js.native
  val phone: phone with java.lang.String = js.native
  val toy: toy with java.lang.String = js.native
  val wearable: wearable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass with java.lang.String
  ] = js.native
}

