package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Core.MediaStreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the StartAsync result that contains the created PlayReady-ND MediaStreamSource instance. */
@js.native
trait INDStartResult extends js.Object {
  /** Gets the MediaStreamSource object for the data that the transmitter streams. */
  var mediaStreamSource: MediaStreamSource = js.native
}

object INDStartResult {
  @scala.inline
  def apply(mediaStreamSource: MediaStreamSource): INDStartResult = {
    val __obj = js.Dynamic.literal(mediaStreamSource = mediaStreamSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDStartResult]
  }
  @scala.inline
  implicit class INDStartResultOps[Self <: INDStartResult] (val x: Self) extends AnyVal {
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
    def setMediaStreamSource(value: MediaStreamSource): Self = this.set("mediaStreamSource", value.asInstanceOf[js.Any])
  }
  
}

