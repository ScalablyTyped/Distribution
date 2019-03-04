package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageEncodingPropertiesStatics extends js.Object {
  def createJpeg(): ImageEncodingProperties
  def createJpegXR(): ImageEncodingProperties
  def createPng(): ImageEncodingProperties
}

object IImageEncodingPropertiesStatics {
  @scala.inline
  def apply(
    createJpeg: js.Function0[ImageEncodingProperties],
    createJpegXR: js.Function0[ImageEncodingProperties],
    createPng: js.Function0[ImageEncodingProperties]
  ): IImageEncodingPropertiesStatics = {
    val __obj = js.Dynamic.literal(createJpeg = createJpeg, createJpegXR = createJpegXR, createPng = createPng)
  
    __obj.asInstanceOf[IImageEncodingPropertiesStatics]
  }
}

