package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed retrieving the MediaStreamSample . */
@js.native
trait MediaStreamSourceSampleRequestDeferral extends js.Object {
  /** Reports that the application has completed retrieving the MediaStreamSample . */
  def complete(): Unit = js.native
}

object MediaStreamSourceSampleRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceSampleRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceSampleRequestDeferral]
  }
  @scala.inline
  implicit class MediaStreamSourceSampleRequestDeferralOps[Self <: MediaStreamSourceSampleRequestDeferral] (val x: Self) extends AnyVal {
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

