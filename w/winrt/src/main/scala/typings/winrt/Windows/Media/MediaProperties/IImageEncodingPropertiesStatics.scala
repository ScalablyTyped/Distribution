package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageEncodingPropertiesStatics extends js.Object {
  def createJpeg(): ImageEncodingProperties = js.native
  def createJpegXR(): ImageEncodingProperties = js.native
  def createPng(): ImageEncodingProperties = js.native
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
  @scala.inline
  implicit class IImageEncodingPropertiesStaticsOps[Self <: IImageEncodingPropertiesStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateJpeg(value: () => ImageEncodingProperties): Self = this.set("createJpeg", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateJpegXR(value: () => ImageEncodingProperties): Self = this.set("createJpegXR", js.Any.fromFunction0(value))
    @scala.inline
    def setCreatePng(value: () => ImageEncodingProperties): Self = this.set("createPng", js.Any.fromFunction0(value))
  }
  
}

