package typings
package winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdaptiveMediaSourceCreationStatus extends js.Object

/** Specifies the result of an attempt to create a AdaptiveMediaSource object. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus")
@js.native
object AdaptiveMediaSourceCreationStatus extends js.Object {
  /** The creation of the AdaptiveMediaSource object failed as the result of a failure in downloading the adaptive streaming manifest. */
  @js.native
  sealed trait manifestDownloadFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed as the result of a failure in parsing the adaptive streaming manifest. */
  @js.native
  sealed trait manifestParseFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus
  
  /** The AdaptiveMediaSource object was successfully created. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed because of an unknown failure. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed because the content of the adaptive streaming manifest is unsupported. */
  @js.native
  sealed trait unsupportedManifestContentType
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed because the profile of the adaptive streaming manifest is unsupported. */
  @js.native
  sealed trait unsupportedManifestProfile
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed because the version of the adaptive streaming manifest is unsupported. */
  @js.native
  sealed trait unsupportedManifestVersion
    extends winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus
  
  /* 1 */ val manifestDownloadFailure: manifestDownloadFailure with scala.Double = js.native
  /* 2 */ val manifestParseFailure: manifestParseFailure with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 6 */ val unknownFailure: unknownFailure with scala.Double = js.native
  /* 3 */ val unsupportedManifestContentType: unsupportedManifestContentType with scala.Double = js.native
  /* 5 */ val unsupportedManifestProfile: unsupportedManifestProfile with scala.Double = js.native
  /* 4 */ val unsupportedManifestVersion: unsupportedManifestVersion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus with scala.Double
  ] = js.native
}

