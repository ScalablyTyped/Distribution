package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraOptionsUIStatics extends js.Object {
  def show(mediaCapture: MediaCapture): scala.Unit
}

object ICameraOptionsUIStatics {
  @scala.inline
  def apply(show: js.Function1[MediaCapture, scala.Unit]): ICameraOptionsUIStatics = {
    val __obj = js.Dynamic.literal(show = show)
  
    __obj.asInstanceOf[ICameraOptionsUIStatics]
  }
}

