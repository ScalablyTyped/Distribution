package typings.webpackConcatPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyJs.mod.MinifyOptions
import typings.webpackConcatPlugin.webpackConcatPluginStrings.append
import typings.webpackConcatPlugin.webpackConcatPluginStrings.none
import typings.webpackConcatPlugin.webpackConcatPluginStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** if set, will be used as the extra attributes of the script tag. */
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** if set, will be used as the output fileName */
  var fileName: js.UndefOr[String] = js.undefined
  /**
    * supported path patterns:
    * - normal path
    * - npm packages
    * - glob
    */
  var filesToConcat: js.Array[String | js.Array[String]]
  /**
    * how to auto inject to html-webpack-plugin
    * (only if html-webpack-plugin set inject option not to be false)
    */
  var injectType: js.UndefOr[prepend | append | none] = js.undefined
  /** it's useful when you want to inject to html-webpack-plugin manully */
  var name: js.UndefOr[String] = js.undefined
  /** if set, will be used as the output directory of the file. */
  var outputPath: js.UndefOr[String] = js.undefined
  /**
    * if set, will be used as the public path of the script tag.
    * if set to false, will use relativePath.
    */
  var publicPath: js.UndefOr[String | Boolean] = js.undefined
  /** if true, will output sourcemap */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  /**
    * if true the output file will be uglified
    * or set uglifyjs options to customize the output
    */
  var uglify: js.UndefOr[Boolean | MinifyOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filesToConcat: js.Array[String | js.Array[String]],
    attributes: StringDictionary[js.Any] = null,
    fileName: String = null,
    injectType: prepend | append | none = null,
    name: String = null,
    outputPath: String = null,
    publicPath: String | Boolean = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    uglify: Boolean | MinifyOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal(filesToConcat = filesToConcat.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (injectType != null) __obj.updateDynamic("injectType")(injectType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (uglify != null) __obj.updateDynamic("uglify")(uglify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

