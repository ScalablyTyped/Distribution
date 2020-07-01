package typings.svg2ttf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  var copyright: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  /**
    * Unix timestamp (in seconds) to override creation time
    */
  var ts: js.UndefOr[Double] = js.undefined
  /**
    * manufacturer url
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * font version string, can be Version x.y or x.y
    * @default 'Version 1.0'
    */
  var version: js.UndefOr[String] = js.undefined
}

object FontOptions {
  @scala.inline
  def apply(
    copyright: String = null,
    description: String = null,
    ts: js.UndefOr[Double] = js.undefined,
    url: String = null,
    version: String = null
  ): FontOptions = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOptions]
  }
}

