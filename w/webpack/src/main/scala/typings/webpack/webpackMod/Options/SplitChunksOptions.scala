package typings.webpack.webpackMod.Options

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackMod.compilation.Chunk
import typings.webpack.webpackStrings.all
import typings.webpack.webpackStrings.async
import typings.webpack.webpackStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitChunksOptions extends js.Object {
  /** Override the default name separator (~) when generating names automatically (name: true)  */
  var automaticNameDelimiter: js.UndefOr[String] = js.undefined
  /** Assign modules to a cache group (modules from different cache groups are tried to keep in separate chunks) */
  var cacheGroups: js.UndefOr[
    `false` | String | (js.Function1[/* repeated */ js.Any, _]) | RegExp | (StringDictionary[CacheGroupsOptions | `false`])
  ] = js.undefined
  /** Select chunks for determining shared modules (defaults to \"async\", \"initial\" and \"all\" requires adding these chunks to the HTML) */
  var chunks: js.UndefOr[initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean])] = js.undefined
  /** Maximum number of requests which are accepted for on-demand loading */
  var maxAsyncRequests: js.UndefOr[Double] = js.undefined
  /** Maximum number of initial chunks which are accepted for an entry point */
  var maxInitialRequests: js.UndefOr[Double] = js.undefined
  /** Maximum size for the created chunk */
  var maxSize: js.UndefOr[Double] = js.undefined
  /** Minimum number of times a module has to be duplicated until it's considered for splitting */
  var minChunks: js.UndefOr[Double] = js.undefined
  /** Minimal size for the created chunk */
  var minSize: js.UndefOr[Double] = js.undefined
  /** Give chunks created a name (chunks with equal name are merged) */
  var name: js.UndefOr[Boolean | String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object SplitChunksOptions {
  @scala.inline
  def apply(
    automaticNameDelimiter: String = null,
    cacheGroups: `false` | String | (js.Function1[/* repeated */ js.Any, _]) | RegExp | (StringDictionary[CacheGroupsOptions | `false`]) = null,
    chunks: initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean]) = null,
    maxAsyncRequests: Int | Double = null,
    maxInitialRequests: Int | Double = null,
    maxSize: Int | Double = null,
    minChunks: Int | Double = null,
    minSize: Int | Double = null,
    name: Boolean | String | (js.Function1[/* repeated */ js.Any, _]) = null
  ): SplitChunksOptions = {
    val __obj = js.Dynamic.literal()
    if (automaticNameDelimiter != null) __obj.updateDynamic("automaticNameDelimiter")(automaticNameDelimiter.asInstanceOf[js.Any])
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

