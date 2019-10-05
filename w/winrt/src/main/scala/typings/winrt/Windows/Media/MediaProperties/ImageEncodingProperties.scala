package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
class ImageEncodingProperties () extends IImageEncodingProperties {
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var properties: MediaPropertySet = js.native
  /* CompleteClass */
  override var subtype: String = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override var width: Double = js.native
}

/* static members */
@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
object ImageEncodingProperties extends js.Object {
  def createJpeg(): ImageEncodingProperties = js.native
  def createJpegXR(): ImageEncodingProperties = js.native
  def createPng(): ImageEncodingProperties = js.native
}

