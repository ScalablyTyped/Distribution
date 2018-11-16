package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ImageCapture")
@js.native
class ImageCapture protected () extends js.Object {
  def this(videoTrack: webrtcLib.MediaStreamTrack) = this()
  val track: webrtcLib.MediaStreamTrack = js.native
  def getPhotoCapabilities(): stdLib.Promise[PhotoCapabilities] = js.native
  def getPhotoSettings(): stdLib.Promise[PhotoSettings] = js.native
  def grabFrame(): stdLib.Promise[stdLib.ImageBitmap] = js.native
  def takePhoto(): stdLib.Promise[stdLib.Blob] = js.native
  def takePhoto(photoSettings: PhotoSettings): stdLib.Promise[stdLib.Blob] = js.native
}

