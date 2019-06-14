package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioDeviceNodeCreationStatus extends js.Object

/** Defines status values for audio device node creation. */
@JSGlobal("Windows.Media.Audio.AudioDeviceNodeCreationStatus")
@js.native
object AudioDeviceNodeCreationStatus extends js.Object {
  /** Access to the audio device was denied. */
  @js.native
  sealed trait accessDenied
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus
  
  /** The audio device is not available. */
  @js.native
  sealed trait deviceNotAvailable
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus
  
  /** The format for audio device node creation is not supported. */
  @js.native
  sealed trait formatNotSupported
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus
  
  /** Audio device node creation succeeded. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus
  
  /** An unknown failure occurred in creation of the audio device node. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus
  
  /* 4 */ val accessDenied: accessDenied with scala.Double = js.native
  /* 1 */ val deviceNotAvailable: deviceNotAvailable with scala.Double = js.native
  /* 2 */ val formatNotSupported: formatNotSupported with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 3 */ val unknownFailure: unknownFailure with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus with scala.Double
  ] = js.native
}

