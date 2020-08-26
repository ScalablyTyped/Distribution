package typings.webpackBugsnagPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapUploaderOptions extends js.Object {
  /**
    * Your Bugsnag API key
    */
  var apiKey: String = js.native
  /**
    * The version of the application you are building
    */
  var appVersion: js.UndefOr[String] = js.native
  /**
    * Post the build payload to a URL other than the default
    *
    * @default https://upload.bugsnag.com
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * A list of bundle file extensions which shouldn't be uploaded
    *
    * @default ['.css']
    */
  var ignoredBundleExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether you want to overwrite previously uploaded sourcemaps
    */
  var overwrite: js.UndefOr[Boolean] = js.native
  /**
    * The path to your bundled assets (as the browser will see them).
    * This option must either be provided here, or as `output.publicPath` in
    * your Webpack config.
    *
    * @default output.publicPath
    */
  var publicPath: js.UndefOr[String] = js.native
}

object SourceMapUploaderOptions {
  @scala.inline
  def apply(apiKey: String): SourceMapUploaderOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapUploaderOptions]
  }
  @scala.inline
  implicit class SourceMapUploaderOptionsOps[Self <: SourceMapUploaderOptions] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppVersion: Self = this.set("appVersion", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setIgnoredBundleExtensionsVarargs(value: String*): Self = this.set("ignoredBundleExtensions", js.Array(value :_*))
    @scala.inline
    def setIgnoredBundleExtensions(value: js.Array[String]): Self = this.set("ignoredBundleExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoredBundleExtensions: Self = this.set("ignoredBundleExtensions", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
  }
  
}

