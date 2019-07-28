package typings.svg2png.svg2pngMod

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
    height: Int | Double = null,
    url: String = null,
    width: Int | Double = null
  ): opts = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[opts]
  }
}

