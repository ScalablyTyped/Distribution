package typings.webpagetest.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  /** returns the base64 string representation (inline) of actual image */
  var dataURI: js.UndefOr[Boolean] = js.undefined
  /** returns the thumbnail of actual image */
  var thumbnail: js.UndefOr[Boolean] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(dataURI: js.UndefOr[Boolean] = js.undefined, thumbnail: js.UndefOr[Boolean] = js.undefined): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataURI)) __obj.updateDynamic("dataURI")(dataURI.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

