package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
class ImageEncodingProperties () extends IImageEncodingProperties {
  /* CompleteClass */
  override var height: scala.Double = js.native
  /* CompleteClass */
  override var properties: MediaPropertySet = js.native
  /* CompleteClass */
  override var subtype: java.lang.String = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override var width: scala.Double = js.native
}

/* static members */
@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
object ImageEncodingProperties extends js.Object {
  def createJpeg(): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties = js.native
  def createJpegXR(): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties = js.native
  def createPng(): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties = js.native
}

