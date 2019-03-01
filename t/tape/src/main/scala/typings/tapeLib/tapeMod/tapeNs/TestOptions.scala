package typings
package tapeLib.tapeMod.tapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available opts options for the tape function.
  */
trait TestOptions extends js.Object {
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  		// See tape.skip.
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object TestOptions {
  @scala.inline
  def apply(skip: js.UndefOr[scala.Boolean] = js.undefined, timeout: scala.Int | scala.Double = null): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
}

