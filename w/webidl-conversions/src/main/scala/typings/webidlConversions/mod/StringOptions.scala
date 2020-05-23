package typings.webidlConversions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringOptions extends Options {
  var treatNullAsEmptyString: js.UndefOr[Boolean] = js.undefined
}

object StringOptions {
  @scala.inline
  def apply(
    context: String = null,
    globals: Globals = null,
    treatNullAsEmptyString: js.UndefOr[Boolean] = js.undefined
  ): StringOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(treatNullAsEmptyString)) __obj.updateDynamic("treatNullAsEmptyString")(treatNullAsEmptyString.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringOptions]
  }
}

