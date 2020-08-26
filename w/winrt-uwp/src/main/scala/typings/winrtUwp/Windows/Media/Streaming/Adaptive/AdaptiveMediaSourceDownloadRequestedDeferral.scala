package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content. */
@js.native
trait AdaptiveMediaSourceDownloadRequestedDeferral extends js.Object {
  /** Informs the system that an asynchronous operation associated with a DownloadRequested event has finished. */
  def complete(): Unit = js.native
}

object AdaptiveMediaSourceDownloadRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): AdaptiveMediaSourceDownloadRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadRequestedDeferral]
  }
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadRequestedDeferralOps[Self <: AdaptiveMediaSourceDownloadRequestedDeferral] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
  
}

