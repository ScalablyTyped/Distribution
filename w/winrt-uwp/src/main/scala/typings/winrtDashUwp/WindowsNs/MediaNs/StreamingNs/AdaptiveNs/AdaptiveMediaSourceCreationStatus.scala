package typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

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
  sealed trait manifestDownloadFailure extends AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed as the result of a failure in parsing the adaptive streaming manifest. */
  @js.native
  sealed trait manifestParseFailure extends AdaptiveMediaSourceCreationStatus
  
  /** The AdaptiveMediaSource object was successfully created. */
  @js.native
  sealed trait success extends AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed because of an unknown failure. */
  @js.native
  sealed trait unknownFailure extends AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed because the content of the adaptive streaming manifest is unsupported. */
  @js.native
  sealed trait unsupportedManifestContentType extends AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed because the profile of the adaptive streaming manifest is unsupported. */
  @js.native
  sealed trait unsupportedManifestProfile extends AdaptiveMediaSourceCreationStatus
  
  /** The creation of the AdaptiveMediaSource object failed because the version of the adaptive streaming manifest is unsupported. */
  @js.native
  sealed trait unsupportedManifestVersion extends AdaptiveMediaSourceCreationStatus
  
  /* 1 */ val manifestDownloadFailure: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus.manifestDownloadFailure with Double = js.native
  /* 2 */ val manifestParseFailure: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus.manifestParseFailure with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus.success with Double = js.native
  /* 6 */ val unknownFailure: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus.unknownFailure with Double = js.native
  /* 3 */ val unsupportedManifestContentType: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus.unsupportedManifestContentType with Double = js.native
  /* 5 */ val unsupportedManifestProfile: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus.unsupportedManifestProfile with Double = js.native
  /* 4 */ val unsupportedManifestVersion: typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs.AdaptiveMediaSourceCreationStatus.unsupportedManifestVersion with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdaptiveMediaSourceCreationStatus with Double] = js.native
}

