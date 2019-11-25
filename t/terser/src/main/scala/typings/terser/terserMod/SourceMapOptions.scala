package typings.terser.terserMod

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.terser.terserStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapOptions extends js.Object {
  var content: js.UndefOr[RawSourceMap] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var includeSources: js.UndefOr[Boolean] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String | `inline`] = js.undefined
}

object SourceMapOptions {
  @scala.inline
  def apply(
    content: RawSourceMap = null,
    filename: String = null,
    includeSources: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    url: String | `inline` = null
  ): SourceMapOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSources)) __obj.updateDynamic("includeSources")(includeSources.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapOptions]
  }
}

