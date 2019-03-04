package typings
package websiteDashScraperLib.websiteDashScraperMod.websiteScraperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultFilename: js.UndefOr[java.lang.String] = js.undefined
  var directory: java.lang.String
  var filenameGenerator: js.UndefOr[java.lang.String] = js.undefined
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  var prettifyUrls: js.UndefOr[scala.Boolean] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[RequestOptions] = js.undefined
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  var subdirectories: js.UndefOr[js.Array[SubDirectory] | scala.Null] = js.undefined
  var urlFilter: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Boolean]] = js.undefined
  var urls: js.Array[java.lang.String | Url]
}

object Options {
  @scala.inline
  def apply(
    directory: java.lang.String,
    urls: js.Array[java.lang.String | Url],
    defaultFilename: java.lang.String = null,
    filenameGenerator: java.lang.String = null,
    ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined,
    maxDepth: scala.Int | scala.Double = null,
    prettifyUrls: js.UndefOr[scala.Boolean] = js.undefined,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    request: RequestOptions = null,
    sources: js.Array[Source] = null,
    subdirectories: js.Array[SubDirectory] = null,
    urlFilter: js.Function1[/* url */ java.lang.String, scala.Boolean] = null
  ): Options = {
    val __obj = js.Dynamic.literal(directory = directory, urls = urls)
    if (defaultFilename != null) __obj.updateDynamic("defaultFilename")(defaultFilename)
    if (filenameGenerator != null) __obj.updateDynamic("filenameGenerator")(filenameGenerator)
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(prettifyUrls)) __obj.updateDynamic("prettifyUrls")(prettifyUrls)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (request != null) __obj.updateDynamic("request")(request)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (subdirectories != null) __obj.updateDynamic("subdirectories")(subdirectories)
    if (urlFilter != null) __obj.updateDynamic("urlFilter")(urlFilter)
    __obj.asInstanceOf[Options]
  }
}

