package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mediapicker dialog options object
  */
trait IMediaPickerOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
  /*Only display files that have an image file-extension*/
  var onlyImages: Boolean
}

object IMediaPickerOptions {
  @scala.inline
  def apply(callback: js.Function, onlyImages: Boolean): IMediaPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], onlyImages = onlyImages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMediaPickerOptions]
  }
}

