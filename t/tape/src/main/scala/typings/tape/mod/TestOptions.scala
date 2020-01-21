package typings.tape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available opts options for the tape function.
  */
trait TestOptions extends js.Object {
  var skip: js.UndefOr[Boolean] = js.undefined
  		// See tape.skip.
  var timeout: js.UndefOr[Double] = js.undefined
}

object TestOptions {
  @scala.inline
  def apply(skip: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
}

