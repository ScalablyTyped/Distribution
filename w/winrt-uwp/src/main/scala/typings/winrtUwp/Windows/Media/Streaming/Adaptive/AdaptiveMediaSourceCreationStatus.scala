package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdaptiveMediaSourceCreationStatus with Double] = js.native
  /* 1 */ @js.native
  object manifestDownloadFailure extends TopLevel[manifestDownloadFailure with Double]
  
  /* 2 */ @js.native
  object manifestParseFailure extends TopLevel[manifestParseFailure with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 6 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
  /* 3 */ @js.native
  object unsupportedManifestContentType extends TopLevel[unsupportedManifestContentType with Double]
  
  /* 5 */ @js.native
  object unsupportedManifestProfile extends TopLevel[unsupportedManifestProfile with Double]
  
  /* 4 */ @js.native
  object unsupportedManifestVersion extends TopLevel[unsupportedManifestVersion with Double]
  
}

