package typings
package webpackLib.webpackMod.webpackNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitChunksOptions extends js.Object {
  /** Override the default name separator (~) when generating names automatically (name: true)  */
  var automaticNameDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /** Assign modules to a cache group (modules from different cache groups are tried to keep in separate chunks) */
  var cacheGroups: js.UndefOr[
    webpackLib.webpackLibNumbers.`false` | java.lang.String | (js.Function1[/* repeated */ js.Any, _]) | stdLib.RegExp | (org.scalablytyped.runtime.StringDictionary[CacheGroupsOptions | webpackLib.webpackLibNumbers.`false`])
  ] = js.undefined
  /** Select chunks for determining shared modules (defaults to \"async\", \"initial\" and \"all\" requires adding these chunks to the HTML) */
  var chunks: js.UndefOr[
    webpackLib.webpackLibStrings.initial | webpackLib.webpackLibStrings.async | webpackLib.webpackLibStrings.all | (js.Function1[/* chunk */ webpackLib.webpackMod.webpackNs.compilationNs.Chunk, scala.Boolean])
  ] = js.undefined
  /** Maximum number of requests which are accepted for on-demand loading */
  var maxAsyncRequests: js.UndefOr[scala.Double] = js.undefined
  /** Maximum number of initial chunks which are accepted for an entry point */
  var maxInitialRequests: js.UndefOr[scala.Double] = js.undefined
  /** Maximum size for the created chunk */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of times a module has to be duplicated until it's considered for splitting */
  var minChunks: js.UndefOr[scala.Double] = js.undefined
  /** Minimal size for the created chunk */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /** Give chunks created a name (chunks with equal name are merged) */
  var name: js.UndefOr[scala.Boolean | java.lang.String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object SplitChunksOptions {
  @scala.inline
  def apply(
    automaticNameDelimiter: java.lang.String = null,
    cacheGroups: webpackLib.webpackLibNumbers.`false` | java.lang.String | (js.Function1[/* repeated */ js.Any, _]) | stdLib.RegExp | (org.scalablytyped.runtime.StringDictionary[CacheGroupsOptions | webpackLib.webpackLibNumbers.`false`]) = null,
    chunks: webpackLib.webpackLibStrings.initial | webpackLib.webpackLibStrings.async | webpackLib.webpackLibStrings.all | (js.Function1[/* chunk */ webpackLib.webpackMod.webpackNs.compilationNs.Chunk, scala.Boolean]) = null,
    maxAsyncRequests: scala.Int | scala.Double = null,
    maxInitialRequests: scala.Int | scala.Double = null,
    maxSize: scala.Int | scala.Double = null,
    minChunks: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    name: scala.Boolean | java.lang.String | (js.Function1[/* repeated */ js.Any, _]) = null
  ): SplitChunksOptions = {
    val __obj = js.Dynamic.literal()
    if (automaticNameDelimiter != null) __obj.updateDynamic("automaticNameDelimiter")(automaticNameDelimiter)
    if (cacheGroups != null) __obj.updateDynamic("cacheGroups")(cacheGroups.asInstanceOf[js.Any])
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (maxAsyncRequests != null) __obj.updateDynamic("maxAsyncRequests")(maxAsyncRequests.asInstanceOf[js.Any])
    if (maxInitialRequests != null) __obj.updateDynamic("maxInitialRequests")(maxInitialRequests.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minChunks != null) __obj.updateDynamic("minChunks")(minChunks.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitChunksOptions]
  }
}

