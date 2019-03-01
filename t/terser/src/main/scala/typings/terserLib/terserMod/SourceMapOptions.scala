package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapOptions extends js.Object {
  var content: js.UndefOr[sourceDashMapLib.sourceDashMapMod.RawSourceMap] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var includeSources: js.UndefOr[scala.Boolean] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String | terserLib.terserLibStrings.`inline`] = js.undefined
}

object SourceMapOptions {
  @scala.inline
  def apply(
    content: sourceDashMapLib.sourceDashMapMod.RawSourceMap = null,
    filename: java.lang.String = null,
    includeSources: js.UndefOr[scala.Boolean] = js.undefined,
    root: java.lang.String = null,
    url: java.lang.String | terserLib.terserLibStrings.`inline` = null
  ): SourceMapOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(includeSources)) __obj.updateDynamic("includeSources")(includeSources)
    if (root != null) __obj.updateDynamic("root")(root)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapOptions]
  }
}

