package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEventInit extends EventInit {
  var colno: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var lineno: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object ErrorEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    colno: Int | Double = null,
    error: js.Any = null,
    filename: String = null,
    lineno: Int | Double = null,
    message: String = null
  ): ErrorEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (colno != null) __obj.updateDynamic("colno")(colno.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (lineno != null) __obj.updateDynamic("lineno")(lineno.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventInit]
  }
}

