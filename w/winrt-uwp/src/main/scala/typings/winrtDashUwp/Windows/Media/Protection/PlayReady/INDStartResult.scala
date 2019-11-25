package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import typings.winrtDashUwp.Windows.Media.Core.MediaStreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the StartAsync result that contains the created PlayReady-ND MediaStreamSource instance. */
trait INDStartResult extends js.Object {
  /** Gets the MediaStreamSource object for the data that the transmitter streams. */
  var mediaStreamSource: MediaStreamSource
}

object INDStartResult {
  @scala.inline
  def apply(mediaStreamSource: MediaStreamSource): INDStartResult = {
    val __obj = js.Dynamic.literal(mediaStreamSource = mediaStreamSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INDStartResult]
  }
}

