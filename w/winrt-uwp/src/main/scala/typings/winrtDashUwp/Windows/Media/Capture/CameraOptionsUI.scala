package typings.winrtDashUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a method for displaying a UI, by which the UI contains options for the capture of photos, audio recordings and videos. */
@JSGlobal("Windows.Media.Capture.CameraOptionsUI")
@js.native
abstract class CameraOptionsUI () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Capture.CameraOptionsUI")
@js.native
object CameraOptionsUI extends js.Object {
  /**
    * Displays a UI that contains options for the capture of photos, audio recordings and videos.
    * @param mediaCapture The MediaCapture object that provides methods for the capture of photos, audio recordings and videos.
    */
  def show(mediaCapture: MediaCapture): Unit = js.native
}

