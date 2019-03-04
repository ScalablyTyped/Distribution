package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the StartAsync result that contains the created PlayReady-ND MediaStreamSource instance. */
trait INDStartResult extends js.Object {
  /** Gets the MediaStreamSource object for the data that the transmitter streams. */
  var mediaStreamSource: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSource
}

object INDStartResult {
  @scala.inline
  def apply(mediaStreamSource: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSource): INDStartResult = {
    val __obj = js.Dynamic.literal(mediaStreamSource = mediaStreamSource)
  
    __obj.asInstanceOf[INDStartResult]
  }
}

