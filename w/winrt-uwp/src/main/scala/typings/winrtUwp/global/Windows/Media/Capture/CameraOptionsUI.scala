package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a method for displaying a UI, by which the UI contains options for the capture of photos, audio recordings and videos. */
@JSGlobal("Windows.Media.Capture.CameraOptionsUI")
@js.native
abstract class CameraOptionsUI ()
  extends typings.winrtUwp.Windows.Media.Capture.CameraOptionsUI
object CameraOptionsUI {
  
  /**
    * Displays a UI that contains options for the capture of photos, audio recordings and videos.
    * @param mediaCapture The MediaCapture object that provides methods for the capture of photos, audio recordings and videos.
    */
  /* static member */
  @JSGlobal("Windows.Media.Capture.CameraOptionsUI.show")
  @js.native
  def show(mediaCapture: typings.winrtUwp.Windows.Media.Capture.MediaCapture): Unit = js.native
}
