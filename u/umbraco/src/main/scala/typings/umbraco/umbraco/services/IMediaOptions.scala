package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media options
  */
@js.native
trait IMediaOptions extends js.Object {
  var imageOnly: Boolean = js.native
  var mediaModel: IMediaModel = js.native
}

object IMediaOptions {
  @scala.inline
  def apply(imageOnly: Boolean, mediaModel: IMediaModel): IMediaOptions = {
    val __obj = js.Dynamic.literal(imageOnly = imageOnly.asInstanceOf[js.Any], mediaModel = mediaModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaOptions]
  }
  @scala.inline
  implicit class IMediaOptionsOps[Self <: IMediaOptions] (val x: Self) extends AnyVal {
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
    def setImageOnly(value: Boolean): Self = this.set("imageOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaModel(value: IMediaModel): Self = this.set("mediaModel", value.asInstanceOf[js.Any])
  }
  
}

