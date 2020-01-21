package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  /** if true returns the repeat view (cached) data */
  var repeatView: js.UndefOr[Boolean] = js.undefined
  /** the test run number for multiple runs tests (default: 1, first test) */
  var run: js.UndefOr[Double] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(repeatView: js.UndefOr[Boolean] = js.undefined, run: Int | Double = null): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(repeatView)) __obj.updateDynamic("repeatView")(repeatView.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions]
  }
}

