package typings.wordpressDependencyExtractionWebpackPlugin.anon

import typings.wordpressDependencyExtractionWebpackPlugin.mod.RequestToExternal
import typings.wordpressDependencyExtractionWebpackPlugin.mod.RequestToHandle
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.json
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.php
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/dependency-extraction-webpack-plugin.@wordpress/dependency-extraction-webpack-plugin.Options> */
trait PartialOptions extends js.Object {
  var combineAssets: js.UndefOr[Boolean] = js.undefined
  var combinedOutputFile: js.UndefOr[String] = js.undefined
  var injectPolyfill: js.UndefOr[Boolean] = js.undefined
  var outputFormat: js.UndefOr[json | php] = js.undefined
  var requestToExternal: js.UndefOr[RequestToExternal] = js.undefined
  var requestToHandle: js.UndefOr[RequestToHandle] = js.undefined
  var useDefaults: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    combineAssets: js.UndefOr[Boolean] = js.undefined,
    combinedOutputFile: String = null,
    injectPolyfill: js.UndefOr[Boolean] = js.undefined,
    outputFormat: json | php = null,
    requestToExternal: /* request */ String => String | Unit | js.Array[String] = null,
    requestToHandle: /* request */ String => String | Unit = null,
    useDefaults: js.UndefOr[Boolean] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(combineAssets)) __obj.updateDynamic("combineAssets")(combineAssets.get.asInstanceOf[js.Any])
    if (combinedOutputFile != null) __obj.updateDynamic("combinedOutputFile")(combinedOutputFile.asInstanceOf[js.Any])
    if (!js.isUndefined(injectPolyfill)) __obj.updateDynamic("injectPolyfill")(injectPolyfill.get.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (requestToExternal != null) __obj.updateDynamic("requestToExternal")(js.Any.fromFunction1(requestToExternal))
    if (requestToHandle != null) __obj.updateDynamic("requestToHandle")(js.Any.fromFunction1(requestToHandle))
    if (!js.isUndefined(useDefaults)) __obj.updateDynamic("useDefaults")(useDefaults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

