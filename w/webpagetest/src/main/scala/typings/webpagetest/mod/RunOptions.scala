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
  def apply(repeatView: js.UndefOr[Boolean] = js.undefined, run: js.UndefOr[Double] = js.undefined): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(repeatView)) __obj.updateDynamic("repeatView")(repeatView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(run)) __obj.updateDynamic("run")(run.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions]
  }
}

