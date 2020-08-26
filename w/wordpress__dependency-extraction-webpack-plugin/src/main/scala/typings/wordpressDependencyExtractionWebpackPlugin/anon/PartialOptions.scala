package typings.wordpressDependencyExtractionWebpackPlugin.anon

import typings.wordpressDependencyExtractionWebpackPlugin.mod.RequestToExternal
import typings.wordpressDependencyExtractionWebpackPlugin.mod.RequestToHandle
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.json
import typings.wordpressDependencyExtractionWebpackPlugin.wordpressDependencyExtractionWebpackPluginStrings.php
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/dependency-extraction-webpack-plugin.@wordpress/dependency-extraction-webpack-plugin.Options> */
@js.native
trait PartialOptions extends js.Object {
  var combineAssets: js.UndefOr[Boolean] = js.native
  var combinedOutputFile: js.UndefOr[String | Null] = js.native
  var injectPolyfill: js.UndefOr[Boolean] = js.native
  var outputFormat: js.UndefOr[json | php] = js.native
  var requestToExternal: js.UndefOr[RequestToExternal] = js.native
  var requestToHandle: js.UndefOr[RequestToHandle] = js.native
  var useDefaults: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setCombineAssets(value: Boolean): Self = this.set("combineAssets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombineAssets: Self = this.set("combineAssets", js.undefined)
    @scala.inline
    def setCombinedOutputFile(value: String): Self = this.set("combinedOutputFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombinedOutputFile: Self = this.set("combinedOutputFile", js.undefined)
    @scala.inline
    def setCombinedOutputFileNull: Self = this.set("combinedOutputFile", null)
    @scala.inline
    def setInjectPolyfill(value: Boolean): Self = this.set("injectPolyfill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInjectPolyfill: Self = this.set("injectPolyfill", js.undefined)
    @scala.inline
    def setOutputFormat(value: json | php): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    @scala.inline
    def setRequestToExternal(value: /* request */ String => String | Unit | js.Array[String]): Self = this.set("requestToExternal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestToExternal: Self = this.set("requestToExternal", js.undefined)
    @scala.inline
    def setRequestToHandle(value: /* request */ String => String | Unit): Self = this.set("requestToHandle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestToHandle: Self = this.set("requestToHandle", js.undefined)
    @scala.inline
    def setUseDefaults(value: Boolean): Self = this.set("useDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDefaults: Self = this.set("useDefaults", js.undefined)
  }
  
}

