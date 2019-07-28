package typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapUploaderOptions extends js.Object {
  /**
    * Your Bugsnag API key
    */
  var apiKey: String
  /**
    * The version of the application you are building
    */
  var appVersion: js.UndefOr[String] = js.undefined
  /**
    * Post the build payload to a URL other than the default
    *
    * @default https://upload.bugsnag.com
    */
  var endpoint: js.UndefOr[String] = js.undefined
  /**
    * A list of bundle file extensions which shouldn't be uploaded
    *
    * @default ['.css']
    */
  var ignoredBundleExtensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether you want to overwrite previously uploaded sourcemaps
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  /**
    * The path to your bundled assets (as the browser will see them).
    * This option must either be provided here, or as `output.publicPath` in
    * your Webpack config.
    *
    * @default output.publicPath
    */
  var publicPath: js.UndefOr[String] = js.undefined
}

object SourceMapUploaderOptions {
  @scala.inline
  def apply(
    apiKey: String,
    appVersion: String = null,
    endpoint: String = null,
    ignoredBundleExtensions: js.Array[String] = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    publicPath: String = null
  ): SourceMapUploaderOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey)
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (ignoredBundleExtensions != null) __obj.updateDynamic("ignoredBundleExtensions")(ignoredBundleExtensions)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    __obj.asInstanceOf[SourceMapUploaderOptions]
  }
}

