package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KnownVideoProfile extends js.Object

/** Specifies the names of video recording profiles that are known by the system. */
@JSGlobal("Windows.Media.Capture.KnownVideoProfile")
@js.native
object KnownVideoProfile extends js.Object {
  /** The profile provides hints to the driver to allow for photo capture during video capture with balanced quality between both. */
  @js.native
  sealed trait balancedVideoAndPhoto
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.KnownVideoProfile
  
  /** The profile provides hints to the driver to optimize for high-quality photo capture. */
  @js.native
  sealed trait highQualityPhoto
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.KnownVideoProfile
  
  /** The profile provides hints to the driver to optimize for capturing photo sequences. */
  @js.native
  sealed trait photoSequence
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.KnownVideoProfile
  
  /** The profile provides hints to the driver to optimize for VoIP scenarios, prioritizing lower power consumption, lower latency, and concurrency (e.g. using the front and back cameras of a device simultaneously) while deprioritizing higher resolution. */
  @js.native
  sealed trait videoConferencing
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.KnownVideoProfile
  
  /** The profile provides hints to the driver to optimize for high-quality video, prioritizing higher resolution and frame rates over power consumption and latency. */
  @js.native
  sealed trait videoRecording
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.KnownVideoProfile
  
  /* 2 */ val balancedVideoAndPhoto: balancedVideoAndPhoto with scala.Double = js.native
  /* 1 */ val highQualityPhoto: highQualityPhoto with scala.Double = js.native
  /* 4 */ val photoSequence: photoSequence with scala.Double = js.native
  /* 3 */ val videoConferencing: videoConferencing with scala.Double = js.native
  /* 0 */ val videoRecording: videoRecording with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.KnownVideoProfile with scala.Double] = js.native
}

