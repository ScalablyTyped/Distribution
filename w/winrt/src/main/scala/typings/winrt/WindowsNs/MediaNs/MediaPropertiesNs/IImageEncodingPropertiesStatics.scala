package typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs

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
    createJpeg: () => ImageEncodingProperties,
    createJpegXR: () => ImageEncodingProperties,
    createPng: () => ImageEncodingProperties
  ): IImageEncodingPropertiesStatics = {
    val __obj = js.Dynamic.literal(createJpeg = js.Any.fromFunction0(createJpeg), createJpegXR = js.Any.fromFunction0(createJpegXR), createPng = js.Any.fromFunction0(createPng))
  
    __obj.asInstanceOf[IImageEncodingPropertiesStatics]
  }
}

