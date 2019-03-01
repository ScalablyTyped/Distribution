package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media options
  */
trait IMediaOptions extends js.Object {
  var imageOnly: scala.Boolean
  var mediaModel: IMediaModel
}

object IMediaOptions {
  @scala.inline
  def apply(imageOnly: scala.Boolean, mediaModel: IMediaModel): IMediaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageOnly")(imageOnly)
    __obj.updateDynamic("mediaModel")(mediaModel)
    __obj.asInstanceOf[IMediaOptions]
  }
}

