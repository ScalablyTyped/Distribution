package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  /** if true returns the repeat view (cached) data */
  var repeatView: js.UndefOr[scala.Boolean] = js.undefined
  /** the test run number for multiple runs tests (default: 1, first test) */
  var run: js.UndefOr[scala.Double] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(repeatView: js.UndefOr[scala.Boolean] = js.undefined, run: scala.Int | scala.Double = null): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(repeatView)) __obj.updateDynamic("repeatView")(repeatView)
    if (run != null) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions]
  }
}

