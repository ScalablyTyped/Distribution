package typings.terserWebpackPlugin.mod

import typings.std.RegExp
import typings.terser.mod.MinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerserPluginOptions extends js.Object {
  /**
    * ⚠ Ignored in webpack 5! Please use {@link webpack.js.org/configuration/other-options/#cache.}
    * Enable/disable file caching.
    * Default path to cache directory: `node_modules/.cache/terser-webpack-plugin`.
    * @default true
    */
  var cache: js.UndefOr[Boolean | String] = js.native
  /**
    * ⚠ Ignored in webpack 5! Please use {@link webpack.js.org/configuration/other-options/#cache}.
    * Allows you to override default cache keys.
    */
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.native
  /**
    * Files to exclude.
    * @default undefined
    */
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  /**
    * Whether comments shall be extracted to a separate file, (see details).
    * By default extract only comments using /^\**!|@preserve|@license|@cc_on/i regexp condition and remove remaining comments.
    * If the original file is named foo.js, then the comments will be stored to foo.js.LICENSE.txt.
    * The terserOptions.output.comments option specifies whether the comment will be preserved,
    * i.e. it is possible to preserve some comments (e.g. annotations) while extracting others or even preserving comments that have been extracted
    * @default true
    */
  var extractComments: js.UndefOr[Boolean | String | RegExp | ExtractCommentFn | ExtractCommentOptions] = js.native
  /**
    * Files to include.
    * @default undefined
    */
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  /**
    * Allows you to override default minify function.
    * By default plugin uses terser package. Useful for using and testing unpublished versions or forks
    * @default undefined
    */
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, MinifyResult]] = js.native
  /**
    * Enable/disable multi-process parallel running.
    * Use multi-process parallel running to improve the build speed. Default number of concurrent runs: os.cpus().length - 1.
    * @default true
    */
  var parallel: js.UndefOr[Boolean | Double] = js.native
  /**
    * Use source maps to map error message locations to modules (this slows down the compilation).
    * If you use your own minify function please read the minify section for handling source maps correctly.
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean] = js.native
  /**
    * Terser minify {@link https://github.com/terser/terser#minify-options|options}.
    */
  var terserOptions: js.UndefOr[MinifyOptions] = js.native
  /**
    * Test to match files against.
    * @default /\.m?js(\?.*)?$/i
    */
  var test: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
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
  ] = js.native
}

object TerserPluginOptions {
  @scala.inline
  def apply(): TerserPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerserPluginOptions]
  }
  @scala.inline
  implicit class TerserPluginOptionsOps[Self <: TerserPluginOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean | String): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCacheKeys(value: (/* defaultCacheKeys */ js.Any, /* file */ js.Any) => js.Object): Self = this.set("cacheKeys", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCacheKeys: Self = this.set("cacheKeys", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExtractCommentsFunction2(value: (/* astNode */ js.Any, /* comment */ js.Any) => Boolean | js.Object): Self = this.set("extractComments", js.Any.fromFunction2(value))
    @scala.inline
    def setExtractComments(value: Boolean | String | RegExp | ExtractCommentFn | ExtractCommentOptions): Self = this.set("extractComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractComments: Self = this.set("extractComments", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setMinify(value: (/* file */ js.Any, /* sourceMap */ js.Any) => MinifyResult): Self = this.set("minify", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setParallel(value: Boolean | Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    @scala.inline
    def setTerserOptions(value: MinifyOptions): Self = this.set("terserOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerserOptions: Self = this.set("terserOptions", js.undefined)
    @scala.inline
    def setTestVarargs(value: (String | RegExp)*): Self = this.set("test", js.Array(value :_*))
    @scala.inline
    def setTest(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setWarningsFilter(
      value: (/* warning */ String, /* file */ String, /* source */ js.UndefOr[String]) => js.UndefOr[Boolean | Null]
    ): Self = this.set("warningsFilter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteWarningsFilter: Self = this.set("warningsFilter", js.undefined)
  }
  
}

