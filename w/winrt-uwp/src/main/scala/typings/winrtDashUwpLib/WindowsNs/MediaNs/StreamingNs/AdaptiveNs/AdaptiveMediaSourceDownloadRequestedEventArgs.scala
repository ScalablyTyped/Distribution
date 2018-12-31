package typings
package winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DownloadRequested event. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedEventArgs")
@js.native
abstract class AdaptiveMediaSourceDownloadRequestedEventArgs () extends js.Object {
  /** Gets the byte range length of the media download request. */
  var resourceByteRangeLength: scala.Double = js.native
  /** Gets the byte range offset of the media download request. */
  var resourceByteRangeOffset: scala.Double = js.native
  /** Gets the resource type of the media download request. */
  var resourceType: AdaptiveMediaSourceResourceType = js.native
  /** Gets the resource URI of the media download request. */
  var resourceUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets an AdaptiveMediaSourceDownloadResult object representing the result of the media download request. */
  var result: AdaptiveMediaSourceDownloadResult = js.native
  /**
    * Gets a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content.
    * @return A deferral that can be used to defer the completion of the DownloadRequested event.
    */
  def getDeferral(): AdaptiveMediaSourceDownloadRequestedDeferral = js.native
}

