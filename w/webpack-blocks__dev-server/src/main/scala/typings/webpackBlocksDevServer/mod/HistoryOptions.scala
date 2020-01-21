package typings.webpackBlocksDevServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryOptions extends js.Object {
  var disableDotRule: js.UndefOr[Boolean] = js.undefined
  var htmlAcceptHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var rewrites: js.UndefOr[RewritesObject] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object HistoryOptions {
  @scala.inline
  def apply(
    disableDotRule: js.UndefOr[Boolean] = js.undefined,
    htmlAcceptHeaders: js.Array[String] = null,
    index: String = null,
    rewrites: RewritesObject = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableDotRule)) __obj.updateDynamic("disableDotRule")(disableDotRule.asInstanceOf[js.Any])
    if (htmlAcceptHeaders != null) __obj.updateDynamic("htmlAcceptHeaders")(htmlAcceptHeaders.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (rewrites != null) __obj.updateDynamic("rewrites")(rewrites.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryOptions]
  }
}

