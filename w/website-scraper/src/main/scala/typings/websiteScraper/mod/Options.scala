package typings.websiteScraper.mod

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
    maxDepth: js.UndefOr[Double] = js.undefined,
    maxRecursiveDepth: js.UndefOr[Double] = js.undefined,
    plugins: js.Array[js.Object] = null,
    prettifyUrls: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined,
    request: RequestOptions = null,
    requestConcurrency: js.UndefOr[Double] = js.undefined,
    sources: js.Array[Source] = null,
    subdirectories: js.UndefOr[Null | js.Array[SubDirectory]] = js.undefined,
    urlFilter: /* url */ String => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    if (defaultFilename != null) __obj.updateDynamic("defaultFilename")(defaultFilename.asInstanceOf[js.Any])
    if (filenameGenerator != null) __obj.updateDynamic("filenameGenerator")(filenameGenerator.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRecursiveDepth)) __obj.updateDynamic("maxRecursiveDepth")(maxRecursiveDepth.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(prettifyUrls)) __obj.updateDynamic("prettifyUrls")(prettifyUrls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(requestConcurrency)) __obj.updateDynamic("requestConcurrency")(requestConcurrency.get.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (!js.isUndefined(subdirectories)) __obj.updateDynamic("subdirectories")(subdirectories.asInstanceOf[js.Any])
    if (urlFilter != null) __obj.updateDynamic("urlFilter")(js.Any.fromFunction1(urlFilter))
    __obj.asInstanceOf[Options]
  }
}

