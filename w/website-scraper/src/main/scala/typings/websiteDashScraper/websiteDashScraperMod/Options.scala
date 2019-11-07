package typings.websiteDashScraper.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultFilename: js.UndefOr[String] = js.undefined
  var directory: String
  var filenameGenerator: js.UndefOr[String] = js.undefined
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var maxRecursiveDepth: js.UndefOr[Double] = js.undefined
  var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
  var prettifyUrls: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[RequestOptions] = js.undefined
  var requestConcurrency: js.UndefOr[Double] = js.undefined
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  var subdirectories: js.UndefOr[js.Array[SubDirectory] | Null] = js.undefined
  var urlFilter: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.undefined
  var urls: js.Array[String | Url]
}

object Options {
  @scala.inline
  def apply(
    directory: String,
    urls: js.Array[String | Url],
    defaultFilename: String = null,
    filenameGenerator: String = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    maxDepth: Int | Double = null,
    maxRecursiveDepth: Int | Double = null,
    plugins: js.Array[js.Object] = null,
    prettifyUrls: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined,
    request: RequestOptions = null,
    requestConcurrency: Int | Double = null,
    sources: js.Array[Source] = null,
    subdirectories: js.Array[SubDirectory] = null,
    urlFilter: /* url */ String => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal(directory = directory, urls = urls)
    if (defaultFilename != null) __obj.updateDynamic("defaultFilename")(defaultFilename)
    if (filenameGenerator != null) __obj.updateDynamic("filenameGenerator")(filenameGenerator)
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxRecursiveDepth != null) __obj.updateDynamic("maxRecursiveDepth")(maxRecursiveDepth.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(prettifyUrls)) __obj.updateDynamic("prettifyUrls")(prettifyUrls)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (request != null) __obj.updateDynamic("request")(request)
    if (requestConcurrency != null) __obj.updateDynamic("requestConcurrency")(requestConcurrency.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (subdirectories != null) __obj.updateDynamic("subdirectories")(subdirectories)
    if (urlFilter != null) __obj.updateDynamic("urlFilter")(js.Any.fromFunction1(urlFilter))
    __obj.asInstanceOf[Options]
  }
}

