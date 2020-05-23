package typings.webpack.mod.Options

import typings.std.RegExp
import typings.webpack.mod.compilation.Chunk
import typings.webpack.webpackStrings.all
import typings.webpack.webpackStrings.async
import typings.webpack.webpackStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheGroupsOptions extends js.Object {
  /** Select chunks for determining cache group content (defaults to \"initial\", \"initial\" and \"all\" requires adding these chunks to the HTML) */
  var chunks: js.UndefOr[initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean])] = js.undefined
  /** Ignore minimum size, minimum chunks and maximum requests and always create chunks for this cache group */
  var enforce: js.UndefOr[Boolean] = js.undefined
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
  /** Priority of this cache group */
  var priority: js.UndefOr[Double] = js.undefined
  /** Try to reuse existing chunk (with name) when it has matching modules */
  var reuseExistingChunk: js.UndefOr[Boolean] = js.undefined
  /** Assign modules to a cache group */
  var test: js.UndefOr[(js.Function1[/* repeated */ js.Any, Boolean]) | String | RegExp] = js.undefined
}

object CacheGroupsOptions {
  @scala.inline
  def apply(
    chunks: initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean]) = null,
    enforce: js.UndefOr[Boolean] = js.undefined,
    maxAsyncRequests: js.UndefOr[Double] = js.undefined,
    maxInitialRequests: js.UndefOr[Double] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    minChunks: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    name: Boolean | String | (js.Function1[/* repeated */ js.Any, _]) = null,
    priority: js.UndefOr[Double] = js.undefined,
    reuseExistingChunk: js.UndefOr[Boolean] = js.undefined,
    test: (js.Function1[/* repeated */ js.Any, Boolean]) | String | RegExp = null
  ): CacheGroupsOptions = {
    val __obj = js.Dynamic.literal()
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (!js.isUndefined(enforce)) __obj.updateDynamic("enforce")(enforce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAsyncRequests)) __obj.updateDynamic("maxAsyncRequests")(maxAsyncRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInitialRequests)) __obj.updateDynamic("maxInitialRequests")(maxInitialRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minChunks)) __obj.updateDynamic("minChunks")(minChunks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseExistingChunk)) __obj.updateDynamic("reuseExistingChunk")(reuseExistingChunk.get.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheGroupsOptions]
  }
}

