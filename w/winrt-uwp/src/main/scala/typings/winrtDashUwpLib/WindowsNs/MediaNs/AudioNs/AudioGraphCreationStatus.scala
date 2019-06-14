package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioGraphCreationStatus extends js.Object

/** Defines status values for audio graph creation. */
@JSGlobal("Windows.Media.Audio.AudioGraphCreationStatus")
@js.native
object AudioGraphCreationStatus extends js.Object {
  /** The PrimaryRenderDevice for the audio graph is not available. */
  @js.native
  sealed trait deviceNotAvailable
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus
  
  /** The audio stream format is not supported by the audio graph. */
  @js.native
  sealed trait formatNotSupported
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus
  
  /** Creation of the audio graph succeeded. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus
  
  /** An unknown failure occurred during creation of the audio graph. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus
  
  /* 1 */ val deviceNotAvailable: deviceNotAvailable with scala.Double = js.native
  /* 2 */ val formatNotSupported: formatNotSupported with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 3 */ val unknownFailure: unknownFailure with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus with scala.Double
  ] = js.native
}

