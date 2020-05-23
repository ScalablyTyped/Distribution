package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DownloadFailed event. */
trait AdaptiveMediaSourceDownloadFailedEventArgs extends js.Object {
  /** Gets the http response message, if any, returned from the failed media download request. */
  var httpResponseMessage: HttpResponseMessage
  /** Gets the byte range length of the failed media download request. */
  var resourceByteRangeLength: Double
  /** Gets the byte range offset of the failed media download request. */
  var resourceByteRangeOffset: Double
  /** Gets the resource type of the failed media download request. */
  var resourceType: AdaptiveMediaSourceResourceType
  /** Gets the resource URI of the failed media download request. */
  var resourceUri: Uri
}

object AdaptiveMediaSourceDownloadFailedEventArgs {
  @scala.inline
  def apply(
    httpResponseMessage: HttpResponseMessage,
    resourceByteRangeLength: Double,
    resourceByteRangeOffset: Double,
    resourceType: AdaptiveMediaSourceResourceType,
    resourceUri: Uri
  ): AdaptiveMediaSourceDownloadFailedEventArgs = {
    val __obj = js.Dynamic.literal(httpResponseMessage = httpResponseMessage.asInstanceOf[js.Any], resourceByteRangeLength = resourceByteRangeLength.asInstanceOf[js.Any], resourceByteRangeOffset = resourceByteRangeOffset.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadFailedEventArgs]
  }
}

