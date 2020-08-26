package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mediapicker dialog options object
  */
@js.native
trait IMediaPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function = js.native
  /*Only display files that have an image file-extension*/
  var onlyImages: Boolean = js.native
}

object IMediaPickerOptions {
  @scala.inline
  def apply(callback: js.Function, onlyImages: Boolean): IMediaPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], onlyImages = onlyImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaPickerOptions]
  }
  @scala.inline
  implicit class IMediaPickerOptionsOps[Self <: IMediaPickerOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyImages(value: Boolean): Self = this.set("onlyImages", value.asInstanceOf[js.Any])
  }
  
}

