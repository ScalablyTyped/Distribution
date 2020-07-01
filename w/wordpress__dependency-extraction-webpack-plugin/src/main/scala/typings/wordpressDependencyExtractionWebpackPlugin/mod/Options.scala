package typings.wordpressDependencyExtractionWebpackPlugin.mod

import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.json
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.php
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * By default, one asset file is created for each entry point. When this flag is set to true, all information about assets is combined into a single assets.(json|php) file generated in the output directory.
    */
  var combineAssets: js.UndefOr[Boolean] = js.undefined
  /**
    * This option is useful only when the combineAssets option is enabled. It allows providing a custom output file for the generated single assets file. It's possible to provide a path that is relative to the output directory.
    */
  var combinedOutputFile: String | Null
  /**
    * Force wp-polyfill to be included in each entry point's dependency list. This is like importing `@wordpress/polyfill` for each entry point.
    */
  var injectPolyfill: Boolean
  /**
    * The output format for the generated asset file.
    */
  var outputFormat: json | php
  /**
    * Map module requests to an external.
    */
  var requestToExternal: js.UndefOr[RequestToExternal] = js.undefined
  /**
    * Map module requests to a script handle.
    */
  var requestToHandle: js.UndefOr[RequestToHandle] = js.undefined
  /**
    * Set to `false` to disable the default WordPress script request handling.
    */
  var useDefaults: Boolean
}

object Options {
  @scala.inline
  def apply(
    injectPolyfill: Boolean,
    outputFormat: json | php,
    useDefaults: Boolean,
    combineAssets: js.UndefOr[Boolean] = js.undefined,
    combinedOutputFile: String = null,
    requestToExternal: /* request */ String => String | Unit | js.Array[String] = null,
    requestToHandle: /* request */ String => String | Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal(injectPolyfill = injectPolyfill.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], useDefaults = useDefaults.asInstanceOf[js.Any], combinedOutputFile = combinedOutputFile.asInstanceOf[js.Any])
    if (!js.isUndefined(combineAssets)) __obj.updateDynamic("combineAssets")(combineAssets.get.asInstanceOf[js.Any])
    if (requestToExternal != null) __obj.updateDynamic("requestToExternal")(js.Any.fromFunction1(requestToExternal))
    if (requestToHandle != null) __obj.updateDynamic("requestToHandle")(js.Any.fromFunction1(requestToHandle))
    __obj.asInstanceOf[Options]
  }
}

