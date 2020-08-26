package typings.wordpressDependencyExtractionWebpackPlugin.mod

import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.json
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.php
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * By default, one asset file is created for each entry point. When this flag is set to true, all information about assets is combined into a single assets.(json|php) file generated in the output directory.
    */
  var combineAssets: js.UndefOr[Boolean] = js.native
  /**
    * This option is useful only when the combineAssets option is enabled. It allows providing a custom output file for the generated single assets file. It's possible to provide a path that is relative to the output directory.
    */
  var combinedOutputFile: String | Null = js.native
  /**
    * Force wp-polyfill to be included in each entry point's dependency list. This is like importing `@wordpress/polyfill` for each entry point.
    */
  var injectPolyfill: Boolean = js.native
  /**
    * The output format for the generated asset file.
    */
  var outputFormat: json | php = js.native
  /**
    * Map module requests to an external.
    */
  var requestToExternal: js.UndefOr[RequestToExternal] = js.native
  /**
    * Map module requests to a script handle.
    */
  var requestToHandle: js.UndefOr[RequestToHandle] = js.native
  /**
    * Set to `false` to disable the default WordPress script request handling.
    */
  var useDefaults: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(injectPolyfill: Boolean, outputFormat: json | php, useDefaults: Boolean): Options = {
    val __obj = js.Dynamic.literal(injectPolyfill = injectPolyfill.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], useDefaults = useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInjectPolyfill(value: Boolean): Self = this.set("injectPolyfill", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputFormat(value: json | php): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseDefaults(value: Boolean): Self = this.set("useDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setCombineAssets(value: Boolean): Self = this.set("combineAssets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombineAssets: Self = this.set("combineAssets", js.undefined)
    @scala.inline
    def setCombinedOutputFile(value: String): Self = this.set("combinedOutputFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setCombinedOutputFileNull: Self = this.set("combinedOutputFile", null)
    @scala.inline
    def setRequestToExternal(value: /* request */ String => String | Unit | js.Array[String]): Self = this.set("requestToExternal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestToExternal: Self = this.set("requestToExternal", js.undefined)
    @scala.inline
    def setRequestToHandle(value: /* request */ String => String | Unit): Self = this.set("requestToHandle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestToHandle: Self = this.set("requestToHandle", js.undefined)
  }
  
}

