package typings
package winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral")
@js.native
abstract class AdaptiveMediaSourceDownloadRequestedDeferral () extends js.Object {
  /** Informs the system that an asynchronous operation associated with a DownloadRequested event has finished. */
  def complete(): scala.Unit = js.native
}

