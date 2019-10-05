package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media options
  */
trait IMediaOptions extends js.Object {
  var imageOnly: Boolean
  var mediaModel: IMediaModel
}

object IMediaOptions {
  @scala.inline
  def apply(imageOnly: Boolean, mediaModel: IMediaModel): IMediaOptions = {
    val __obj = js.Dynamic.literal(imageOnly = imageOnly, mediaModel = mediaModel)
  
    __obj.asInstanceOf[IMediaOptions]
  }
}

