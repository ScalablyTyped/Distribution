package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaCaptureFailedEventArgs extends js.Object {
  var code: scala.Double
  var message: java.lang.String
}

object IMediaCaptureFailedEventArgs {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String): IMediaCaptureFailedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[IMediaCaptureFailedEventArgs]
  }
}

