package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCapture extends js.Object {
   /* unmapped type */ var addEventListener: js.Any
   /* unmapped type */ var isCapturingAudio: js.Any
   /* unmapped type */ var isCapturingVideo: js.Any
   /* unmapped type */ var oncapturingchanged: js.Any
   /* unmapped type */ var removeEventListener: js.Any
}

object AppCapture {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    isCapturingAudio: js.Any,
    isCapturingVideo: js.Any,
    oncapturingchanged: js.Any,
    removeEventListener: js.Any
  ): AppCapture = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], isCapturingAudio = isCapturingAudio.asInstanceOf[js.Any], isCapturingVideo = isCapturingVideo.asInstanceOf[js.Any], oncapturingchanged = oncapturingchanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCapture]
  }
}

