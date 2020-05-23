package typings.winrtUwp.Windows.Media.Streaming.Adaptive

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
  
}

