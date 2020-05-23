package typings.tape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available opts options for the tape function.
  */
trait TestOptions extends js.Object {
  var skip: js.UndefOr[Boolean] = js.undefined
   // true/false. Test will be allowed to fail.
  var timeout: js.UndefOr[Double] = js.undefined
   // true/false. See test.skip.
  var todo: js.UndefOr[Boolean] = js.undefined
}

object TestOptions {
  @scala.inline
  def apply(
    skip: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    todo: js.UndefOr[Boolean] = js.undefined
  ): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(todo)) __obj.updateDynamic("todo")(todo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
}

