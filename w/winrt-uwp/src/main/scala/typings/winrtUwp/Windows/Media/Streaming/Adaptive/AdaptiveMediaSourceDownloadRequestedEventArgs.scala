package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DownloadRequested event. */
trait AdaptiveMediaSourceDownloadRequestedEventArgs extends js.Object {
  /** Gets the byte range length of the media download request. */
  var resourceByteRangeLength: Double
  /** Gets the byte range offset of the media download request. */
  var resourceByteRangeOffset: Double
  /** Gets the resource type of the media download request. */
  var resourceType: AdaptiveMediaSourceResourceType
  /** Gets the resource URI of the media download request. */
  var resourceUri: Uri
  /** Gets an AdaptiveMediaSourceDownloadResult object representing the result of the media download request. */
  var result: AdaptiveMediaSourceDownloadResult
  /**
    * Gets a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content.
    * @return A deferral that can be used to defer the completion of the DownloadRequested event.
    */
  def getDeferral(): AdaptiveMediaSourceDownloadRequestedDeferral
}

object AdaptiveMediaSourceDownloadRequestedEventArgs {
  @scala.inline
  def apply(
    getDeferral: () => AdaptiveMediaSourceDownloadRequestedDeferral,
    resourceByteRangeLength: Double,
    resourceByteRangeOffset: Double,
    resourceType: AdaptiveMediaSourceResourceType,
    resourceUri: Uri,
    result: AdaptiveMediaSourceDownloadResult
  ): AdaptiveMediaSourceDownloadRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), resourceByteRangeLength = resourceByteRangeLength.asInstanceOf[js.Any], resourceByteRangeOffset = resourceByteRangeOffset.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadRequestedEventArgs]
  }
}

