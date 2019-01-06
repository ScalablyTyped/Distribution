package typings
package terserDashWebpackDashPluginLib.terserDashWebpackDashPluginMod.TerserPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerserPluginOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.undefined
  var chunkFilter: js.UndefOr[
    js.Function1[/* chunk */ webpackLib.webpackMod.compilationNs.Chunk, scala.Boolean]
  ] = js.undefined
  var exclude: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  var extractComments: js.UndefOr[
    scala.Boolean | java.lang.String | stdLib.RegExp | ExtractCommentFn | ExtractCommentOptions
  ] = js.undefined
  var include: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, MinifyResult]] = js.undefined
  var parallel: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  var terserOptions: js.UndefOr[terserLib.terserMod.MinifyOptions] = js.undefined
  var test: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  var warningsFilter: js.UndefOr[js.Function2[/* warning */ js.Any, /* source */ js.Any, scala.Boolean]] = js.undefined
}

