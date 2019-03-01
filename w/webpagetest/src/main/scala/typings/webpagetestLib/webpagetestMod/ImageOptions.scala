package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  /** returns the base64 string representation (inline) of actual image */
  var dataURI: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the thumbnail of actual image */
  var thumbnail: js.UndefOr[scala.Boolean] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(
    dataURI: js.UndefOr[scala.Boolean] = js.undefined,
    thumbnail: js.UndefOr[scala.Boolean] = js.undefined
  ): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataURI)) __obj.updateDynamic("dataURI")(dataURI)
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[ImageOptions]
  }
}

