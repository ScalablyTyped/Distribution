package typings.svg2png.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait opts extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object opts {
  @scala.inline
  def apply(
    fileName: String = null,
    height: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): opts = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[opts]
  }
}

