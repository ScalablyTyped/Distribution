package typings.terserWebpackPlugin.mod

import typings.std.RegExp
import typings.terser.mod.MinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerserPluginOptions extends js.Object {
  /**
    * ⚠ Ignored in webpack 5! Please use {@link webpack.js.org/configuration/other-options/#cache.}
    * Enable/disable file caching.
    * Default path to cache directory: `node_modules/.cache/terser-webpack-plugin`.
    * @default true
    */
  var cache: js.UndefOr[Boolean | String] = js.undefined
  /**
    * ⚠ Ignored in webpack 5! Please use {@link webpack.js.org/configuration/other-options/#cache}.
    * Allows you to override default cache keys.
    */
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.undefined
  /**
    * Files to exclude.
    * @default undefined
    */
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  /**
    * Whether comments shall be extracted to a separate file, (see details).
    * By default extract only comments using /^\**!|@preserve|@license|@cc_on/i regexp condition and remove remaining comments.
    * If the original file is named foo.js, then the comments will be stored to foo.js.LICENSE.txt.
    * The terserOptions.output.comments option specifies whether the comment will be preserved,
    * i.e. it is possible to preserve some comments (e.g. annotations) while extracting others or even preserving comments that have been extracted
    * @default true
    */
  var extractComments: js.UndefOr[Boolean | String | RegExp | ExtractCommentFn | ExtractCommentOptions] = js.undefined
  /**
    * Files to include.
    * @default undefined
    */
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  /**
    * Allows you to override default minify function.
    * By default plugin uses terser package. Useful for using and testing unpublished versions or forks
    * @default undefined
    */
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, MinifyResult]] = js.undefined
  /**
    * Enable/disable multi-process parallel running.
    * Use multi-process parallel running to improve the build speed. Default number of concurrent runs: os.cpus().length - 1.
    * @default true
    */
  var parallel: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Use source maps to map error message locations to modules (this slows down the compilation).
    * If you use your own minify function please read the minify section for handling source maps correctly.
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  /**
    * Terser minify {@link https://github.com/terser/terser#minify-options|options}.
    */
  var terserOptions: js.UndefOr[MinifyOptions] = js.undefined
  /**
    * Test to match files against.
    * @default /\.m?js(\?.*)?$/i
    */
  var test: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  /**
    * Allow to filter terser warnings.
    * ⚠️ The source argument will contain undefined if you don't use source maps.
    * @default () => true
    */
  var warningsFilter: js.UndefOr[
    js.Function3[
      /* warning */ String, 
      /* file */ String, 
      /* source */ js.UndefOr[String], 
      js.UndefOr[Boolean | Null]
    ]
  ] = js.undefined
}

object TerserPluginOptions {
  @scala.inline
  def apply(
    cache: Boolean | String = null,
    cacheKeys: (/* defaultCacheKeys */ js.Any, /* file */ js.Any) => js.Object = null,
    exclude: String | RegExp | (js.Array[String | RegExp]) = null,
    extractComments: Boolean | String | RegExp | ExtractCommentFn | ExtractCommentOptions = null,
    include: String | RegExp | (js.Array[String | RegExp]) = null,
    minify: (/* file */ js.Any, /* sourceMap */ js.Any) => MinifyResult = null,
    parallel: Boolean | Double = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    terserOptions: MinifyOptions = null,
    test: String | RegExp | (js.Array[String | RegExp]) = null,
    warningsFilter: (/* warning */ String, /* file */ String, /* source */ js.UndefOr[String]) => js.UndefOr[Boolean | Null] = null
  ): TerserPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheKeys != null) __obj.updateDynamic("cacheKeys")(js.Any.fromFunction2(cacheKeys))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extractComments != null) __obj.updateDynamic("extractComments")(extractComments.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (minify != null) __obj.updateDynamic("minify")(js.Any.fromFunction2(minify))
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.get.asInstanceOf[js.Any])
    if (terserOptions != null) __obj.updateDynamic("terserOptions")(terserOptions.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (warningsFilter != null) __obj.updateDynamic("warningsFilter")(js.Any.fromFunction3(warningsFilter))
    __obj.asInstanceOf[TerserPluginOptions]
  }
}

