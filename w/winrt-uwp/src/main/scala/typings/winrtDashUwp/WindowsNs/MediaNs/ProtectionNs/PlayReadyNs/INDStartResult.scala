package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSource
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
    val __obj = js.Dynamic.literal(mediaStreamSource = mediaStreamSource)
  
    __obj.asInstanceOf[INDStartResult]
  }
}

