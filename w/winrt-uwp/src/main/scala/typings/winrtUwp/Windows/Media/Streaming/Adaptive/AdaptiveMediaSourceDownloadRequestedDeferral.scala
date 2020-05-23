package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content. */
trait AdaptiveMediaSourceDownloadRequestedDeferral extends js.Object {
  /** Informs the system that an asynchronous operation associated with a DownloadRequested event has finished. */
  def complete(): Unit
}

object AdaptiveMediaSourceDownloadRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): AdaptiveMediaSourceDownloadRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadRequestedDeferral]
  }
}

