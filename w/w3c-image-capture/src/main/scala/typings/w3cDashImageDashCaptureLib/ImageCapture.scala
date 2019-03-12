package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ImageCapture")
@js.native
class ImageCapture protected () extends js.Object {
  def this(videoTrack: stdLib.MediaStreamTrack) = this()
  val track: stdLib.MediaStreamTrack = js.native
  def getPhotoCapabilities(): js.Promise[PhotoCapabilities] = js.native
  def getPhotoSettings(): js.Promise[PhotoSettings] = js.native
  def grabFrame(): js.Promise[stdLib.ImageBitmap] = js.native
  def takePhoto(): js.Promise[stdLib.Blob] = js.native
  def takePhoto(photoSettings: PhotoSettings): js.Promise[stdLib.Blob] = js.native
}

