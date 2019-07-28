package typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DownloadFailed event. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadFailedEventArgs")
@js.native
abstract class AdaptiveMediaSourceDownloadFailedEventArgs () extends js.Object {
  /** Gets the http response message, if any, returned from the failed media download request. */
  var httpResponseMessage: HttpResponseMessage = js.native
  /** Gets the byte range length of the failed media download request. */
  var resourceByteRangeLength: Double = js.native
  /** Gets the byte range offset of the failed media download request. */
  var resourceByteRangeOffset: Double = js.native
  /** Gets the resource type of the failed media download request. */
  var resourceType: AdaptiveMediaSourceResourceType = js.native
  /** Gets the resource URI of the failed media download request. */
  var resourceUri: Uri = js.native
}

