package typings.tape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available options for tape assertions.
  */
trait AssertOptions extends js.Object {
   // Allows the assertion to fail.
  var message: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[Boolean | String] = js.undefined
   // Skip the assertion. Can also be a message explaining why the test is skipped.
  var todo: js.UndefOr[Boolean | String] = js.undefined
}

object AssertOptions {
  @scala.inline
  def apply(message: String = null, skip: Boolean | String = null, todo: Boolean | String = null): AssertOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (todo != null) __obj.updateDynamic("todo")(todo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertOptions]
  }
}

