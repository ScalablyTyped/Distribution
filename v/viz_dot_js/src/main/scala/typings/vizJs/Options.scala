package typings.vizJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var engine: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var images: js.UndefOr[js.Array[String]] = js.undefined
  var yInvert: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    engine: String = null,
    files: js.Array[String] = null,
    format: String = null,
    images: js.Array[String] = null,
    yInvert: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (!js.isUndefined(yInvert)) __obj.updateDynamic("yInvert")(yInvert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

