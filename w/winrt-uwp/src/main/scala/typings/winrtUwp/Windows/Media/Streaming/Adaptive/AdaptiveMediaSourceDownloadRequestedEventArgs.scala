package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DownloadRequested event. */
@js.native
trait AdaptiveMediaSourceDownloadRequestedEventArgs extends js.Object {
  /** Gets the byte range length of the media download request. */
  var resourceByteRangeLength: Double = js.native
  /** Gets the byte range offset of the media download request. */
  var resourceByteRangeOffset: Double = js.native
  /** Gets the resource type of the media download request. */
  var resourceType: AdaptiveMediaSourceResourceType = js.native
  /** Gets the resource URI of the media download request. */
  var resourceUri: Uri = js.native
  /** Gets an AdaptiveMediaSourceDownloadResult object representing the result of the media download request. */
  var result: AdaptiveMediaSourceDownloadResult = js.native
  /**
    * Gets a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content.
    * @return A deferral that can be used to defer the completion of the DownloadRequested event.
    */
  def getDeferral(): AdaptiveMediaSourceDownloadRequestedDeferral = js.native
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
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadRequestedEventArgsOps[Self <: AdaptiveMediaSourceDownloadRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDeferral(value: () => AdaptiveMediaSourceDownloadRequestedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setResourceByteRangeLength(value: Double): Self = this.set("resourceByteRangeLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceByteRangeOffset(value: Double): Self = this.set("resourceByteRangeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: AdaptiveMediaSourceResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceUri(value: Uri): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: AdaptiveMediaSourceDownloadResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

